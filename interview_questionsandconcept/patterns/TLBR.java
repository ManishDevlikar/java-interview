package com.interview_questionsandconcept.patterns;

public class TLBR {
	public static void main(String[] args) {
		printStar(15);
	}

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j <= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
