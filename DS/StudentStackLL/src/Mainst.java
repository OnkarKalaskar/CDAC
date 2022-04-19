import java.util.Scanner;

public class Mainst {
  public static void main (String [] args)
  {   Scanner sc = new Scanner (System.in);
	  linklist link= new linklist(); 
	  linklist link2 = new linklist();
	  Student s1 = new Student("0",0,'0',0);
	  int choice = 0;
	  int choice1 = 0;
	  int ch =0;
	  do {
		  System.out.println("Enter choice 1: stack ; 2: queue ; 3: to exit....");
		  if (ch == 3)
			{
				break;
			}
		  ch = sc.nextInt();
		  
		  switch (ch)
		  {
		  case 1: 
		  do{
		    System.out.println("Enter choice of operation...");
			System.out.println("1: PUSH (To insert student at first)...");
			System.out.println("2: POP Delete first student info...");
			System.out.println("3: Show student info...");
			System.out.println("4: To exit...");
			if (choice == 4)
			{
				break;
			}
			  choice= sc.nextInt();
		  
		    switch (choice)
		    {
		  			case 1 : {
		  							link.insertFirst(s1.scanfun());
		  							System.out.println("-----------------------next choice-----------------------------");
		  							break;
		  					 }
		  			case 2 : {
		  							link.deletefirst();
		  							System.out.println("-----------------------next choice-----------------------------");
		  							break;
		  					 }
		  			case 3 : {
				      		   		System.out.println(link);
				      		   		System.out.println("-----------------------next choice-----------------------------");
				      		        break;
 		                     } 
		  
		  			default: {
		  				            System.out.println("Enter valid choice1.......");
		  			                break;
		  			         }
	        } 
          } while(choice!=4);
	       System.out.println("END OF STACK OPERATION"); 
	       break;
		  case 2:
		  do{
			  System.out.println("Enter choice of operation...");
			  System.out.println("1: Insert (To append)...");
			  System.out.println("2: Remove...");
			  System.out.println("3: Show student info...");
			  System.out.println("4: To exit...");
			  if (choice == 4)
				{
					break;
				}
			  choice1= sc.nextInt();
			  
			  switch (choice1)
			  {
			  			case 1 : {
			  							link2.append(s1.scanfun());
			  							System.out.println("-----------------------next choice-----------------------------");
			  							break;
			  					 }
			  			case 2 : {
			  							link2.deletefirst();
			  							System.out.println("-----------------------next choice-----------------------------");
			  							break;
			  					 }
			  			case 3 : {
					      		   		System.out.println(link2);
					      		   		System.out.println("-----------------------next choice-----------------------------");
					      		        break;
	 		                     } 
			  
			  			default: {System.out.println("Enter valid choice.2......");
			  			          break;
			  			         }
		      }
		  }while(choice1!=4);
		  System.out.println("End of queue");
		  break;
		  }
	  }while(ch != 3);
	  System.out.println("END OF PROCESS........");	 
  }
}