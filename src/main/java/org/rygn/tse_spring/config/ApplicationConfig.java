package org.rygn.tse_spring.config;

import org.rygn.tse_spring.components.Owl;
import org.rygn.tse_spring.interfaces.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.rygn.tse_spring")
public class ApplicationConfig {
	
	@Bean
	public Bird bird() {
		
		return new Owl();
	}
}
