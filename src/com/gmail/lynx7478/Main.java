package com.gmail.lynx7478;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		long x;
		System.out.println("Input number.");
		Scanner s = new Scanner(System.in);
		x = s.nextLong();
		int it = 0;
		HashMap<Integer, Long> values = new HashMap<Integer, Long>();
		while(true)
		{
			System.out.println(x);
			if(x % 2 == 0)
			{
				x = x/2;
			}else
			{
				x = 3*x+1;
			}
			it++;
			values.put(it, x);
			if(values.get(it)==1 && values.get(it-1)==2
					&& values.get(it-2)==4 && values.get(it-3)==1
					&& values.get(it-4)==2 && values.get(it-5)==4)
			{
				break;
			}
		}
		
		System.out.println(x);
	}

}
