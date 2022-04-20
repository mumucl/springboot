package com.example.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Slf4j
@Controller
public class MainController {
    @RequestMapping("/login")
    public String login(){
        log.info("有人访问了Login页面");
        return "login";
    }

    //直接访问http://localhost:8080/index即可，不用加web应用程序名称了
    @RequestMapping("/index")
    public String index(){
        return "index";
    }




}
