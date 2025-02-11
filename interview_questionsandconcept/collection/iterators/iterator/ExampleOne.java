package com.interview_questionsandconcept.collection.iterators.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExampleOne {
	public static void main(String[] args) {
		List l = Arrays.asList(12, 23, 14, 16);
		ArrayList<Integer> list = new ArrayList<Integer>(l);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer item = (Integer) itr.next();
			if (item % 2 == 0) {
				System.out.println(item);
			} else {
				itr.remove();
			}
		}
	}
}
