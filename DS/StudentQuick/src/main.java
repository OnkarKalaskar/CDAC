import java.util.Scanner;

public class main {
	
public static void main (String [] args)
{
	System.out.println("Enter size of array...");
	Scanner sc = new Scanner (System.in);
	
	Student [] arr = new Student [sc.nextInt()];
	System.out.println("Enter elements......");
	Student s1 = new Student ();
    
    for (int i=0;i<arr.length;i++)
    {
    	Student s2 = s1.scanfun();
    	arr[i] = s2;
    }
	Quick.print(arr);
	Quick.quickSort(arr, 0, arr.length-1);
	Quick.print(arr);
	
}
}
