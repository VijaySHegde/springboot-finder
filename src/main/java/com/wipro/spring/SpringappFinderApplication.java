package com.wipro.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringappFinderApplication extends ServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringappFinderApplication.class, args);
	}
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(SpringappFinderApplication.class);
	  }

}
