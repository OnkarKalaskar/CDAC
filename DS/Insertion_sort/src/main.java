import java.util.Scanner;

public class main {

	static public void mainfun(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to sort...");
		int num= sc.nextInt();
		
		Insertion a1= new Insertion(num);
		
		System.out.println("enter elements: ");
		a1.scanfun(); //we are sending base address of array and entering values over there
		           
		System.out.println("SORTED ARRAY after ascending IS: ");
		a1.Insert();
		System.out.println(a1);
		
		
		//System.out.print("ARRAY before  sorting: ");
		
		System.out.println("SORTED ARRAY after descending IS: ");
		a1.InsertDescending();
		System.out.println(a1);
	}
}
