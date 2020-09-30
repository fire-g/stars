package edu.wf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.wf.dao.WebSpeechDao;

@Service
public class WeatherBroadcastServiceImpl implements WeatherBroadcastService {
	@Autowired
	WebSpeechDao webSpeechDao;
	
	@Override
	public byte[] getWeatherBroadcastService(String str) {	
		return webSpeechDao.getSpeechDate(str);
	}

}
