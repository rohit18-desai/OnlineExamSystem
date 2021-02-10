package com.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project.model.Answers;
import com.project.model.Questions;
import com.project.model.Users;

public class QuestionOperation {

	public String insertQuestion(Questions que) {
		// session = factory.openSession();
		Session s = FactoryProvider.getFactory().openSession();
		// tx = session.beginTransaction();
		Transaction tx = s.beginTransaction();
		s.save(que);
		tx.commit();
		s.close();
		return "Question added sucessfully...";
	}

	public String getQuestion() {
		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("select content from Answers");
		List<Answers> users = q.list();
		for (Answers u : users) {
			System.out.println(u);
		}

		//Users u = (Users) q.uniqueResult();
		System.out.println("getttinggg...");
		//System.out.println(u);

		tx.commit();
		s.close();
		return "get que sucessfully...";
	}
}
