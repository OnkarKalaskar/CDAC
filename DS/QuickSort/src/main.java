import java.util.Scanner;

public class main {
	
public static void main (String [] args)
{
	System.out.println("Enter size of array...");
	Scanner sc = new Scanner (System.in);
	
	int [] arr = new int [sc.nextInt()];
	System.out.println("Enter elements......");
	
	for( int i=0;i<arr.length;i++ )
	{
		arr[i] = sc.nextInt();
	}
	Quick.print(arr);
	Quick.quickSort(arr, 0, arr.length-1);
	Quick.print(arr);
	
}
}
