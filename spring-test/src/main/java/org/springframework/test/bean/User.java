package org.springframework.test.bean;

import java.io.Serializable;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-09-22 4:27 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class User{

	private String userNo;

	private String userName;

	public User() {
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User{" +
				"userNo='" + userNo + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
