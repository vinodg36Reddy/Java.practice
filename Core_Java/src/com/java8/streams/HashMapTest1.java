package com.java8.streams;

import java.util.HashMap;

public class HashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1,"vinod","dev",1000.0);
		Employee e2= new Employee(2,"vinod","man",2000.0);
		Employee e3= new Employee(3,"vinod3","man",1000.0);
		Employee e4= new Employee(4,"vinod4","qa",3000.0);
		Employee e5= new Employee(5,"vinod5","dev",4000.0);
		Employee e6= new Employee(6,"vinod6","qa",1500.0);
		HashMap<Employee,String> mapTest = new HashMap<Employee,String>();
		mapTest.put(e1, e1.getName());
		mapTest.put(e2, e2.getName());
		mapTest.put(e3, e3.getName());
		mapTest.put(e4, e4.getName());
		mapTest.put(e5, e5.getName());
		mapTest.put(e6, e6.getName());
		System.out.println(mapTest);
		
	}

}
