package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answers {
	@Id
	private int aid;
	@ManyToOne
	@JoinColumn(name="que_id")
	private Questions question;
	private String content;
	private boolean correct;
	
	public Answers() {
		// TODO Auto-generated constructor stub
	}

	public Answers(int aid, Questions question, String content, boolean correct) {
		super();
		this.aid = aid;
		this.question = question;
		this.content = content;
		this.correct = correct;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	@Override
	public String toString() {
		return "Answers [aid=" + aid + ", question=" + question + ", content=" + content + ", correct=" + correct + "]";
	}
	
	
	
	
	
}
