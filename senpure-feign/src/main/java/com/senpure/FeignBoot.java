package com.senpure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by 罗中正 on 2017/12/20 0020.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignBoot {

    public static void main(String[] args) {

        SpringApplication.run(FeignBoot.class, args);
    }
}
