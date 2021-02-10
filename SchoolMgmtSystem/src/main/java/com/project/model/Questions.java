package com.project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Questions {
	@Id
	@JoinColumn(name = "que_id")
	private int qid;
	private String ques;
	private String finalans;
	@OneToMany(mappedBy = "question")
	private Set<Answers> ans = new HashSet<Answers>();

	public Questions() {
		// TODO Auto-generated constructor stub
	}

	public Questions(int qid, String ques, String finalans, Set<Answers> ans) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.finalans = finalans;
		this.ans = ans;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public Set<Answers> getAns() {
		return ans;
	}

	public void setAns(Set<Answers> ans) {
		this.ans = ans;
	}

	public String getFinalans() {
		return finalans;
	}

	public void setFinalans(String finalans) {
		this.finalans = finalans;
	}

	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", ques=" + ques + ", finalans=" + finalans + ", ans=" + ans + "]";
	}

}
