package com.learn.corejava.InterviewQuestions;

import java.util.Scanner;

public class slicingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("InputPlease : "+name);
		int n=1;
		for(int i=0;i<name.length();i++)
		{
			if(Character.isUpperCase(name.charAt(i)))
			{
				n++;
			}
		}
		System.out.println("Output : "+n);
		
	}

}
