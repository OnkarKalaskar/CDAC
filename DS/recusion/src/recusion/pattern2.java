package recusion;

public class pattern2{
   public static void main(String [] args)
   {
	   int i=0;
	   fun(i);
   }

   static void fun(int x)
   {
	  if(x<5) 
	  { x=x+1;
	    fun(x);
	    for(int i=x;i<=5;i++)
	    {
	    	System.out.print("* ");
	    }
	    System.out.println();
	  }
   }
}