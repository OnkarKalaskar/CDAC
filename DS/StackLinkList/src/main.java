import java.util.Scanner;

public class main {
	public static void main (String [] args)
	  {   Scanner sc = new Scanner(System.in);
		  stacklink stack = new stacklink();
		  int choice;
		  do {
			  System.out.println("1 : to insert element in stacks..");  // first in last go // insert first
			  System.out.println("2 : to pop element from stack..");  // delete first // insert ne top la yet jatil ani tech delete kel mhanjhe pop jhal
			  System.out.println("3 : to print stack..");
			  System.out.println("4 : to EXIT..");
			  
			  choice = sc.nextInt();
			  
			  
			  switch (choice)
			  {
			  case 1: { 
			            System.out.println("insert element (insert)");
					    int num = sc.nextInt();
					    stack.insertFirst(num);
				        break;
			          }
			  case 2: {
			        	System.out.println("");
			        	stack.pop();
			        	break;
		          	  }
			  case 3: {
				        System.out.println(stack);
			          }
			  default: {
				         System.out.println("Enter valid choice");
			           }
			  }
		  } while (choice != 4);// end of switch
		  System.out.println("End of process");
	  }
}