#####To calculate Monthly Salary with Employee and TimeSheet objects as input By using BiFunction:

 import java.util.function.*;
 import java.util.*;
 class Employee
 {
	int eno;
	String name;
	double dailyWage;
	Employee(int eno,String name,double dailyWage)
	{
	this.eno=eno;
	this.name=name;
	this.dailyWage=dailyWage;
	}
 }
 class TimeSheet
 {
	int eno;
	int days;
	TimeSheet(int eno,int days)
	{
	this.eno=eno;
	this.days=days;
	}
 }
 class Bifunction2
 {
	public static void main(String[] args)
 {
	BiFunction<Employee,TimeSheet,Double> f=(e,t)->e.dailyWage*t.days;
	Employee e= new Employee(101,"Durga",1500);
	TimeSheet t= new TimeSheet(101,25);
	System.out.println("Employee Monthly Salary:"+f.apply(e,t));
	}
 }


Output: 
	Employee Monthly Salary:37500.0