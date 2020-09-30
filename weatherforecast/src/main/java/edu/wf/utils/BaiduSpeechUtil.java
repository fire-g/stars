package edu.wf.utils;

import org.json.JSONObject;

import com.baidu.aip.speech.AipSpeech;
import com.baidu.aip.speech.TtsResponse;

public class BaiduSpeechUtil {
    //设置APPID/AK/SK
	private static final String APP_ID = "11013135";
    private static final String API_KEY = "XMzLnultEHv9YwdtLtsCiFPq";
    private static final String SECRET_KEY = "df026520204d0c56fc8f8e7bc5b2405a";
    
	private volatile static BaiduSpeechUtil baiduSpeechUtil = null;
    
    private BaiduSpeechUtil() {}
    
    public BaiduSpeechUtil getInstance() {
    	if (baiduSpeechUtil == null) {
    		synchronized (BaiduSpeechUtil.class) {
    			if (baiduSpeechUtil == null) {
    				baiduSpeechUtil = new BaiduSpeechUtil();
    			}
    		}
    	}
    	
    	return baiduSpeechUtil;
    }
    
    public static byte[] getVoiceData(String str) {
        // 初始化一个AipSpeech
        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        //client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        TtsResponse res = client.synthesis(str, "zh", 1, null);
        byte[] data = res.getData();
        JSONObject res1 = res.getResult();
        
        if (res1 != null) {
            System.out.println("1" + res1.toString(2));
        }
        
        return data;
    }
}