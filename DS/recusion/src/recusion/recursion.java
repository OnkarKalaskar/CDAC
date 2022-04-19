package recusion;

public class recursion {
   public static void main(String [] args)
	{
	   int i=0;
       fun(i);
	}

  private static void fun(int x)
  {
	  x= x+1;
	  System.out.print(x + ", ");
	  
	 if(x<5)
	 {   
		 fun(x);
		 System.out.print(x + ", ");
	 }
  }
}