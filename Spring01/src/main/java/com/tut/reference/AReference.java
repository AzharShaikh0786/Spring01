package com.tut.reference;

public class AReference {

	private int id;
	private BReference obj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BReference getObj() {
		return obj;
	}

	public void setObj(BReference obj) {
		this.obj = obj;
	}

	public AReference() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AReference [id=" + id + ", obj=" + obj + "]";
	}

}
