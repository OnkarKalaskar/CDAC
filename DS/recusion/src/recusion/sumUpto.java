package recusion;

import java.util.Scanner;

public class sumUpto {
  public static void main (String [] args)
  {	  System.out.println("Enter number upto which sum to found: ");
  	  Scanner sc = new Scanner (System.in);
  	  int num= sc.nextInt();
	  int res = sum(num);
	  System.out.println("sum of all numbers from 0 to " + num +" : "+res);
  }

private static int sum(int n) {
	if(n==0)
	return 0;
	return (n+sum(n-1));
}
}
