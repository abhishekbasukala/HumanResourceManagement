package com.hrm.domain;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class App {
	
	static ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
	
	static SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
	
	//@Transactional
	public static void manipulate(){
		
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		Address address=new Address("1000 N 4th Street","Fairfield","IA",52557,"USA");
		Employee emp=new Employee("Abhishek", "Basukala", new Date(), "Male", "Single", "abcd", "6419193545", address, new Date(), new Date(), true);
		session.save(emp);
		tx.commit();
		
	}
	
	public static void main(String args[]){
		manipulate();
	}
	
	

}
