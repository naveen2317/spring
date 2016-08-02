package com.envy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.envy.hello.Hello;
import com.envy.hello.impl.HelloImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="hello")
    public Hello helloWorld() {
        return new HelloImpl();
    }
		
}
