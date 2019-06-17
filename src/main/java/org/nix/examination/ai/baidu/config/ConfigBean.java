package org.nix.examination.ai.baidu.config;

import com.baidu.aip.imagesearch.AipImageSearch;
import com.baidu.aip.ocr.AipOcr;
import org.nix.examination.ai.baidu.AipImageSearchJava;
import org.nix.examination.ai.baidu.AipOcrJava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    /**
     * @return 文字识别
     */
    @Bean
    public AipOcr aipOcr() {
        return new AipOcrJava();
    }

    /**
     * @return 相同图片、相似图片、图片类别识别等
     */
    @Bean
    public AipImageSearch aipImageSearch() {
        return new AipImageSearchJava();
    }


}
