package org.springframework.test.demoaop;

public class TestImpl implements TestInterface{
	@Override
	public void dosomeTest() {
		System.out.println("dosomeTest function execute");
	}

	@Override
	public void doOtherTest() {
		System.out.println("doOtherTest function execute");
	}

	@Override
	public void a() {
		System.out.println("a function execute");
	}

	@Override
	public void b() {
		System.out.println("b function execute");
	}
}
