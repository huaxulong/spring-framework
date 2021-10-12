package org.springframework.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.UserDao;

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
		UserDao user = (UserDao)applicationContext.getBean("user");

		user.queryUserName("10002");

		System.out.println("user : " + user.toString());
	}

}
