package com.interview_questionsandconcept.serialization;

import java.io.Serializable;

public class Species implements Serializable {
	int id;
	String name;
	transient String kingdom;

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

	public String getKingdom() {
		return kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	public Species(int id, String name, String kingdom) {
		this.id = id;
		this.name = name;
		this.kingdom = kingdom;
	}

	public Species() {
	}

}
