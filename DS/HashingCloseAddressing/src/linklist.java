
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
 
public Node getHead() {
	return head;
}
public void setHead(Node head) {
	this.head = head;
}
//-----------------------------------------------------------------------------------------------------------------
  //LENGTH OF LINK LIST
  int getLLlength()    // no of elements in LL
  {
	  int noOfNodes = 0;
	  Node it = head;
	  while (it != null)
	  {
		  noOfNodes++;
		  it = it.next;  
	  }
	  return noOfNodes;
  }
  //----------------------------------------------------------------------------------------------------------------- 
  //INSERT FIRST
  public void insertFirst(String data) //insert at 1st position prior to any other if theres already present or not.
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
  //----------------------------------------------------------------------------------------------------------------- 
  //APPEND
  public void append(String data)
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
  //----------------------------------------------------------------------------------------------------------------- 
  //INSERT BY POSITION
  public void insertByPos(String value, int pos)
  {
	  int noOfNodes = getLLlength();
	  if (pos == 1)    // position 1 la karaych asel tr insert first count karu shakto
	  {
		  insertFirst(value);   // nava tmp karaychi garaj pn nahi karan insert first madhe karto nava tmp
	  }
	  else if  (pos == noOfNodes+1) 
	  {
		 append(value) ;
	  }
	  else if (pos > 1 && pos < noOfNodes+1) // definitely between 1st and last
	  { 
		    Node tmp = new Node();
              Node it = head;
		    for(int i=1;i<pos-1;i++)
		    {
		    	it = it.next;
		    }
		    tmp.next = it.next;
		    it.next= tmp; //function sampla vr
		    tmp.data = value;
		    
	  }
	  else 
	  {
		  System.out.println("Invalid position....");
	  }  
  }
  //-----------------------------------------------------------------------------------------------------------------  
  //DELETE FIRST
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
  //----------------------------------------------------------------------------------------------------------------- 
  //DELETE LAST
  public void deletelast()
  { if (this.head == null)    
      {
	     System.out.println("Linklist is empty...");
      } 
  else 
	  {
	    if(this.head == null)
	  {
		  head  = null;
	  }
	  else 
	  {
		  Node t = head;
		  while(t.next.next!= null)
		  {
			  t = t.next;
		  }
			  t.next= null;
	  }}
  }
  //----------------------------------------------------------------------------------------------------------------- 
  //DELETE BY POSITION
  public void deleteByPos( int pos)
  {
	  int noOfNodes = getLLlength();
	  if (pos == 1)             // position 1 la karaych asel tr delete first count karu shakto
	  {
		  deletefirst();        // nava tmp karaychi garaj pn nahi karan delete first madhe karto nava tmp
	  }
	  else if  (pos == noOfNodes) 
	  {
		 deletelast() ;
	  }
	  else if (pos > 1 && pos < noOfNodes) // definitely between 1st and last
	  { 
		    Node tmp = new Node();
              Node it = head;
		    for(int i=0;i<pos-1;i++)
		    {
		    	it = it.next;   // it start head pasun vadhat vadhat delete karaycha tyacha adhi paryant jaun thambel
		    }
		    Node t = it.next;   //  temp node madhe delete karaycha to node
		     it.next = t.next;  //tempo node next delete cha pudhcha point karel
		     t.next= null;      //
	  }
	  else 
	  {
		  System.out.println("Invalid position....");
	  }  
  }
  //----------------------------------------------------------------------------------------------------------------- 
  //REVERSE 
  public void reverse() // completely reverse
  {
	  Node it = this.head;  // 
	  Node itp = null;
	  Node itn= head;    
	  while(it != null)
	  {
		  itn = it.next;    
		  it.next= itp;  
		  itp=it;
		  it = itn;
	  }
	  this.head=itp;    
  }
  //----------------------------------------------------------------------------------------------------------------- 
  // ONLY PRINT IN REVERSE ORDER
  public void reversePrint()   //only for wrapping (only will print in reverse manner)
  {
	  reversePrintrec(head);  // recursive function call
  }
  private void reversePrintrec(Node head) {
	if (head.next != null)
		reversePrintrec(head.next);
	
	System.out.println(head.data + ", ");
}
  //----------------------------------------------------------------------------------------------------------------- 
