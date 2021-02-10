package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	private int uid;
	private String username;
	private String password;
	private int age;
	private String email;
	private String role;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(int uid, String username, String password, int age, String email, String role) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.age = age;
		this.email = email;
		this.role = role;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", username=" + username + ", password=" + password + ", age=" + age + ", email="
				+ email + ", role=" + role + "]";
	}

}
