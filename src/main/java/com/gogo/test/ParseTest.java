package com.gogo.test;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class ParseTest {

	private static class UserInfo implements Serializable {
		private String name;
		private int age;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {
		String text = "{\"name\":\"chenggang\",\"age\":24}";
		Object obj = JSON.parseObject(text, UserInfo.class);
		System.out.println(obj);
	}

}
