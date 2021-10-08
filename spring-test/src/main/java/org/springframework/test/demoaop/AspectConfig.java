package org.springframework.test.demoaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectConfig {

	/**
	 * 切点位置： org.springframework.test.   包下的所有的class 的所有 test结尾的方法。
	 */
	@Pointcut(value = "execution(* org.springframework.test.demoaop..*.*Test(..))")
	public void test(){

	}

	@Before(value = "test()")
	public void beforeAdvice(){
		System.out.println("before advice");
	}

	@After(value = "test()")
	public void afterAdvice() {
		System.out.println("after advice");
	}

	/**
	 * 定义一个环绕通知
	 * @param joinPoint
	 */
	@Around(value = "execution(* org.springframework.test.demoaop..*.*Test(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		Object proceed = null;
		try {
			System.out.println("around before advice");
			proceed = joinPoint.proceed();
			System.out.println("around after advice");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return proceed;
	}

}
