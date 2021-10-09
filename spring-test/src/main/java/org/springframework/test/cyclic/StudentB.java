package org.springframework.test.cyclic;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-10-09 2:40 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class StudentB {

	private StudentA studentA;

	public StudentA getStudentA() {
		return studentA;
	}

	public void setStudentA(StudentA studentA) {
		this.studentA = studentA;
	}

	public void query() {
		System.out.println("我已经拥有StudentA 的实例了 : " + studentA);
	}
}
