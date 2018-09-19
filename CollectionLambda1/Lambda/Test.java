package com.nt.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*class MyComprator implements Comparator<Integer>
{
	public int compare(Integer I1,Integer I2)
	{ 
		return (I1<I2)?-1:(I1>I2)?1:0;
		if(I1<I2)
		{
			return -1;
		}
		else if(I1>I2)
		{
			return 1;
		}
		else
		{
		return 0;
	}
}
}*/
public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(90);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(23);
		l.add(62);
		l.add(45);
		l.add(35);
		l.add(0);
		l.add(1);
		l.add(5);
		l.add(10);
		l.add(12);
		l.add(15);
		l.add(20);
		System.out.println(l);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
	}
}