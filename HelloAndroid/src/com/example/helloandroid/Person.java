package com.example.helloandroid;

public class Person {
	public String name;
	public int age;
	
	public Person()
	{
		name = "Savannah";
		age = 20;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
