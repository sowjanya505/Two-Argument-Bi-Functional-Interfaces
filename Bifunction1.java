##2.BiFunction:-

##To create Student Object by taking name and rollno as input by using BiFunction:

 	import java.util.function.*;
 	import java.util.*;
 	class Student
 	{
		String name;
		int rollno;
		Student(String name,int rollno)
		{
		this.name=name;
		this.rollno=rollno;
		}
 	}
 	class Bifunction1
 	{
	public static void main(String[] args)
	{
	ArrayList<Student> l = new ArrayList<Student>();
	BiFunction<String,Integer,Student> f=(name,rollno)->new Student(name,rollno);
	l.add(f.apply("Durga",100));
	l.add(f.apply("Ravi",200));
	l.add(f.apply("Shiva",300));
	l.add(f.apply("Pavan",400));
	for(Student s : l)
		{
		System.out.println("Student Name:"+s.name);
		System.out.println("Student Rollno:"+s.rollno);
		System.out.println();
		}
	}
	}

####output:-

	Student Name:Durga 
	Student Rollno:100

	Student Name:Ravi 
	Student Rollno:200

	Student Name:Shiva 
	Student Rollno:300

	Student Name:Pavan 
	Student Rollno:400


