package com.andre.isidoro.spring_rest_demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.andre.isidoro.spring_rest_demo")
public class DemoAppConfig {

}
