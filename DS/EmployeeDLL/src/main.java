
public class main {
	public static void main(String [] args)
	{
		Employee e1 = new Employee("A", 34, 15500); //name, age & salary
		Employee e2 = new Employee("B", 31, 15600);
		Employee e3 = new Employee("C", 32, 15100);
		Employee e4 = new Employee("D", 30, 15200);
		Employee e5 = new Employee("E", 31, 15300);

		EmployeeDLL employeeList1 = new EmployeeDLL();
		employeeList1.insert(e1);
		employeeList1.append(e2);
		
//		employeeList1.insertAtMiddle(e3);  
		employeeList1.insertAtPos(e3, 2);
		
     	EmployeeDLL employeeList2 = new EmployeeDLL();
		employeeList2.insert(e5);
		employeeList2.append(e4);
		
		employeeList1.append("F", 31, 15900);
		
		int num = employeeList1.getDLLlength();
		System.out.println("1st list, number of elements: "+ num);
		System.out.println(employeeList1);
		
		int num2 = employeeList2.getDLLlength();
		System.out.println("2st list, number of elements: "+ num2);
		System.out.println(employeeList2);

		employeeList1.append(employeeList2);
		int num3 = employeeList1.getDLLlength();
		System.out.println("number of elements after append: "+ num3);
		System.out.println(employeeList1);
		
//		System.out.println("employees with age less than equal to 31..");
//		employeeList1.deleteOlderThan31Age();
//		System.out.println(employeeList1);
		
//	    EmployeeDLL.printCommonEmployees(employeeList1, employeeList2); 

		EmployeeDLL employeeList3 = EmployeeDLL.concat(employeeList1, employeeList2);
		int num4 = employeeList3.getDLLlength();
		System.out.println("number of elements after concat: "+ num3);
		System.out.println(employeeList3);
	}
}
