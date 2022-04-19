import java.util.Scanner;

public class main {
   public static void main(String [] args)
   {
	   Clinklist list = new Clinklist();
	   Scanner sc = new Scanner (System.in);
	   Book b1 = new Book();
	   int choice =0;
	   do {
		   System.out.println("Enter a choice.........");
		   System.out.println("1: TO INSERT...");
		   System.out.println("2: TO APPEND...");
		   System.out.println("3: TO INSERT BY POSITION...");
		   System.out.println("4: TO DELETE FIRST...");
		   System.out.println("5: TO DELETE LAST...");
		   System.out.println("6: TO DELETE BY POSITION...");
		   System.out.println("7: TO EXIT...");
		   if (choice == 7)
		   {System.out.println();
			   int confirm;
			   Sysout
		   }
		   choice = sc.nextInt();
		   
		   switch (choice)
		   {
		   case 1: {
			          list.insert(b1.scanfun());   // b1 object sathi scanfun call kel ani insert madhe pathavla
			          break;
		   		   }
		   case 2: {
		          	  list.append(b1.scanfun());   // b1 object sathi scanfun call kel ani insert madhe pathavla
		          	  break;
	   		      }
		   
		   
		   }
	   }// end of do
   }
}
