package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Student std = session.get(Student.class, "deep@gmail.com");
		System.out.println(std.getName());
		session.close();

		Session session1 = sf.openSession();

		Student std1 = session1.get(Student.class, "deep@gmail.com");
		System.out.println(std1.getName());
		session1.close();

		Session session2 = sf.openSession();

		Student std2 = session2.get(Student.class, "deep@gmail.com");
		System.out.println(std2.getName());
		session2.close();
	}
}
