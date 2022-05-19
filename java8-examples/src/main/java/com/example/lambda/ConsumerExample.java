package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.example.lambda.data.Student;
import com.example.lambda.data.StudentDataBase;

public class ConsumerExample {

	public static void getStudentlist() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(s -> System.out.println(s.toString()));
	}

	public static void add() {

		Consumer<Student> changeName = s -> s.setName(s.getName().toUpperCase());
		Consumer<Student> printoperation = s -> System.out.println(s.toString());

		List<Student> students = StudentDataBase.getAllStudents();
		students.stream().forEach(changeName.andThen(printoperation));

	}

	public static void addAndPredicate() {

		Predicate<Student> gpaFileterv = x -> x.getGpa() == 4;
		Consumer<Student> changeName = s -> s.setName(s.getName().toUpperCase());
		Consumer<Student> printoperation = System.out::println;

		List<Student> students = StudentDataBase.getAllStudents();
		students.stream().filter(gpaFileterv).forEach(changeName.andThen(printoperation));

	}

	public static void main(String args[]) {

		getStudentlist();

		System.out.println("add");
		add();

		System.out.println("addAndPredicate");
		addAndPredicate();

	}
}
