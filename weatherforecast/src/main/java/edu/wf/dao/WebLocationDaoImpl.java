package edu.wf.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;

import edu.wf.model.Location;
import edu.wf.utils.WebApiConnector;

@Repository
public class WebLocationDaoImpl implements WebLocationDao {

	@Override
	public List<Location> getWebLocation(String city) {
		String urlString = "https://geoapi.heweather.net/v2/city/lookup?&location=" + city;

		List<Location> locations = new ArrayList<>();
		String json = WebApiConnector.connect(urlString);
		// json字符串转java对象
		Map<String, Object> map = JSON.parseObject(json);
		//System.out.println(json);
		if ("404".equals(map.get("code"))) {
			return locations;
		}
		List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("location");
		for (Map<String, Object> temp : list) {
			Location location = new Location();
			location.setLocationId((String) temp.get("id"));
			location.setName((String) temp.get("name"));
			location.setAdm1((String) temp.get("adm1"));
			location.setAdm2((String) temp.get("adm2"));
			location.setCountry((String) temp.get("country"));
			location.setLat(Double.parseDouble((String) temp.get("lat")));
			location.setLon(Double.parseDouble((String) temp.get("lon")));
			locations.add(location);
		}

		return locations;
	}

}
