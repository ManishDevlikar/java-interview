package com.interview_questionsandconcept.patterns;

public class BRTLStar {
	public static void main(String[] args) {
		printStar(15);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
