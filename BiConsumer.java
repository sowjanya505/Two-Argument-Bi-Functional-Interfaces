BiConsumer:-  won't return any result.

#####Demo Program to increment employee Salary by using BiConsumer:--

	import java.util.function.*;
	import java.util.*;
	class Employee
	{
		String name;
		double salary;
		Employee(String name,double salary)
		{
		this.name=name;
		this.salary=salary;
		}
 	}
 	class Biconsumer
	{
	public static void main(String[] args)
	 {
		ArrayList<Employee> l= new ArrayList<Employee>();
		populate(l);
		BiConsumer<Employee,Double> c=(e,d)->e.salary=e.salary+d;
		for(Employee e:l)
		{
		c.accept(e,500.0);
		}
		for(Employee e:l)
		{
		System.out.println("Employee Name:"+e.name);
		System.out.println("Employee Salary:"+e.salary);
		System.out.println();
		}
	  }
	}


