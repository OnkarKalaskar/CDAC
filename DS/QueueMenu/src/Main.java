
import java.util.Scanner;

public class Main {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of book data to enter:");
		int size= sc.nextInt();
		Queue boo= new Queue(size);
		Book b1= new Book(0,"0",0);
		
		int choice;
		do { 
			System.out.println("Enter choice between 1 to 4...");    
			System.out.println("1 : Insert details");
			System.out.println("2 : to remove");
			System.out.println("3 : show content");
			System.out.println("4 : exit");
			choice = sc.nextInt();
			if (choice==4)
			{
				break;
			}
			switch(choice)
			{
			case 1 : {
				       {
				  	     Book b=b1.scanfun();
				    	 boo.insert(b);
				       }
				     break;
					 }
			case 2 : {
			     	     boo.remove();
			     	      break;
					 }
			case 3 : {
				         System.out.println(boo);
				         break;
		     	     }
			default: {
				        System.out.println("Enter valid choice.....");
			            break;  
			         }
			}// end of switch
		}while(choice!=4);// end of switch
		System.out.println("End of process.................");
		}
		}
