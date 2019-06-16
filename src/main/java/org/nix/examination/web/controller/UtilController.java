package org.nix.examination.web.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping(value = "/utils")
public class UtilController {

    @GetMapping(value = "/ping")
    public String ping(HttpServletRequest request) {
        return StrUtil.format("ping from ip:{} currTime:{} status:success", request.getRemoteAddr(), DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:SS"));
    }

}
