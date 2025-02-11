package com.interview_questionsandconcept.records;

public class Test {
	public static void main(String[] args) {
		Person p = new Person(1, "mainsh");
		System.out.println(p);

		Animal lion = new Animal("lion");
		System.out.println(lion);
		System.out.println(lion.getLegCount());
		System.out.println(lion.getName());
	}
}
