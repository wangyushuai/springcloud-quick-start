package com.example.springcloud.frontpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 上传文件Demo
 * @author wangyushuai2@jd.com
 * @date 2019/4/19
 */
@Controller
@RequestMapping("/v1")
public class UploadController {

    @GetMapping("/index")
    public String uploadPage() {
        return "";
    }
}
