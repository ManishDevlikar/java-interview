package com.interview_questionsandconcept.basic;

import java.util.HashMap;

public class CountTheOccuraceOfSameWord {
	public static void main(String[] args) {
		System.out.println(count("java is oop programming language , java is my fav programming language "));
	}

	public static HashMap<String, Integer> count(String str) {
		String[] s = str.toLowerCase().split("\\W+");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {

			if (map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i]) + 1);
			} else {
				map.put(s[i], 1);
			}
		}
		return map;
	}
}
