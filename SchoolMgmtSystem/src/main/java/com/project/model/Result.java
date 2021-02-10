package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	@Id
	private int rid;
	@OneToOne
	private Users user;

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(int rid, Users user) {
		super();
		this.rid = rid;
		this.user = user;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Result [rid=" + rid + ", user=" + user + "]";
	}

}
