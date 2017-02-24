package com.vineet;

import java.io.Serializable;

public class Sensor implements Serializable{
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Sensor(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Sensor(String input) {
		
		this.name = input.split(",")[0];
		this.id = input.split(",")[1];
	}

	@Override
	public String toString() {
		return "Vineet: Sensor [name=" + name + ", id=" + id + "]";
	}

	
	
}
