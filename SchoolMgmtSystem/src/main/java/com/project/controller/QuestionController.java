package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.QuestionOperation;
import com.project.model.Questions;
import com.project.model.Users;

@RestController
public class QuestionController {
	
	QuestionOperation questionOperation=new QuestionOperation();
		
	@PostMapping("/insertQue")
	public String addUser(@RequestBody Questions que) 
	{
		System.out.println(que);
		return (questionOperation.insertQuestion(que));
		
	}
	
	@GetMapping("/getQuestions")
	public String showQuestions() 
	{
		System.out.println();
		return (questionOperation.getQuestion());
		
	}
}
