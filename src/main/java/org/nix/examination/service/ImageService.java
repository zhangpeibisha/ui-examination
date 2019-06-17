package org.nix.examination.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.imagesearch.AipImageSearch;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * 图片识别和搜索相关的服务
 */
@Service
public class ImageService {

    @Resource
    private AipImageSearch aipImageSearch;

    /**
     * 上传比较文件进入相似图片比较中
     *
     * @param libraryImage 文件byte
     * @return 处理结果，包含了处理id和图片签名
     */
    public JSONObject similarAddImage(byte[] libraryImage) {
        HashMap<String, String> options = new HashMap<>();
        options.put("brief", "{\"name\":\"周杰伦\", \"id\":\"666\"}");
        options.put("tags", "100,11");

        String result = aipImageSearch.similarAdd(libraryImage, options).toString();
        return JSON.parseObject(result);
    }

    /**
     * 查看该图片是否有相似的
     *
     * @param comparisonImage 参与和库里面比较的图片
     * @return 结果
     */
    public JSONObject similarSearchImage(byte[] comparisonImage) {
        HashMap<String, String> options = new HashMap<>();
//        options.put("tags", "100,11");
//        options.put("tag_logic", "0");
//        options.put("pn", "100");
//        options.put("rn", "250");
        String result = aipImageSearch.similarSearch(comparisonImage, options).toString();
        return JSON.parseObject(result);
    }

}
