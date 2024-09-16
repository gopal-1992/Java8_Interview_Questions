package com.gopal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByInJava7 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Gopal", "Gunupur", 30));
		empList.add(new Employee("Mina", "Gunupur", 30));
		empList.add(new Employee("Alok", "Berhampur", 45));
		empList.add(new Employee("Pikun", "Gunupur", 30));
		empList.add(new Employee("Situn", "Berhampur", 28));
		empList.add(new Employee("Anjan", "Koraput", 31));
		empList.add(new Employee("Kohili", "Koraput", 32));

		Map<String, List<Employee>> map = new HashMap<>();

		for (Employee emp : empList) {
			if (!map.containsKey(emp.getCity())) {
				map.put(emp.getCity(), new ArrayList<>());
			}
			map.get(emp.getCity()).add(emp);

		}

		/*
		 * for(Employee p : empList) { if(!map.containsKey(p.getCity())) {
		 * map.put(p.getCity(), new ArrayList<>()); } map.get(p.getCity()).add(p); }
		 */
		System.out.println("Before java 8 grouping by ::" + map);
		map = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("in java 8 grouping by ::" + map);
		Map<Integer, List<Employee>> grpByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println("in java 8 grouping by age ::" + grpByAge);
	}

}
