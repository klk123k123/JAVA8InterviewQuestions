package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeJava8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee=Arrays.asList(new Employee(1,"Lakshmi",24,"Female","JavaDeveloper",2021,70000),
				new Employee(2,"Lakshman",24,"Female","HR",2017,90000),
				new Employee(3,"Hanvika",30,"Male","PipingDesigner",2021,70000),
				new Employee(4,"Lakshmi",14,"Female","SME",2023,100000),
				new Employee(5,"Lakshmi",24,"Female","JUnior Developer",2021,70000),
				new Employee(6,"Lenin",24,"Male","SeniorJAvaDeveloper",2025,80000),
				new Employee(7,"Hanshu",29,"Female","SQL",2022,170000),
				new Employee(8,"Hemash",34,"Male","SQL",2023,270000));
	
	//list of employee count the number of each department
	Map<String ,Long>values=employee.stream().collect(Collectors.groupingBy(Employee :: getDepartment ,Collectors.counting()));
	System.out.println(values);
	//avaerage salary male and female
	Map<String,Double>averagevalue=employee.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.averagingDouble(Employee :: getSalary)));
	System.out.println(averagevalue);
	//highest paid employee
	Optional<Employee>maxPaid=employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
	if(maxPaid.isPresent())
		System.out.println(maxPaid.get());
	//avg of age each department
	
		Map<String,Double>avgAge=employee.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.averagingInt(Employee :: getAge)));
		System.out.println(avgAge);
		
		//senior most employee
		Optional<Employee>senior=employee.stream().min(Comparator.comparingInt(Employee :: getYearOfJoining));
		if(senior.isPresent())
			System.out.println("Highest Experience Employee : "+senior);
		Optional<Employee> seniorMostEmployeeWrapper=
				employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		if(seniorMostEmployeeWrapper.isPresent())
			System.out.println("Highest Experience Employee : "+seniorMostEmployeeWrapper);
		
		System.out.println(IntStream.range(0, 5).sum());
	}
	
}
