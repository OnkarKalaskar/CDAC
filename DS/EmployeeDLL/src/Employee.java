import java.util.Scanner;

public class Employee {
		private int age;
		private String empname;
		private float basicSalary;
		
    public Employee ()
    {
    	age= 0;
		empname= null;
		basicSalary= 0.0f;	
	}
	
	Employee(String y, int x, float z)
	{
		empname= y;
		age= x;
		basicSalary= z;
		
	}
	
	void setAge(int x)
	{ 
//		if (x<20)
//		{
//			System.out.println("Under age employee... ");
//		}
		this.age=x;
	}
	int getAge()
	{
		return age;
	}
	
	void setempname(String x)
	{
		empname="x";
	}
	String getempname()
	{
		return empname;
	}
	
	void setbasicSalary(float x)
	{
		  this.basicSalary= x;
	}
	float getbasicSalary()
	{
		return basicSalary;
	}

	public String toString()
	{
		String str= "Employee age: "+ age +"   Employee name: "+ empname +" Salary (with incentives): "+basicSalary;
		return str;
	}
	
	                  

}
