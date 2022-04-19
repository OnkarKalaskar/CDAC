package recusion;

import java.util.Scanner;
/*public class stackMain {
	static Scanner sc= new Scanner(System.in);
	
	public static void main (String [] args) {
	  System.out.println("Enter size of 1st stack: ");
      int num1 = sc.nextInt();
      System.out.println("Enter size of 2st stack: ");
      int num2 = sc.nextInt();
      stackClass s1 = new stackClass(num1);
      stackClass s2 = new stackClass(num2);
      int choice, res;
      do { System.out.println("Enter choice between 1 to 4...");
    	   System.out.println("1 : to push");
    	   System.out.println("2 : to pop");
    	   System.out.println("3 : to check equality");
    	   System.out.println("4 : exit");
    	   choice = sc.nextInt();
    
    switch (choice)
    {
    case 1: {
    	        System.out.println("number of elements to push: ");
    	        int num3= sc.nextInt();
    	        System.out.println("Enter elements: ");
    	        for(int i=0;i<num3;i++)
    	        {   int num= sc.nextInt();
    	        	s1.push(num);
    	        }
    	        break;
            }
    case 2: {
    			System.out.println("number of elements to pop: ");
    			int num3= sc.nextInt();
    			System.out.println("Enter elements: ");
    			for(int i=0;i<num3;i++)
    			{   int num= sc.nextInt();
    				s1.pop();
    			}
    			break;
    		}
    case 3: {
		        System.out.println("number of elements to pop: ");
		        int num3= sc.nextInt();
		        System.out.println("Enter elements: ");
		        for(int i=0;i<num3;i++)
		        {   int num= sc.nextInt();
		            s1.pop();
		        }
		break;
	}
    }//endof switch
    }//end of do
    


    }//end of main
    }//end of class
*/





import java.util.Scanner;

public class stackMain {
 
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
    {
    	stackClass s1 = new stackClass();
    	s1.push(10);
    	s1.push(90);
    	s1.push(80);
    	s1.push(30);
    	s1.push(88);
    	s1.pop();
    	
    System.out.println(s1);
    
    stackClass s2= new stackClass(10);
    System.out.println("enter number to push: ");
       for (int i=0;i<10;i++)
       {
         s2.push(40);
       }
       System.out.println(s1);
       System.out.println(s2);
       stackClass s3= s1.concat(s2);
       System.out.println(s3);
       //print();
       
       
    }
}
}
