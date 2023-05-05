package com.lab_question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent { // main class
	public static void main(String... args) { // main method
		ApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student e1 = (Student) cont.getBean("stu"); 
		System.out.println(e1);
	}
}
