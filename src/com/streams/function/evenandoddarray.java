package com.streams.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenandoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>listOdd=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		List<Integer>listOdd1=list.stream().filter(i->i%2!=0).toList();
		//List<Integer>listOdd2=list.stream().filter(i->i%2!=0).forEach(System.out::println));
		System.out.println("collectors.tolist : "+listOdd);
		System.out.println("tolist : "+listOdd1);
		//System.out.println("foreach : "+listOdd2);
		
		List<Integer>listEven=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		
		List<Integer>listEven1=list.stream().filter(i->i%2==0).toList();
		List<Integer>listEven2=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("collectors.tolist : "+listEven);
		System.out.println("tolist : "+listEven1);
		System.out.println("--------------");
	listEven2.forEach(System.out::println);
	}

}
