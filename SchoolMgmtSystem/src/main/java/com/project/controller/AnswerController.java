package com.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.AnswerOperation;
import com.project.model.Answers;

@RestController
public class AnswerController {
	
	
	AnswerOperation answerOperation=new AnswerOperation();
	
	@PostMapping("/insertAns")
	public String addUser(@RequestBody Answers ans) 
	{
		System.out.println(ans);
		return (answerOperation.insertAnswer(ans));
		
	}
}
