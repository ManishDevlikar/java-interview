package com.interview_questionsandconcept.records;

public record Animal(int id, String name, int legCount) {
	public int getLegCount() {
		return legCount;
	}

	public Animal(String name) {
		this(0, name, 4);
	}

	public static String getName() {
		return "animal";
	}

}
