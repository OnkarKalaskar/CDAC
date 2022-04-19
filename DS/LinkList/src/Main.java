import java.util.Scanner;

public class Main {
  public static void main (String [] args)
  {
	  linklist link = new linklist();
	  Scanner sc = new Scanner (System.in);
	  int choice=0;
	  do {
		  System.out.println("Enter choice.....");
		  System.out.println("1: To enter element at start in linklist.....");
		  System.out.println("2: To append element.....");
		  System.out.println("3: To insert element at a particular position");
		  System.out.println("4: To delete first element");
		  System.out.println("5: To delete element by position");
		  System.out.println("6: To delete last element");
		  System.out.println("7: To reverse the list");
		  System.out.println("8: Smallest number of list");
		  System.out.println("9: Largest number of list");
		  System.out.println("10: Even numbers in list");
		  System.out.println("11: Odd numbers in list");
		  System.out.println("12: To print the elements");
		  System.out.println("12: To print the elements");
		  System.out.println("13: To exit");
		  System.out.println("15: To insert by value");
		  
		  choice = sc.nextInt();
		 
		  switch(choice)
		  {
		  case 1: {
			         System.out.println("Enter element ...");
			         int num = sc.nextInt();
			         link.insertFirst(num);
			         break;
		          }
		  case 2: {
		             int ch=0; 
			           do
		            	 {
		            	 System.out.println("1: Enter element to append... 2: exit");
		            	 ch = sc.nextInt();
		            	 switch (ch)
		            	 {
		            	 case 1 :
		            	   {
		            		 int num = sc.nextInt();
				             link.append(num);
		            	   }
		            	 }
		            	 }while(ch != 2); 
			           break;
	              }
		  case 3: {
	                 System.out.println("Enter element to insert and then its position respectively...");
	                 int num1 = sc.nextInt();  // enter number
	                 int num2 = sc.nextInt();  // enter valid position
	                 link.insertByPos(num1, num2); //(number, position)
	                 break;
                  }
		  case 15: {
	              System.out.println("Enter element after value to enter AND value to enter..");
	              int num1 = sc.nextInt();  // prev
	              int num2 = sc.nextInt();  //next
	              link.insertByValue(num1, num2); //(prev . to insert)
	              break;
		          }
		  case 4: {
              		 System.out.println("Enter delete first element...");
              		 link.deletefirst();
              		 break;
          		  }
		  case 5: {
       		 		 System.out.println("Enter delete element by position(enter position)...");
       		 		 int pos= sc.nextInt();
       		         link.deleteByPos(pos);
       		         break;
                  }
		  case 6: { // last element
		             link.deletelast();
		             break;
                  }
		  case 7: { // reverse element by reverse print only
		 		     System.out.println("To reverse the list(completely)...");
		             link.reversePrint();
		             break;
                  }
		  case 8: {// smallest number of all
			          link.smallestNumber();
		              break;
                 }
		  case 9:{// highest number of all
	                  link.largestNumber();
	                  break;
		  		 }
		  case 10:{// even number
                      link.evenNumber();
                      break;
  		          }
		  case 11:{// odd number
                    link.oddNumber();
                    break;
	              }
		  case 12:{// print all
              		System.out.println("elements in link are: "+ link);
              		break;
                  }
		  }
	  }while (choice != 13);
	  System.out.println("END OF PROCESS...");
	  sc.close();
  }
 
}
//link.append(36);
//link.append(46);
//link.append(56);
//link.append(66);
//link.append(76);
//link.append(86);
////link.insertFirst(6);
////link.deletelast();
//link.append(66); 
//link.deleteByPos(3);
//link.deletefirst();
//link.deletelast();
////System.out.println(link);
//
//link.reverse();
//System.out.println(link);