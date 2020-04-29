package com.hgcode.wtboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer {

    /*public void addInterceptors(InterceptorRegistry registry) {
        // kisso 拦截器配置
        registry.addInterceptor(new SSOSpringInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
    }*/
}

