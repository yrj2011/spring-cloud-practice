package com.github.charlesvhe.springcloud.practice.provider;

import com.github.charlesvhe.springcloud.practice.provider.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by charles on 2017/5/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider2Application {
    public static void main(String[] args) {
        System.setProperty("server.port","18082");
        UserController.appName="app2";
        SpringApplication.run(Provider2Application.class, args);
    }

}
