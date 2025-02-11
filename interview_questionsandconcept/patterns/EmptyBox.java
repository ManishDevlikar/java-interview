package com.interview_questionsandconcept.patterns;

public class EmptyBox {
	public static void main(String[] args) {
		printStar(5);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
