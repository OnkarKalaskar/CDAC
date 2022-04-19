
public class stacklink {
	Node top;
	
	//push = insert first
	 public void insertFirst(int data) //insert at 1st position prior to any other if theres already present or not.
	  {
		  Node tmp = new Node(data);    //node class cha object hya madhe 1 Node tayyar jhala
		  
		  if (this.top == null)        //hya node cha node attribute check krtoy... head 0 mhanjhe pudhe ek pn node nahi ,
		  {
			  this.top = tmp;
		  }
		  else                          // 1 or multiple nodes pudhe
	  	  {
			  tmp.next = top;          //jr 1st node nasel tr to tyachya pudhchya node madhe jail
			  top = tmp;         
		  }
	  }
	 public void pop()  // pop = delete first  
 	  {
		  if (this.top == null)    
		  {
			  System.out.println("Linklist is empty...");
		  }
		  else
		  {
			  if (top.next == null) // if there is only 1 element
			  {
				  this.top = null;
			  }
			  else
			  {
				  //more than 1 nodes
				  Node tmp= this.top;  // head chya position la t ala 
				  top =  this.top.next;  // head pudhcha head madhe takla, 
				  tmp.next = null; // delete kela or last element 
			  }
		  }
	  }
	  
	  public String toString()
	  {
		  String str = "";
		  if (this.top == null)   // if only 1 node
		  {
			  str = "Link list is empty...";
		  }
		  else // multiple nodes 
		  {
	               		  Node n = this.top;
			  while(n != null)  // it vadhvat last node paryant
			  {
				  str += n.data + ", ";
				  n = n.next;
			  }
		  }
		  return str;
	  }

}
