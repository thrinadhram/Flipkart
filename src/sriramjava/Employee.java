package sriramjava;

public class Employee {
	int id;
	long salary;
	String name;
	public Employee(int empid,long empsalary,String empname) {
		id = empid;
		salary = empsalary;
		name = empname;
	}
public void display() {
	System.out.println(id);
	System.out.println(salary);
	System.out.println(name);
	
	
	
}
public static void main(String[] args) {
	Employee e = new Employee(1, 234456789, "pooja");
	e.display();
	Employee e1 = new Employee(2, 234567890, "neeha");
	e1.display();
}
	

	}


