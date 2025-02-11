package com.interview_questionsandconcept.patterns;

public class HollowDiamond {
	public static void main(String[] args) {
		printStar(10);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int space = n - i; space > 1; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == n  || i == j) {
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

		for (int i = 1; i < n; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				if (i == j || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
				if (j >= i)
					System.out.print(" ");

			}
			System.out.println();
		}

	}
}
