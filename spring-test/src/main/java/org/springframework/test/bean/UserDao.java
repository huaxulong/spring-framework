package org.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: <p></p>
 * @author: DongxuHua
 * @create: at 2021-09-22 4:27 下午
 * @version: 1.0.0
 * @history: modify history             <desc>
 */
public class UserDao {

	private Map<String, String> hashMap = new HashMap<>();

	public void initDataMethod(){
		System.out.println("执行：init-method");
		hashMap.put("10001", "小傅哥");
		hashMap.put("10002", "翔子哥");
		hashMap.put("10003", "阿毛");
	}

	public void destroyDataMethod(){
		System.out.println("执行：destroy-method");
		hashMap.clear();
	}

	public String queryUserName(String uId) {
		return hashMap.get(uId);
	}

	public void setUsers(Map<String,String> map) {
		this.hashMap = map;
	}

	public void editUser(String key, String value) {
		if (hashMap.containsKey(key)) {
			hashMap.replace(key, value);
			return;
		}
		hashMap.put(key, value);
	}
}
