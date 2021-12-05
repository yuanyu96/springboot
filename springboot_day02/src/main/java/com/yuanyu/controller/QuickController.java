package com.yuanyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanyu
 * @title: QuickController
 * @description: TODO
 * @date 2021/5/4 11:37
 */
@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quick(){

        return "Hello world hahah";

    }
}
