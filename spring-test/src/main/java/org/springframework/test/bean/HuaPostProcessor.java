package org.springframework.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-10-12 3:46 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */

/**
 * 自定义后置处理器
 */
public class HuaPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		if ("userDao".equals(beanName)) {
			UserDao userDao = (UserDao)bean;
			userDao.editUser("10002", "华翔1号");
		}
		System.out.println("后置处理器处理bean=【"+beanName+"】开始");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("userDao".equals(beanName)) {
			UserDao userDao = (UserDao)bean;
			userDao.editUser("10002", "华翔2号");
		}
		System.out.println("后置处理器处理bean=【"+beanName+"】开始");
		return bean;
	}

}
