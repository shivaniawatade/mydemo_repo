package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.bean.Address;
import com.tcs.bean.Student;

public class Starter {

	public static void main(String[] args) {
		Address address = new Address(75, "Test Street", "test");
		System.out.println("address = " + address);

		Student s1 = new Student(100, "test", "test@gmail.com", address);
		System.out.println("s1=" + s1);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s2 =  (Student) ctx.getBean("s1");
		System.out.println("s2 = " + s2);
		
		Student s3 =  (Student) ctx.getBean("s2");
		System.out.println("s3 = " + s3);

	}

}