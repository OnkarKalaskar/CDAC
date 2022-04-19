import java.util.Scanner;

public class main {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to sort...");
		int num= sc.nextInt();
		Bubble a1= new Bubble(num);
		System.out.println("enter elements: ");
		//System.out.print("ARRAY before  sorting: ");

		for (int i=0;i<a1.arr.length;i++)
		{
			a1.arr[i]= sc.nextInt();
		}

		a1.InsertAsce();
		System.out.println("SORTED ARRAY after ascending IS: ");
		System.out.println(a1);

		a1.InsertDescending();
		System.out.println("SORTED ARRAY after ascending IS: ");
		System.out.println(a1);
	}
}
