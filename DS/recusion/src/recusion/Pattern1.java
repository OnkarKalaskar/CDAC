//recursive function
package recusion;

public class Pattern1 {
   public static void main(String [] args)
   {
	   int i=0;
	   fun(i);
   }

   static void fun(int x)
   {
	   for(int i=0;i<x-1;i++)
	   		{		
		   		System.out.print("* ");
	   		}
	   		System.out.println();
	  if(x<5) 
	  { x=x+1;
	    fun(x);
	    for(int i=0;i<x;i++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	  }
   }
}