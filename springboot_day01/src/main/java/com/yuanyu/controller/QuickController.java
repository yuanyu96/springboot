package com.yuanyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author yuanyu
 * @title: QuickController
 * @description: TODO
 * @date 2021/5/4 11:07
 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "hello  world !!!";
    }
}
