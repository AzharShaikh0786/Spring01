package com.tut.reference;

public class BReference {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BReference(String name) {
		super();
		this.name = name;
	}

	public BReference() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BReference [name=" + name + "]";
	}
}
