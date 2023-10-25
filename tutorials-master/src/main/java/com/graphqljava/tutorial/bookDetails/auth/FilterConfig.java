package com.graphqljava.tutorial.bookDetails.auth;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<BasicAuthFilter> loggingFilter(){
        FilterRegistrationBean<BasicAuthFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new BasicAuthFilter());
        registrationBean.addUrlPatterns("/graphql");

        return registrationBean;    
    }
}
