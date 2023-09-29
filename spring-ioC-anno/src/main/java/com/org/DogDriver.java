package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DogDriver {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Dog d = (Dog) ac.getBean("dog");
		System.out.println(d);
		AbstractApplicationContext aac = (AbstractApplicationContext) ac;
	}
}
