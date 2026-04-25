package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private int empId;
	private String name;
	private String dept;
	private Double salary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String name, String dept, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj;
		return this.name.equals(e.getName());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}*/
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee e1= new Employee(1,"vinod","dev",1000.0);
		Employee e2= new Employee(2,"vinod2","man",2000.0);
		Employee e3= new Employee(3,"vinod3","man",1000.0);
		Employee e4= new Employee(4,"vinod4","qa",3000.0);
		Employee e5= new Employee(5,"vinod5","dev",4000.0);
		Employee e6= new Employee(6,"vinod6","qa",1500.0);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		System.out.println(empList.stream().count());
		empList.stream().filter(e->e.getName().equals("vinod")).forEach(System.out::println);
		Map<String,List<Employee>> mapTest = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(mapTest);
		//ArrayList<Employee> empList = {e1,e2,e3,e4,e5,e6};
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
		empList.stream().sorted(Comparator.comparing(Employee::getEmpId).reversed()).forEach(System.out::println);
			
	}

}
