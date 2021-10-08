package org.springframework.test.demoaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop-test.xml");

		TestInterface test = (TestInterface) applicationContext.getBean("test");

		test.dosomeTest();

		System.out.println("------  -----------------");

		test.doOtherTest();

		System.out.println("-----------------------------------");

		test.a();

		System.out.println("-----------------------------------");

		test.b();
	}

}
