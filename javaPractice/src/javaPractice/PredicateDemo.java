package javaPractice;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	int salary, experience;

	Employee(String name, int salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
}

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Employee> pr = e -> e.salary > 50000 && e.experience > 3;
//		Employee emp = new Employee("mahi", 100000, 4);
//		boolean bool = pr.test(emp);
//		System.out.println(bool);
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee("jesica", 40000, 4));
		al.add(new Employee("mahi", 100000, 4));
		al.add(new Employee("emma", 60000, 4));
		
		for(Employee emp: al) {
			
			if(pr.test(emp))
			{
				System.out.println(emp.name);
			}
		}
	}

}