
import java.util.Scanner;

public class Student {

	String name;
	int age;
	char gender;
	int marks;
	 
	  Student(String a, int b, char c, int d)
        { 
        	name=a;
        	age=b;
        	gender=c;
        	marks= d;
        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString()
	{   
		String str= "Name : "+ name +" Age: "+ age +" Gender : "+ gender +"\n";
		return str;
	}  
	
	public Student scanfun()
	{   Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of student.");
		this.name= sc.next();
		System.out.println("Enter age of student.");
		this.age= sc.nextInt();
		System.out.println("Enter gender of student.");
		this.gender= sc.next().charAt(0);
		System.out.println("Enter marks of student.");
		this.marks= sc.nextInt();
		Student s1= new Student(name,age,gender,marks);
		return s1;
	}
	
}