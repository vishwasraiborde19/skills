package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.lambda.data.Student;
import com.example.lambda.data.StudentDataBase;

public class PredicateExample {

	// create predicate to get alter the list of students

	public static void getStudentlist() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(s -> System.out.println(s.toString()));
	}

	public static void getStudentlistWheregpa() {

		Predicate<Student> gpa = s -> s.getGpa() == 4;
		List<Student> students = StudentDataBase.getAllStudents();

		students.stream().filter(gpa).collect(Collectors.toList()).forEach(s -> System.out.println(s.toString()));

	}

	public static void getStudentlistWheregpaANDGender() {

		Predicate<Student> gpa = s -> s.getGpa() == 4;
		Predicate<Student> gender = s -> s.getGender().equals("male");
		
		List<Student> students = StudentDataBase.getAllStudents();

		students.stream().filter(gpa.and(gender)).collect(Collectors.toList()).forEach(s -> System.out.println(s.toString()));

	}
	
	public static void getStudentlistWheregpaORGender() {

		Predicate<Student> gpa = s -> s.getGpa() == 4;
		Predicate<Student> gender = s -> s.getGender().equals("male");
		
		List<Student> students = StudentDataBase.getAllStudents();

		students.stream().filter(gpa.or(gender)).collect(Collectors.toList()).forEach(s -> System.out.println(s.toString()));

	}

	public static void main(String args[]) {

		getStudentlist();

		System.out.println("getStudentlistWheregpa");
		getStudentlistWheregpa();
		
		System.out.println("getStudentlistWheregpaANDGender");
		getStudentlistWheregpaANDGender();
		
		
		System.out.println("getStudentlistWheregpaORGender");
		getStudentlistWheregpaORGender();

	}

}
