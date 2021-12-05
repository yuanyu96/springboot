package com.yuanyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author yuanyu
 * @title: MySpringbootApplication
 * @description: TODO
 * @date 2021/5/4 10:56
 */
//声明该类是springboot引导类
@SpringBootApplication
public class MySpringbootApplication {
    //java程序的入口
    public static void main(String[] args) {
        //运行springboot引导类，run参数 是springboot引导类的字节码文件
        SpringApplication.run(MySpringbootApplication.class);
    }

}
