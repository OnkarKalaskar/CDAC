import java.util.Scanner;

public class Mainst {
  public static void main (String [] args)
  {   Scanner sc = new Scanner (System.in);
	  linklist link= new linklist();  
	  Student s1 = new Student("0",0,'0',0);
	  int choice = 0;
	  do {
		  System.out.println("Enter choice of operation...");
		  System.out.println("1: To insert student (at first)...");
		  System.out.println("2: To append student data in list...");
		  System.out.println("3: Delete first student info...");
		  System.out.println("4: Delele last student info...");
		  System.out.println("5: Show student info...");
		  System.out.println("6: To exit...");
		  choice= sc.nextInt();
		  
		  switch (choice)
		  {
		  case 1 : {
			           link.insertFirst(s1.scanfun());
			           System.out.println("-----------------------next choice-----------------------------");
			           break;
		           }
		  case 2 : {
	           		   link.append(s1.scanfun());
	           		System.out.println("-----------------------next choice-----------------------------");
	           		   break;
          		   }
		  case 3 : {
      		   		   link.deletefirst();
      		   		   System.out.println("-----------------------next choice-----------------------------");
      		           break;
 		           }
		  case 4 : {
		   		   	   link.deletelast();
		   		   	System.out.println("-----------------------next choice-----------------------------");
		               break;
                   }
		  case 5: {
			           System.out.println(link);
			           System.out.println("-----------------------next choice----------------------------");
			           break;
		          }
		  default: {
			           System.out.println("Enter valid choice.......");
		           }
		  
	  }
  }   while (choice != 6);
	  System.out.println("End of the process...............");
  }
  
}