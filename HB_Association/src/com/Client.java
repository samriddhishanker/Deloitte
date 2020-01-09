package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee employee1 = new Employee(1222,"kalpana");
		session.save(employee1);
		
		RegularEmployee employee2 = new RegularEmployee(4100,9000);
		employee2.setEmployeeId(111);
		employee2.setEmployeeName("arjun");
		session.save(employee2);
		
		ContractEmployee employee3 = new ContractEmployee(20,1000);
		employee3.setEmployeeId(101);
		employee3.setEmployeeName("mohan");
		session.save(employee3);
		
		tx.commit();
		session.close();
		System.out.println("done");
		factory.close();
	}
}
