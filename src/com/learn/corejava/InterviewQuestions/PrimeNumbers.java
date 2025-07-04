package com.learn.corejava.InterviewQuestions;
class Numbers
{
	static boolean printValue(int num)
	{
		if(num<2)
			return false;
		for(int i=2;i<=num/2;i++)
		{
		if(num%i==0)
		{
			return false ;}
	
	}
		return true;
}
}
class Number
{
	static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		
		if(num%2!=0)
			return true;
		return true;
		
}
}
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num=12;

/*if(Numbers.printValue(num))
	System.out.println(num +" is a primeNumber");
else
	System.out.println(num +" is not a primeNumber");
	}*/
		System.out.println(Number.isPrime(12));
		System.out.println("PrimeNumber are int 1 to 100 : ");
for(int i=1;i<=100;i++)
{
	if(Numbers.printValue(i))
		System.out.print(i+" ");
}
	}

}
