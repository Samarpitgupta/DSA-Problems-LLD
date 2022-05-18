package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java8StreamPrac {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("Samarpit", "samar", 200000),
				new Employee("darshan", "darshan", 300000));

		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Sam", 25);
		map.put("Sam", 26);
		map.put("Samarpit", 26);

		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

		map.forEach((m, n) -> System.out.println(m + " " + n)); // accept BiConsumer
//		empList.stream().filter(e->e.getEmpName()).map(e-> e.getEmpName().charAt(0)).collect(Collection.)

		List<String> names = Arrays.asList("Samarpit", "Aayush", "Harsh", "Likhith");
		// Collections.sort(names, (String a,String b)->{})
		names.sort((String a, String b) -> b.compareTo(a));
		System.out.println("-----------Names----------");
		for (String name : names)
			System.out.println(name);

		names.forEach(name -> System.out.println("\n Names: " + name)); // accept consumer

		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.forEach(fruit -> System.out.println("Fruits: " + fruit)); // accept consumer

	}

}

class Employee {
	private String empName;
	private String pass;
	private int salary;

	Employee(String empName, String pass, int salary) {
		this.empName = empName;
		this.pass = pass;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
