package com.wora.test;

import com.wora.enums.ReturnType;
import com.wora.stringify.Stringify;

public class Book {

	private String name;
	int id;

	Book(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return Stringify.toString(this, ReturnType.STRING);
	}

}
