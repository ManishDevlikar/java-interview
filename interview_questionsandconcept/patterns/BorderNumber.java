package com.interview_questionsandconcept.patterns;

public class BorderNumber {
	public static void main(String[] args) {
		print(4);
	}

	public static void print(int num) {
		int row = num;
//		int num = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i >= j) {
					System.out.print(j + 1 + " ");
				}
			}
//			num = 1;
			System.out.println();
		}

		System.out.println("---------------||-----------------");
		for (int i = 0; i < num * 2 - 1; i++) {
			for (int j = 0; j < num * 2 - 1; j++) {
				System.out.print(Math.max(Math.abs(i - (num - 1)), Math.abs(j - (num - 1))) + 1 + " ");
//				System.out.print(i + 1);
			}
			System.out.println();
		}
	}
}
