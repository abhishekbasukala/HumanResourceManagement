package com.hrm.leave.domain;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
	}
}