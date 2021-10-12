package org.springframework.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @description: UserServiceImpl
 * <p></p>
 * @author: DongxuHua
 * @create: at 2021-10-12 10:16 上午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class UserService implements BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

	private ApplicationContext applicationContext;

	private BeanFactory beanFactory;

	private UserDao userDao;

	private String uId;
	private String company;
	private String location;


	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("ClassLoader：" + classLoader);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
