package com.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project.model.Users;

public class UsersOperation {

	public String createUser(Users user) {
		// session = factory.openSession();
		Session s = FactoryProvider.getFactory().openSession();
		// tx = session.beginTransaction();
		Transaction tx = s.beginTransaction();
		s.save(user);
		tx.commit();
		s.close();
		return "Successfully added";
	}

	public Users getByID(Integer uid) {
		// session.beginTransaction();
		Session s = FactoryProvider.getFactory().openSession();
		// tx = session.beginTransaction();
		Transaction tx = s.beginTransaction();

		// Users temp = (Employee) session.get(Employee.class, id);
		Users temp = s.get(Users.class, uid);
		System.out.println(temp.getUid() + " - " + temp.getUsername());
		tx.commit();
		s.close();
		// session.getTransaction().commit();
		// Users temp=null;
		return temp;
	}
	
	public String deleteUserByID(Integer uid) {
		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		Users temp = s.get(Users.class, uid);
		System.out.println(temp.getUid() + " - " + temp.getUsername());
		s.delete(temp);
		tx.commit();
		s.close();
		// session.getTransaction().commit();
		// Users temp=null;
		return "User Deleted...";
	}
	
	

	public Users login(String uname, String upass) {
		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		Query q=s.createQuery("from Users where username= :uname And password= :upass");
		q.setParameter("uname", uname);
		q.setParameter("upass", upass);
		//List<Users> users=q.getResultList();
		/*
		 * for(Users u:users) { System.out.println(u); }
		 */		
		Users u=(Users) q.uniqueResult();
		System.out.println("login........");
		System.out.println(u);
		
		/*
		 * Users u=null; u = (Users)
		 * s.createQuery("FROM Users U WHERE U.username = :uname").setParameter("uname",
		 * uname) .uniqueResult();
		 * 
		 * if (u != null && u.getPassword().equals(upass)) { return u; } else { u=null;
		 * }
		 */		
		
		
		
		return u;
		}	


}
