package com.deloitte.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class JavaExercise {

	static void maskedProcessor(List<String>list)
	{
		Map<String,String>map = new HashMap<String, String>();
		String masked="";
		String masked2="";
		for(String s:list)
		{
			String subString1=s.substring(1,s.length()-2);
			String subString2=s.substring(s.length()-2, s.length());
			masked=s.charAt(0)+randomMasked(subString1)+subString2;
			masked2=s.charAt(0)+"*"+randomMasked(subString1)+subString2;

			map.put(s,map.containsValue(masked)?masked2:masked);
		}
		
		
		for(Entry<String,String>e:map.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}
	private static String randomMasked(String sub) {

		Random rand=new Random();
		StringBuilder sb=new StringBuilder(sub);
		for(int i=0;i<sub.length()-1;i++)
		{
			int randInt=rand.nextInt(sub.length());
			sb.setCharAt(randInt, '*');
		}
		if(sb.toString().indexOf('*')==-1)
		{
			sb.append('*');
		}
			
		return sb.toString();
	}
}
