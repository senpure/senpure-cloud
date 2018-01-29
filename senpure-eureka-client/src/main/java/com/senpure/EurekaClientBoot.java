package com.senpure;

import com.senpure.base.spring.BaseController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 罗中正 on 2017/12/20 0020.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientBoot extends BaseController implements ApplicationContextAware {


    @Value("${server.port}")
    private String port;

    @RequestMapping(value = {"","/home"})
    public String home(HttpServletRequest request) {
        return applicationContext.getId();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientBoot.class,args);
    }

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.debug("设置应用上下文{}", applicationContext);
        logger.debug("name{} , {}",applicationContext.getApplicationName(),applicationContext.getDisplayName());
        this.applicationContext = applicationContext;
    }
}
