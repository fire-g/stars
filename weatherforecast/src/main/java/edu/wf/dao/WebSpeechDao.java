package edu.wf.dao;

import org.springframework.stereotype.Repository;

public interface WebSpeechDao {
	//将str字符串转为语音数据
	public byte[] getSpeechDate(String str);
}
