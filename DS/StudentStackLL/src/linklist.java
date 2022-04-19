
public class linklist {
  Node head;
  
  public linklist()
  {
	  this.head = null;
  }
  public linklist(Node x)
  {
	  this.head = x;
  }
  
  public void insertFirst(Student data) //insert at 1st position prior to any other if theres already present or not.
  {
	  Node tmp = new Node(data);    //node class cha object hya madhe 1 Node tayyar jhala
	  
	  if (this.head == null)        //hya node cha node attribute check krtoy... head 0 mhanjhe pudhe ek pn node nahi ,
	  {
		  this.head = tmp;
	  }
	  else                          // 1 or multiple nodes pudhe
  	  {
		  tmp.next = head;          //jr 1st node nasel tr to tyachya pudhchya node madhe jail
		  head= tmp;         
	  }
  }
  
  //append
  public void append(Student data)
  {
	  Node tmp = new Node (data); //nava tmp banla tyat data aanla
	  if (head == null)
	  {
		  head = tmp;
	  }
	  else 
	  {
		  Node it = head;          // nava node it ghetla tyat head gela
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
  
  public void deletefirst()
  {
	  if (this.head == null)    
	  {
		  System.out.println("Linklist is empty...");
	  }
	  else
	  {
		  if (head.next == null) // if there is only 1 element
		  {
			  this.head = null;
		  }
		  else
		  {
			  //more than 1 nodes
			  Node t= this.head;  // head chya position la t ala 
			  head =  this.head.next;  // head pudhcha head madhe takla, 
			  t.next = null; // delete kela or last element 
		  }
	  }
  }
  /*public void deletelast()
  {   
	  if (this.head == null)
	  {
		  this.head= null;
	  }
	  else
	  {  if (head.next == null)
	     {
		  head = null;	     
		 }
	     Node t = head.next;
	     {
	    	 while (head.next != null)
	    	 {
	    		 t = t.next;
	    	 }
	    	 t.next=null;
		 }	
	  }
  }*/
  
  public void deletelast()
  {   
	  if (this.head == null)
	  {
		  this.head= null;
	  }
	  else
	  {  if (head.next == null)
	     {
		  head = null;	     
		 }
	  else 
	     {   Node it = head;
	    	 while (it.next.next != null) // upto 2nd last node
	    	 {
	    		 it = it.next;
	    	 }
	    	 it.next=null;
		 }	
	  }
  }
  public String toString()
  {
	  String str = "";
	  if (head == null)   // if only 1 node
	  {
		  str = "Link list is empty...";
	  }
	  else               // multiple nodes 
	  {
		  Node n = this.head;
		  while(n != null)  // it vadhvat last node paryant
		  {
			  str += n.data + " \n";
			  n = n.next;
		  }
	  }
	  return str;
  }
 }