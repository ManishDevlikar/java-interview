package com.interview_questionsandconcept.patterns;

public class Illuminati {
	public static void main(String[] args) {
		printStar(15);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int space = n - 1; space > i; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				if (j < i) {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
