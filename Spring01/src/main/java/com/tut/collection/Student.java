package com.tut.collection;

import java.util.List;
import java.util.Set;

public class Student {

	private int id;
	private List<String> courses;
	private Set<String> number;
	public int getId() {
		return id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", courses=" + courses + ", number=" + number + "]";
	}
	public Student(int id, List<String> courses, Set<String> number) {
		super();
		this.id = id;
		this.courses = courses;
		this.number = number;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Set<String> getNumber() {
		return number;
	}
	public void setNumber(Set<String> number) {
		this.number = number;
	}
	
	
}
