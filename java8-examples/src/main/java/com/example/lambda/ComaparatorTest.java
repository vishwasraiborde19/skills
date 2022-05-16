package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComaparatorTest {

	public static void main(String args[]) {

		Employee e1 = new Employee("vishwas", 100);
		Employee e2 = new Employee("vishwas raiborde", 200);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);

		// old java
		Comparator<Employee> asc_old = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		};
		
		employees.sort(asc_old);
		for(Employee e : employees) {
			System.out.println("old style ascending " + e.toString());
		}
		
		Comparator<Employee> dsc_old = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o2.getSalary() - o1.getSalary();
			}
		};
		employees.sort(dsc_old);
		for(Employee e : employees) {
			System.out.println("old style descending " + e.toString());
		}

		
		

		// new java code as reference
		Comparator<Employee> asc = (o1, o2) -> o1.getSalary() - o2.getSalary();
		Comparator<Employee> dsc = (o1, o2) -> o2.getSalary() - o1.getSalary();

		employees.sort(asc);
		employees.stream().forEach(t -> System.out.println("lamda as code asc " + t.toString()));

		employees.sort(dsc);
		employees.stream().forEach(t -> System.out.println("lamda as code dsc " +t.toString()));

		// or  java code as reference
		employees.sort((o1, o2) -> o1.getSalary() - o2.getSalary());
		employees.stream().forEach(t -> System.out.println(t.toString()));

		employees.sort((o1, o2) -> o2.getSalary() - o1.getSalary());
		employees.stream().forEach(t -> System.out.println(t.toString()));

	}
}

class Employee {

	private String name;
	private Integer salary;

	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
