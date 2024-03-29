package com.met.spring;

public class Employee {

		private static int count;
		private int id;
		private int age;
		private String designation;
		private String emailId;
		
		
		public Employee(int age, String emailId) {
			this();//if u use super here then id =0
			this.age = age;
			this.emailId = emailId;
			designation="Fresher";
		}//this constructor is for <constructor-arg> example. 
		public Employee() {
			id=++count;
			System.out.println("Employee id created with id="+id);
		}//this constructor get called when bean id get created in test.xml file.
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", age=" + age + ", designation=" + designation + ", emailId=" + emailId
					+ "]";
		}
		
		
}
