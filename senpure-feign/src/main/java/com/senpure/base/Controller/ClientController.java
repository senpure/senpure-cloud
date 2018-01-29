package com.senpure.base.Controller;

import com.senpure.base.spring.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 罗中正 on 2017/12/20 0020.
 */
@RestController
public class ClientController extends BaseController {

    @Autowired
    ClientControllerProxy proxy;

    @RequestMapping("")
    public String home() {


        return  proxy.home();
    }

    @RequestMapping("/hi")
    public String home2() {

        return  proxy.home2();
    }
}
