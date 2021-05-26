package com.stream;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.*;
import java.util.*;
import java.util.List;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class FilterByDivisible 
{
static int num = 100;
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList();// initializing list
		// adding element into list
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		Set<Integer> filterList = list.stream().filter(x -> x % 5 == 0 && x%7 == 0).collect(Collectors.toSet());
		System.out.println(filterList);	

	}

}
