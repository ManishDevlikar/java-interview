package com.interview_questionsandconcept.patterns;

public class AZPattern {
	public static void main(String[] args) {
		print(26);
	}

	private static void print(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print((char) ('A' + j) + " ");
			}
			System.out.println();
		}
	}
}
