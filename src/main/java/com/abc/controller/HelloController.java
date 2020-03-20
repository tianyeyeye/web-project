package com.abc.controller;

import com.hello.ShowPropertiesService;
import com.hello.config.HelloProperties;
import com.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired(required = false)
    private ShowPropertiesService showPropertiesService;

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{userName}")
    public String hello(Model model, @PathVariable(value = "userName", required = false) String userName) {
        model.addAttribute("hello", StringUtils.isEmpty(userName) ? "Hello World" : userName);
        return "hello";
    }

    @GetMapping("/showProperties")
    @ResponseBody
    public HelloProperties showProperties() {
        return showPropertiesService.show();
//        return helloService.getHelloProperties();
    }

}
