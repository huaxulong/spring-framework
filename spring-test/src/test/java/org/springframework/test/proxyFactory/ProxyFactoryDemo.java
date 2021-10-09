package org.springframework.test.proxyFactory;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-09-27 5:45 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class ProxyFactoryDemo {
	public static void main(String[] args) {
		Animal catTarget = new Cat();

		ProxyFactory factory = new ProxyFactory(catTarget);


	}
}
