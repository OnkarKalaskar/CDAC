package recusion;

public class stackClass {
     private int [] arr;
     private int top;
     
     public stackClass()
     {
    	 this.arr = new int[5];
    	 this.top=-1;
     }
     public stackClass(int x)
     {
    	 this.arr = new int[x];
    	 this.top=-1;
     }
     
     public void push(int value)
     {
    	 if(this.top < this.arr.length-1)  // 4<4 fails goes to else
 		{
 			this.top++;
 			this.arr[top] = value;
 		}
 		else
 			System.out.println("Overflow...");
     }
     public int pop()
     {
    	 if(this.top != -1)
 		{

 			int value = arr[top];
 			this.top--;
 			return value;
 		}
 		else
 			System.out.println("Underflow...");
 			return 0; 
     }
      
    
     public String toString()
     {
    	String str ="";
    	if (this.top == -1) 
    		{str = "Stack is empty.";
    		}
    	else  // s1 bharat bharat 4th index vr alay tithun reduce houn -1 paryant yeil 
    	{
    		for(int i = this.top;i>=0;i--)
    		str = str + this.arr[i]+ ", "; 
    	}
    	return str;
     }
	public stackClass concat(stackClass s2) 
	{
		 stackClass s3 = new stackClass(this.arr.length + s2.arr.length);
		 for(int i=0 ;i<=this.top;i++)
		 {
			 s3.push(this.arr[i]);
		 }
		 for (int i=0;i<=s2.top;i++)
		 {
			 s3.push(s2.arr[i]);
		 }
		return s3;
	}
	/*private void print(stackClass s) {
		if (this.top==-1)
		{
			System.out.println("Stack is empty..");
		}
		else
		{ for(int i=top; i>=0; i--)
			System.out.print(this.arr[i] + ", ");
		}
	}*/
}
