package com.interview_questionsandconcept.patterns;

public class ReversePyramid {
	public static void main(String[] args) {
		printStar(5);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
