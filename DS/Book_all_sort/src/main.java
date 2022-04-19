import java.util.Scanner;

public class main {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers of books data to sort...");
		int num= sc.nextInt(); // number taken from user
		Insertion a1= new Insertion(num); // object insertion created which have array of book data type
		Book b1= new Book();   // book created
		for(int i=0;i<a1.arr.length;i++)    // to enter book data from user using function in book
		{
			a1.arr[i]= b1.scanfun();    // for every ith element of 
		}
	
		int choice = 0;
		do 
		{
			System.out.println("Enter choice.........");
			System.out.println("1: To sort books based on ascending PRICE .........");
			System.out.println("2: To sort books based on descending PRICE .........");
			System.out.println("3: To sort alphabhetically.........");
			System.out.println("4: To sort according to bookid.........");
			System.out.println("5: to exit.........");
			choice= sc.nextInt();
			if(choice==5)
			{
				break;
			}
			
			switch (choice)
			{
			case 1: {
				      a1.SortBypriceAscend();
				      System.out.println(a1);
				      break;
			        }
			case 2: {
				      a1.SortBypriceDescend();
			          System.out.println(a1);
			          break;
			        }
			case 3: {
			          a1.SortByAlpha();
		              System.out.println(a1);
		              break;
		            }
			case 4: {
			          a1.SortByBookid();
		              System.out.println(a1);
		              break;
		            }
			}
		}while (choice!=5);
		System.out.println("End of process.........");
	}
	
}
