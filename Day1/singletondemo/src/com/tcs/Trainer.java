package com.tcs;

public class Trainer {
	private int id;
	private String name;

	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Trainer() {
		super();
		System.out.println("Trainer object is created!!!");
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

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}

}