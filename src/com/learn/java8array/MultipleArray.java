package com.learn.java8array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultipleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=Arrays.asList(1,2,3,4,5);
int m=1;
for(int i=0;i<list.size();i++)
{
	m*=list.get(i);
}
		System.out.println("Total Multiple Values : "+m);
		Optional<Integer> v = Optional.of(list.stream().reduce(1, (a,b) -> a*b));
		if(v.isPresent())
		System.out.println("Total Multiple Values : "+v);
		else
			System.out.println(" Empty List");
	}

}
