package com.met.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.spring.Employee;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
		System.out.println("---------by using app context--------------");
		Object beanold=context.getBean("employee1");//1st way of get bean no need to type cast here
		System.out.println(beanold);
		
		Employee beansecond=(Employee)context.getBean("employee1");//2nd way for get bean
		System.out.println(beansecond);
		
		Employee beanthird=context.getBean("employee2", Employee.class);
		System.out.println("EMployee 2 id="+beanthird); //3rd by passing class file directly
		//this three gives same id=1 and output will be same
		System.out.println("-------------Singleton------------");
		 Employee emp3=(Employee)context.getBean("employee3");
		  System.out.println(emp3);
		  
		  System.out.println("-------------Prototype------------");
		  Employee emp4=(Employee)context.getBean("employee4");
		  System.out.println(emp4);
		  //when scope prototype id not created above by constructor you have to forcefully print bean object.
		 
		  System.out.println("-------------<Constructor-args>------------");
		  Employee emp5=(Employee)context.getBean("employee5");
		  System.out.println(emp5);
		 //it will initialize values to age and emailId fields.
		 
		  System.out.println("-------------By lazy-init------------");
		  Employee emp6=(Employee)context.getBean("employee6");
		  System.out.println(emp6);
		  Employee emp7=(Employee)context.getBean("employee7");
		  System.out.println(emp7);
	}
}