//  // SMALLEST NUMBER
//  public void smallestNumber()
//  { 
//	  Node it = this.head;
//	  Node min = new Node();
//	  min.data= 99999;
//	  while (it != null)
//	  {
//		  if (it.data < min.data)
//		  { 
//			min.data = it.data;
//		  }
//		  it = it.next;
//	   }
//	  System.out.println("Minimum number of all elements is: " + min.data);       
//  }
  //----------------------------------------------------------------------------------------------------------------- 
//  //LARGEST NUMBER
//  public void largestNumber()
//  {   Node it = this.head;
//	  Node max = new Node();
//	  max.data= -99999;
//	  while (it != null)
//	  {
//		  if (it.data > max.data)
//		  { 
//			max.data = it.data;
//			
//		  }
//		  it = it.next;  
//	   }
//	  System.out.println("Maximum number of all elements is: " + max.data);      
//  }
  //----------------------------------------------------------------------------------------------------------------- 
//  //EVEN NUMBER
//  public void evenNumber()
//  {
//      if(this.head == null)
//      {
//    	  System.out.println("Link list is empty....");
//      }
//      
//      System.out.print("Even numbers are : ");
//	  Node it = this.head;
//	  while(it != null)
//	  {
//	     if(it.data % 2 == 0)
//	     {
//		     System.out.print( it.data + ", ");
//	     }
//	     it = it.next;
//	  }
//	  System.out.println();
//  }
//  //----------------------------------------------------------------------------------------------------------------- 
//  //ODD NUMBER
//  public void oddNumber()
//  {
//      if(this.head == null)
//      {
//    	  System.out.println("Link list is empty....");
//      }
//      
//      System.out.print("Odd numbers are : ");
//	  Node it = this.head;
//	  while(it != null)
//	  {
//	     if(it.data % 2 != 0)
//	     {
//		     System.out.print( it.data + ", ");
//	     }
//	     it = it.next;
//	  }
//	  System.out.println();
//  }
  //----------------------------------------------------------------------------------------------------------------- 
  // INSERT BY VALUE - PASS VALUE AND AFTER THAT VALUE INSERT NEW VALUE
  /*public void insertByValue(int value, int value2)
  {   
	  Node tmp = new Node();
	  Node it = this.head;
	  while (it.data != value)
	    {
		  if (it.data == value2)
		     {
			   tmp = it.next;
			   it.next = tmp;
		     }  
	    it = it.next; 
	  }
	   
  }*/
  //----------------------------------------------------------------------------------------------------------------- 
  public int deleteValue(String inputData)
  {
	  int flag = 0;   // value change jhali tr flag change hoil
	  if (head != null)
	  { // ith ek variable 0 la initiate karta yeil ani to return karun hashing madhe content ahe ka nahi check karta yeil
		  int count = 1;    
		  Node it = head;
		  while (it != null)
		  {
			  if (it.data.equals(inputData))
			  {
				  deleteByPos(count);
				  flag = 1;
				  break;  
			  }
			  count++;
			  it = it.next;
		  }  
	  }
	  return flag;
  }
  /*------------------------------------------------------------------------------------------------------------------*/
  public boolean isPresent(String data) {
		if (head != null)
		{
			Node it = head;
			{
				if(it.data.equals(data))
					return true;
				
				it = it.next;
			}
		}
		return false;
	}
  /*------------------------------------------------------------------------------------------------------------------*/
  
  public String toString()
  {
	  String str = "";
	  // multiple nodes 
	  {
               		  Node n = this.head;
		  while(n != null)  // it vadhvat last node paryant
		  {
			  str += n.data + ", ";
			  n = n.next;
		  }
	  }
	  return str;
  }

 }
