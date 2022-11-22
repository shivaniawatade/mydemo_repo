package com.tcs.bean;

public class Student {

	private int id;
	private String name;
	private String email;
	private Address home;

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String email, Address home) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.home = home;
	}

	public Student() {
		super();
		System.out.println("Student object is created!!!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getHome() {
		return home;
	}

	public void setHome(Address home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", home=" + home + "]";
	}

}