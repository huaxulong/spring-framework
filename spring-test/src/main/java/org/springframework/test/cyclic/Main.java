package org.springframework.test.cyclic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-10-09 2:44 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

		StudentA studentA = (StudentA)applicationContext.getBean("studentA");
		System.out.println("studentA : " + studentA + "    ");
		studentA.query();

		StudentB studentB = (StudentB)applicationContext.getBean("studentB");
		System.out.println("studentB : " + studentB + "    ");
		studentB.query();
	}


}
