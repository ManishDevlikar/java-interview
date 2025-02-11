package com.interview_questionsandconcept.patterns;

public class PyramidPattern {
	public static void main(String[] args) {
		printStar(5);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int space = n - i; space > 1; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
