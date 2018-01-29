package com.senpure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 罗中正 on 2017/12/18 0018.
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaBoot {


    public static void main(String[] args) {


        SpringApplication.run(EurekaBoot.class, args);

    }
}
