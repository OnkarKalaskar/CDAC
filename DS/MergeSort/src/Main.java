import java.util.Scanner;

public class Main {
 static public void main (String [] args)
 {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter size of array.");
	 int num = sc.nextInt();
	 int [] arr = new int [num];
	 System.out.print("Enter elements: ");
	 
	 for (int i=0; i<arr.length; i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 System.out.print("Array before sorting:  ");
	 merge.print(arr);
	 System.out.println();
	 
	 merge.mergeSort(arr,0, arr.length-1); //sending actual index
	 System.out.print("Array after sorting:  ");
	 merge.print(arr);
 }
}
