package com.interview_questionsandconcept.patterns;

public class RightPascalTrianglePattern {
	public static void main(String[] args) {
		printStar(5);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}
