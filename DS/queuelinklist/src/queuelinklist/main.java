package queuelinklist;

import java.util.Scanner;

public class main {
  public static void main (String [] args)
  {   Scanner sc = new Scanner(System.in);
	  quelink queue = new quelink();
	  int choice;
	  do {
		  System.out.println("1 : to enter element in queue..");  // 
		  System.out.println("2 : to remove element in queue..");  // delete first
		  System.out.println("3 : to print queue..");
		  System.out.println("4 : to EXIT..");
		  
		  choice = sc.nextInt();
		  
		  
		  switch (choice)
		  {
		  case 1: { 
		            System.out.println("insert element (append)");
				    int num = sc.nextInt();
				    queue.append(num);
			        break;
		          }
		  case 2: {
		        	System.out.println("");
		        	queue.deletefirst();
		        	break;
	          	  }
		  case 3: {
			        System.out.println(queue);
		          }
		  default: {
			         System.out.println("Enter valid choice");
		           }
		  }
	  } while (choice != 4);// end of switch
	  System.out.println("End of process");
  }
}
