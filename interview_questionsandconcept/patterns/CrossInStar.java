package com.interview_questionsandconcept.patterns;

public class CrossInStar {
	public static void main(String[] args) {
		printStar(15);
	}

	public static void printStar(int n) {
		int r = 0, c = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == i || j == n - 1 - i)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
