package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.bean.Question;

public class Starter {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Question q1 = (Question) ctx.getBean("q1");
		System.out.println("q1 =" + q1);

	}

}