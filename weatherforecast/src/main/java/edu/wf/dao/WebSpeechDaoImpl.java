package edu.wf.dao;

import org.springframework.stereotype.Repository;

import edu.wf.utils.BaiduSpeechUtil;

@Repository
public class WebSpeechDaoImpl implements WebSpeechDao {

	@Override
	public byte[] getSpeechDate(String str) {
		return BaiduSpeechUtil.getVoiceData(str);
	}

}
