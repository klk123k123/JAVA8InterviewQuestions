package com.learn.corejava.InterviewQuestions;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReuseStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[] str = {"Harshitha","Lakshmi", "Hanvika", "Lenin","Harshitha", "Lakshmi", "Hanvika","Hanvika"};

 // Count occurrences
 Map<String, Long> countMap = Arrays.stream(str)
 .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

// Print counts
countMap.forEach((key, value) -> System.out.println(key + " : " + value));

for(String s:str)
{
	if(countMap.get(s)==1)
	{
		System.out.println("First Non Repeating :"+s);
	break;}
	
}
for(String s1:str) {
	
	 if(countMap.get(s1)>1)
	{

		System.out.println("First  Repeating :"+s1);
	break;
	}
}

		
	}
			
	}


