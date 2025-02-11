package com.interview_questionsandconcept.patterns;

public class PlusInStar {
	public static void main(String[] args) {
		printStar(15);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == n / 2 || j == n / 2)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
