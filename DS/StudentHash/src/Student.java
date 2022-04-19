
import java.util.Scanner;

public class Student {
	int age;
	String name;
	String mobile_no;
	String email_id;
	Student()
    { 
    	this.age=0;
    	this.name=null;
    	this.mobile_no= null;
    	this.email_id = null;
    }
	  Student(int age, String name, String mob,  String email)
        { 
        	this.age=age;
        	this.name=name;
        	this.mobile_no= mob;
        	this.email_id = email;
        }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String toString()
	{   
		String str= "Name : "+ name +" Age: "+ age +" mobile number : "+ mobile_no + " Email id"+ email_id +"\n";
		return str;
	}  
	
	public Student scanfun()
	{   @SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter age of student.");
		this.age= sc.nextInt();
		System.out.println("Enter name of student.");
		this.name= sc.next();
		System.out.println("Enter mobile number of student.");
		this.mobile_no= sc.next();
		System.out.println("Enter email ID of student.");
		this.email_id= sc.next();
		Student s1= new Student(age,name,mobile_no,email_id);
		System.out.println("------------------------------------------------new entry-----------------------------------");
		return s1;
	}
	
}