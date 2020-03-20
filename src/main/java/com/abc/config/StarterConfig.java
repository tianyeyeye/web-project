package com.abc.config;

import com.hello.ShowPropertiesService;
import com.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfig {

    @Bean
    public ShowPropertiesService showPropertiesService(HelloService helloService) {
        ShowPropertiesService show = new ShowPropertiesService();
        show.setHelloService(helloService);
        return show;
    }

}
