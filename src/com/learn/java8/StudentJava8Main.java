package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentJava8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> s=Arrays.asList(new Student("Lakshmi",101,"English",90.0),
				new Student("Lakshman",102,"English",80.0),
				new Student("Hanvika",103,"Telugu",100.0),
				new Student("Chinnu",104,"Hindi",70.0),
				new Student("Lenin",105,"Scince",60.0),
				new Student("shyam",106,"Komali",90.0),
				new Student("Juthu",107,"English",50.0)
			);
/*
Map<String, List<Student>> values = s.stream()
 .filter(student -> student.getPercentage() > 60.0)
.collect(Collectors.groupingBy(Student::getName));
*/

Map<Double, List<Student>> values = s.stream()
 .filter(student -> student.getPercentage() > 60.0)
.collect(Collectors.groupingBy(Student::getPercentage));



	System.out.println(values);	
		Map<Boolean, List<Student>> studentspartionedByPercentage = s.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));
System.out.println(studentspartionedByPercentage);

//top performaing

/*Optional<Stream<Student>>top3List=Optional.ofNullable(s.stream().sorted(Comparator.comparingDouble(Student :: getPercentage).reversed()).limit(3));
	
	if(top3List.isPresent())
		System.out.println(top3List);}*/
	

List<Student> top3Students = s.stream()
.sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
.limit(3)
.collect(Collectors.toList());

Optional<List<Student>> top3List = Optional.ofNullable(top3Students);

top3List.ifPresent(list -> list.forEach(System.out::println));
//to get student name and percentage
Map<String ,Double>namevalue=s.stream().collect(Collectors.toMap(Student :: getName, Student :: getPercentage));
System.out.println(namevalue);
//offered students

Set<String> subjects = s.stream().map(Student::getSubject).collect(Collectors.toSet());
System.out.println(subjects);
//max,min,avg
Optional<Student>maxValue=s.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student :: getPercentage)));
if(maxValue.isPresent())
System.out.println("Max Value :"+maxValue);
DoubleSummaryStatistics studentStats=s.stream().collect(Collectors.summarizingDouble(Student :: getPercentage));
System.out.println("Highest Percentage : "+studentStats.getMax());

System.out.println("Lowest Percentage : "+studentStats.getMin());
          
System.out.println("Average Percentage : "+studentStats.getAverage());

//grouping by subject list of students

Map<String,List<Student>> listofValues=s.stream().collect(Collectors.groupingBy(Student :: getSubject));
System.out.println(listofValues);
	}
}
