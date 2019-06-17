package org.nix.examination.ai.baidu;

import com.baidu.aip.ocr.AipOcr;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文字识别配置
 */

public class AipOcrJava extends AipOcr {

    /**
     * 设置APPID/AK/SK
     */
    private static final String APP_ID = "16522909";
    private static final String API_KEY = "I08M3nGYbbio3zuzEvwGpWYz";
    private static final String SECRET_KEY = "U685ubpjHwlVDmOK81Pk97plsxuw8dRO";

    public AipOcrJava() {
        super(APP_ID, API_KEY, SECRET_KEY);
        setConnectionTimeoutInMillis(2000);
        setSocketTimeoutInMillis(60000);
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
    }


}
