package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterListElement {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();// initializing list
		// adding element into list
		for (int i = 1; i <= 40; i++) {
			list.add(i);
		}

		Set<Integer> filterList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
		System.out.println(filterList);	
	}

}
