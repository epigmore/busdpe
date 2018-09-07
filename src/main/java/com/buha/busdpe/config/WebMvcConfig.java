package com.buha.busdpe.config;

import com.buha.busdpe.base.filter.ContextParamPresetFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public FilterRegistrationBean contextParamSetterFilter() {
        FilterRegistrationBean myFilter = new FilterRegistrationBean();
        myFilter.addUrlPatterns("/*");
        myFilter.setFilter(new ContextParamPresetFilter());
        return myFilter;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/","classpath:/resources/", "classpath:/static/", "classpath:/public/");
        //registry.addResourceHandler("/views/**").addResourceLocations("classpath:/static/main/");
        // 指到 webapp 目录下
        //registry.addResourceHandler("/assets/**").addResourceLocations("/webapp/assets/");
        registry.addResourceHandler("/**").addResourceLocations("/");

    }
}
