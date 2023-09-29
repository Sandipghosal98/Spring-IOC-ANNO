package com.org;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Dog {

	static {
		System.out.println("class loading");
	}
	{
		System.out.println("object loading");
	}
	
	@PostConstruct
	
	public void init() {
		System.out.println("init-method");
	}
	
	@PreDestroy
	
	public void destroy() {
		System.out.println("destroy-method");
	}
}
