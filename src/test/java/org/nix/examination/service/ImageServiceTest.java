package org.nix.examination.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nix.examination.ExaminationApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.io.File;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExaminationApplication.class)
public class ImageServiceTest {

    @Resource
    private ImageService imageService;

    @Test
    public void similarAddImage() {
        JSONObject jsonObject = imageService.similarAddImage(FileUtil.readBytes(getFile("安全键盘.jpg")));
        System.out.println(jsonObject);
    }

    @Test
    public void similarSearchImage() {
        JSONObject jsonObject = imageService.similarSearchImage(FileUtil.readBytes(getFile("安全键盘.jpg")));
        System.out.println(jsonObject);
    }

    private File getFile(String name){
        String basePath = "D:\\work\\ui-examination\\src\\doc\\test\\"+name;
        return new File(basePath);
    }
}