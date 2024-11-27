package com.tut.constructor;

public class Person {
	private String name;
	private String cast;
	private int number;

	public Person(String name, String cast, int number) {
		this.name = name;
		this.cast = cast;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cast=" + cast + ", number=" + number + "]";
	}

}
