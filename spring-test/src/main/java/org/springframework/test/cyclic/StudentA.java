package org.springframework.test.cyclic;

/**
 * @description: 学生A
 * <p></p>
 * @author: DongxuHua
 * @create: at 2021-10-09 2:40 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class StudentA {

	private StudentA studentB;

	public StudentA getStudentB() {
		return studentB;
	}

	public void setStudentB(StudentA studentB) {
		this.studentB = studentB;
	}

	public void query() {
		System.out.println("我已经拥有StudentB 的实例了 : " + studentB);
	}

}
