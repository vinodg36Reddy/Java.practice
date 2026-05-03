package com.test;

import java.util.List;

class Employee{
	Integer empid;
	String empName;
	String dept;
	Double salary;
	int age;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(Integer empid, String empName, String dept, Double salary, int age) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
	}
	
}

public class TotalSalaryofITDeparment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = List.of(new Employee(121, "Vinod", "IT", 1000.0,12),
										new Employee(122, "Sai", "CSE", 1000.0,18),
										new Employee(123, "Manoj", "ECE", 1000.0,20),
										new Employee(124, "Ramya", "IT", 2000.0,21),
										new Employee(125, "Ashish", "EEE", 1000.0,26),
										new Employee(126, "Kumar", "IT", 3000.0,30));
		//totalsalary of IT deparment
		double totalSalary = empList.stream().filter(e->e.getDept().equals("IT")).mapToDouble(i->i.getSalary()).reduce((e1,e2)->e1+e2).getAsDouble();
		System.out.println(totalSalary);
		//total number of characters across empoiyeenames
		int result = empList.stream().mapToInt(e->e.getEmpName().length()).sum(); //reduce((i,j)->i+j).getAsInt();
		System.out.println(result);
		//sum of ages of adults
		int sumofages = empList.stream().filter(e->e.getAge()>18).mapToInt(a->a.getAge()).sum();
		System.out.println(sumofages);
		
	}

}
