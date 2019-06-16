package org.nix.examination.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * 文字识别
 */
@Service
public class TextRecognition {

    @Resource
    private AipOcr aipOcr;

    public JSONObject textRecognition(byte[] fileByte) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");
        options.put("detect_direction", "true");
        options.put("vertexes_location", "true");
        options.put("probability", "true");

        String res = aipOcr.accurateGeneral(fileByte, options).toString();
        return JSON.parseObject(res);
    }


}
