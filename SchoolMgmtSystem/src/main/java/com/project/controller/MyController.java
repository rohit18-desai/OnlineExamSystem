package com.project.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.UsersOperation;
import com.project.model.Users;

@RestController
public class MyController {

	UsersOperation operation = new UsersOperation();

	@GetMapping("/home")
	public String home() {
		return "Home Page...";
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello World welcome";
	}

	@PostMapping("/insert")
	public String addUser(@RequestBody Users user) {
		System.out.println(user);
		return (operation.createUser(user));

	}

	@GetMapping(value = "getValue/{id}")
	public Users getDataByID(@PathVariable("id") Integer uid) {
		System.out.println(uid);
		return operation.getByID(uid);
	}
	
	@DeleteMapping(value = "deleteUser/{id}")
	public String deleteUserByID(@PathVariable("id") Integer uid) {
		System.out.println(uid);
		return (operation.deleteUserByID(uid));
	}
	
	

	@GetMapping(value = "/login")
	public Users login(@RequestBody Users user) throws Exception {
		String uname = user.getUsername();
		String upass = user.getPassword();
		System.out.println(uname+" "+upass);
		Users tempObj=null;

		if (uname != null && upass != null) {
			tempObj=operation.login(uname, upass);
		}
		if(tempObj==null) {
			throw new Exception("Bad Creditials....");
		}
		return tempObj;
	}

}
