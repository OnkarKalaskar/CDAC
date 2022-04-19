package recusion;

import java.util.Scanner;

public class factorial {
  public static void main(String [] args)
  {   System.out.println("Enter number to find factorial: ");
	  Scanner sc = new Scanner (System.in);
      int num= sc.nextInt();
	  long f = fact(num);
	  System.out.println("Factorial of "+ num+": "+f);
  }

private static long fact(int n) {
    if(n==0)
    {return 1;
    }
    return (n*fact(n-1));
}
}
