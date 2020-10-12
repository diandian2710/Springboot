package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication : 标注这个类是springboot的应用
@SpringBootApplication
public class Springboot01HelloworldApplication {

    //将Springboot启动
    public static void main(String[] args) {
        //springApplication 类
        //run 方法
        SpringApplication.run(Springboot01HelloworldApplication.class, args);
    }

}
