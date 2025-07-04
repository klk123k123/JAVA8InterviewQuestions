package com.learn.corejava.InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Lakshmi";

Map<Character,Long> value=str.chars().mapToObj(s ->(char)s).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
value.forEach((k,v)->System.out.println(k+" : "+v));

List<String>names=Arrays.asList("Lakshmi","Hanvika","Harshitha");

//name length
Map<Integer, List<String>> nameLengthMap = names.stream()
 .collect(Collectors.groupingBy(String::length));
 // Print the result
nameLengthMap.forEach((length, nameList) ->
System.out.println("Length " + length + " : " + nameList));
//length by sorted

String[] str1 = {"apple", "banana", "apple", "orange", "banana", "apple"};

Map<String, Long> freqMap = Arrays.stream(str1)
.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

freqMap.entrySet().stream()
.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

//find duplicatesin above array
Map<String, Long> freqMap1 = Arrays.stream(str1)
.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println("Duplicates Elements");
freqMap1.entrySet().stream().filter(name -> name.getValue()>1).forEach(e ->System.out.println(e.getKey()));


/*
 * List<String> list = Arrays.asList("A", "B", "C", "A", "D", "B"); Set<String>
 * duplicates = list.stream() .filter(s -> Collections.frequency(list, s) > 1)
 * .collect(Collectors.toSet());
 */

	}

}
