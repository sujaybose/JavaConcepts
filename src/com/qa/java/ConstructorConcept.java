package com.qa.java;

public class ConstructorConcept {
	
	//Class or global variable
	String name = "bose";
	int age = 63;
	
	//but if we change the name of the variable then we don't have to use the this keyboard.
	
	//String name1 = "bose";
	//int age1 = 63;

	public ConstructorConcept() {
	}

	public ConstructorConcept(String name, int age) {
		//Use of this keyword: To refer the class variable (Which is called global variable also)
		this.name = name;
		this.age = age;
		//name1=name;
		//age1=age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorConcept con = new ConstructorConcept("sujay", 36);
		// System.out.println("*****************************");
		//System.err.println(con.name1);
		//System.out.println(con.age1);
		
		System.err.println(con.name);
		System.out.println(con.age);
	}

}
