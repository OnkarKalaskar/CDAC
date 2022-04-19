
public class Clinklist {
  Node head;
  
  public Clinklist ()
  {
	  head = null;
  }
  
  public void insert (Book value)
  {
	 Node tmp = new Node(value);
	 
	 if (head == null)
	 {
		 head = tmp;
	     head.next = tmp;
	 }
	 else 
	 {
		 Node it = new Node();
		 it = head;
		 while (it.next != head)
		  {
			 it = it.next;
		  }
		 
		 it.next = tmp;
		 tmp.next = head;
		 head = tmp;
	 }
  }
  public void append (Book value)
  {
	  Node tmp = new Node(value);
		 
		 if (head == null)  // check for 1st node
		 {
			 head = tmp;
		     head.next = tmp;
		 }
		 else 
		 {
			 
			 Node it = new Node();
			 it = head;  // it started from head
			 while (it.next != head)  // loop will compare next of it until next is head 
			 {
				 it = it.next;
			 }
			 it.next = tmp;  
			 tmp.next = head;
		 } 
  }
  public int getLLlength()    // no of elements in LL
  {
	  if (head == null)
	  {
		  return 0; // LL is empty
	  }
	  else
	  {   int noOfNodes = 1;  // no of nodes count 1 pasun start jhala, 
		  Node it = head.next;
		  while (it != head)  // 1 count kami yeil karan last chya adhi cha paryant mojtoy
		  {
			  noOfNodes++;
			  it = it.next;  
		  }
		  return noOfNodes;
	  }
	 
  }
  
  public void insertByPos (Book value, int pos)
  {
	  Node tmp = new Node(value);
	  int count = getLLlength();
	  if (pos == 1)
		  insert(value);
	  
	  else if (pos == count+1) //
	  {
		  append (value);
	  }
	  
	  else if (pos>1 && pos <count+1)
	  {
		  Node it = head;
		  for(int i=1;i<pos-1;i++)  
		  {
			  it = it.next;        
		  }            
		  tmp.next = it.next;
		  it.next = tmp;
	  }
	  else
	  {
		  System.out.println("Enter valid choice..");
	  }
  }
  public void deleteFirst ()
  {
	  if (head == null)   // no node
	  {
		  System.out.println("Link list is empty...");
	  }
	  else if (head.next == head)  // one node
	  {
		  head.next = null;
		  head = null;
	  }
	  else 
	  {
		  Node tmp = head;
		  Node it = head;
		  while (it.next != head)
		  {
			  it = it.next;
		  }
		  head = head.next;
		  it.next = head;
		  tmp.next = null;
	  }
  }
  public void deleteLast ()
  {
	  if (head == null)
	  {
		  System.out.println("LL is empty");
	  }
	  else if (head.next == head)
	  {
		  head.next = null;
		  head = null;
	  }
      else 
      {
		  Node it = head.next; // it pudhcha point krtoy
		  while(it.next.next != head) //it cha next part madhe next valyacha address, an to head ahe ka
		  {
			  it = it.next;
		  }
		  Node tmp = it.next; // it chya pudh tmp la delete karaych ahe
		  
		  it.next = head;
		  tmp.next = null;
      }
  }
  public void deleteByPos (int pos)
  {
	  int count = getLLlength();
	  if (pos == 1)
		  deleteFirst();
	  
	  else if (pos == count+1) //
	  {
		  deleteLast();
	  }
	  
	  else if (pos>1 && pos <count+1)
	  { 
		  Node tmp = head;
		  Node it = head;
		  for(int i=1;i<pos-1;i++)  
		  {
			  it = it.next;
			  tmp = tmp.next;
		  }            
		  tmp = tmp.next; // now tmp is showing element which want to delete 
	      it.next = tmp.next;
	      tmp.next = null;
	  }
	  else
	  {
		  System.out.println("Enter valid choice..");
	  }
  }
  public String toString()
  {
	  String str = "";
	  
	  if ( head == null )
	  {
		  str = "Circular linklist is empty...";
	  }
	  
	  else 
	  {
		  Node it = new Node();
		     it = head;  // head cha next pasun it start hoil
			 while (it.next != head)
			 {
				 str = str + it + ", "; //ith it.data kel tr node madhe to string chi garaj nahi
				 it = it.next;
			 }
			str = str + it + ", ";
	  }
	  return str;
  }
}
