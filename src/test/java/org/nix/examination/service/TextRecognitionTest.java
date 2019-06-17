package org.nix.examination.service;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nix.examination.ExaminationApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExaminationApplication.class)
public class TextRecognitionTest {

    @Resource
    private TextRecognition textRecognition;

    @Test
    public void textRecognition() {
        JSONObject jsonObject = textRecognition.textRecognition(FileUtil.readBytes("D:\\图片\\键盘.jpg"));
        System.out.println(jsonObject);
    }

    @Test
    public void securityKeyRecognition() {
        JSONObject jsonObject = textRecognition.textRecognition(FileUtil.readBytes("D:\\图片\\安全键盘.jpg"));
        System.out.println(jsonObject);
    }

}