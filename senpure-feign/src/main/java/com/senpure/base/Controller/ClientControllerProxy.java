/**
 * Created by 罗中正 on 2017/12/20 0020.
 */
package com.senpure.base.Controller;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface ClientControllerProxy {


    @RequestMapping("/home")
    public String home() ;

    @RequestMapping("/home")
    public String home2() ;
}
