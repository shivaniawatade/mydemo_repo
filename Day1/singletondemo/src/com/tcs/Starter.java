package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
	public static void main(String[] args) {
		Trainer t1 = new Trainer();
		System.out.println(t1.hashCode());
		
		Trainer t2 = new Trainer();
		System.out.println(t2.hashCode());
		
		Trainer t3 = t1;
		System.out.println(t3.hashCode());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Trainer t4 = (Trainer)ctx.getBean("t4");
		System.out.println(t4.hashCode());
		
		Trainer t5 = (Trainer)ctx.getBean("t5");
		System.out.println(t5.hashCode());
		
		//t6=t4;
		Trainer t6 = (Trainer)ctx.getBean("t4");
		System.out.println(t6.hashCode());
		
		
		
	}
}