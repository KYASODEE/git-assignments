package Generics;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<Employee>();
		set.add(new Employee("deepika",101,"HR",20000)); 
		set.add(new Employee("Shruthi",102,"IT",40000)); 
		set.add(new Employee("mounika",103,"Accounts",50000)); 
		set.add(new Employee("akshitha",104,"Programmer",70000)); 
		set.add(new Employee("Sravanthi",105,"Analyst",60000)); 
	    for(Employee i:set) {
	    	System.out.println(i);
	    }
		// TODO Auto-generated method stub

	}

}
