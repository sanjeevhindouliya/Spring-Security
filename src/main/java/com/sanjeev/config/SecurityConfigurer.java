package com.sanjeev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		
		System.out.println("security method call...........");
		
		http.authorizeHttpRequests((req) -> 
		req.antMatchers("/contact" , "/logincheck", "/swagger-ui.html")
		.permitAll()
		.anyRequest()
		.authenticated()	
				).formLogin();
		

		return http.build();
		
	}

}
