package queuelinklist;
public class quelink {  // last in first out
	 private Node top;
	 
	//append == insert krtoy 
	 public void append(int data)
	  {
		  Node tmp = new Node (data); //nava tmp banla tyat data aanla
		  if (top== null)
		  {
			  top = tmp;
		  }
		  else 
		  {
			  Node it = top;          // nava node it ghetla tyat head gela
			  while (it.next != null)  // last node paryant jai paryant
			  {
				  it = it.next;        // it vadhel
			  }
			  //last position la pohochlya vr 
			  it.next = tmp;          // hyach next la append la pathvleli value jail
			  tmp.next = null;        //tmp last node mang tithe ref 0 yeil pudh sathi 
			                          //  it.next.next ne pn null karta yeil
		  }
	  }
	  
	  // delete first = remove
	  public void deletefirst()
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
				  Node t= this.top;  // head chya position la t ala 
				  top =  this.top.next;  // head pudhcha head madhe takla, 
				  t.next = null; // delete kela or last element 
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
