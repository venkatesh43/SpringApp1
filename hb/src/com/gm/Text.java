package com.gm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Text {

	public static void main(String[] args) {
		/*
		 * Configuration cfg=new Configuration().configure("com/gm/hibernate.cfg.xml");
		 * SessionFactory sf=cfg.buildSessionFactory(); Session ses=sf.openSession();
		 * Transaction tx=ses.beginTransaction();
		 */

		Configuration cfg = new Configuration().configure("com/gm/emp.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		employee emp = new employee();
		emp.setEid(500);
		emp.setEname("raghu");
		emp.setEsalary("500");
		ses.save(emp);
		tx.commit();
		System.out.println("sucess");

	}

}
