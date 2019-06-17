package org.nix.examination.ai.baidu;


import com.baidu.aip.imagesearch.AipImageSearch;


public class AipImageSearchJava extends AipImageSearch {

    public static final String APP_ID = "16538948";
    public static final String API_KEY = "fxgLPf6RsMCYaAAekoUGoPDG";
    public static final String SECRET_KEY = "OYuWYfix0kO16IRzw1YkXtk7nAmq3iG0";

    public AipImageSearchJava() {
        super(APP_ID, API_KEY, SECRET_KEY);
        setConnectionTimeoutInMillis(2000);
        setSocketTimeoutInMillis(60000);
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
    }
}
