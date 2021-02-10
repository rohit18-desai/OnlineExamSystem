package com.project.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.project.model.Answers;


public class AnswerOperation {

	public String insertAnswer(Answers ans) {
		// session = factory.openSession();
		Session s = FactoryProvider.getFactory().openSession();
		// tx = session.beginTransaction();
		Transaction tx = s.beginTransaction();
		s.save(ans);
		tx.commit();
		s.close();
		return "Answers added sucessfully...";
	}
}
