
public class Queue {
   Book [] arr;
   int F;
   int R;
   
   Queue ()
   {
	  arr = new Book [5];
	  F = -1;
	  R =-1;
    }
   
   Queue (int x)
   {
	  arr = new Book [x];
	  F = -1;
	  R =-1;
    }
   public void insert(Book value)
   {  if(R<arr.length-1)
      {  R++;
         arr[R]= value;
	     if (F==-1)
	     {
		   F++;   //  r vadhat jail entry hot jail pn f 0th position lach asel 
	     }
      }
      else 
	     System.out.println("Queue is full..");
   }
   
   public Book remove(int x)
   {       Book value =new Book(0,"0",0);
	       if (F!=-1)
	        {
	          value=arr[F];
	         if(F != R)
	             { F++;
	             }
			  else 
			    {
				  F=R-1;
			    }
	       }
	       else System.out.println("queue is empty..."); //f==-1
	       return value;		
   }
   
   public String toString()
   {
	   
	   String str =" ";
	   if(F== -1)
		   str= "Queue is empty";
	   else	
		   {for
		      (int i=this.F;i<=this.R;i++)
			   {
				   str = this.arr[i] + ", \n";
			   }
		   }
	   return str;
   }
   public Queue concat(Queue q3) 
	{
		 Queue q4 = new Queue(this.arr.length + q3.arr.length);
		 for(int i=0 ;i<=this.arr.length;i++)
		 {
			 q4.insert(this.arr[i]);
		 }
		 for (int i=0;i<=q3.arr.length-1;i++)
		 {
			 q4.insert(q3.arr[i]);
		 }
		return q3;
	}
	     	   
   }


