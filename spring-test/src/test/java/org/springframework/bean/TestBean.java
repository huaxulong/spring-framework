package org.springframework.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.User;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-09-22 4:34 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class TestBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		User user = (User)applicationContext.getBean("user");

		System.out.println("user : " + user.toString());
	}

}
