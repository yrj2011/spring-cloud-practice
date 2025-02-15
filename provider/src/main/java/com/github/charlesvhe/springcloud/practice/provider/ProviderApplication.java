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
public class ProviderApplication {
    public static void main(String[] args) {
        System.setProperty("server.port","18081");
        UserController.appName="app1";
        SpringApplication.run(ProviderApplication.class, args);
    }

}
