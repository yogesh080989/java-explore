package com.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AddingNumberBy5 
{
static int num = 5;
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList();// initializing list
		// adding element into list
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		
		list.forEach(x->System.out.println(x + 5));
		
		
		
		
		
		
		//int sum = list.stream().mapToInt(x -> x ).sum(); //mapToInt we are using because to convert it into integer.
		
		//System.out.println(sum);
	}
	
}

