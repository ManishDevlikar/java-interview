package com.interview_questionsandconcept.collection.iterators.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		ListIterator<Integer> itr = list.listIterator(list.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
