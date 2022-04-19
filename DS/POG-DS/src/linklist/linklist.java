package linklist;
public class linklist {
	static private Node head;

	public linklist()
	{
		this.head = null;
	}
	public linklist(Node x)
	{
		this.head = x;
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
	static public void insertFirst(int data) //insert at 1st position prior to any other if theres already present or not.
	{
		Node tmp = new Node(data);    //node class cha object hya madhe 1 Node tayyar jhala

		if (head == null)        //hya node cha node attribute check krtoy... head 0 mhanjhe pudhe ek pn node nahi ,
		{
		     head = tmp;
		}
		else                          // 1 or multiple nodes pudhe
		{
			tmp.next = head;          //jr 1st node nasel tr to tyachya pudhchya node madhe jail
			head= tmp;         
		}
	}
	//----------------------------------------------------------------------------------------------------------------- 
	//APPEND
	public void append(int data)
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
	public void insertByPos(int value, int pos)
	{
		int noOfNodes = getLLlength();
		if (pos == 1)    // position 1 la karaych asel tr insert first count karu shakto
		{
			insertFirst(value);   // nava tmp karaychi garaj pn nahi karan insert first madhe karto nava tmp
		}
		else if  (pos == noOfNodes+1)  // New element to be enter last
		{
			append(value) ;
		}
		else if (pos > 1 && pos <= noOfNodes) // definitely between 1st and last
		{ 
			Node tmp = new Node(value);
			Node it = head;
			for(int i=1;i<pos-1;i++)  // reaching to the node which is prior to required position 
			{
				it = it.next;
			}
			tmp.next = it.next;       // 
			it.next = tmp; //function sampla vr
			//		    tmp.data = value;

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
				Node temp= this.head;  // head chya position la t ala 
				head =  this.head.next;  // head pudhcha head madhe takla, 
				temp.next = null; // delete kela or last element 
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
			for(int i=1;i<pos-1;i++)  // linklist starts from 1
			{
				it = it.next;   // it start head pasun vadhat vadhat delete karaycha tyacha adhi paryant jaun thambel
			}
			tmp = it.next;   //  temp node madhe delete karaycha to node
			it.next = tmp.next;  //tempo node next delete cha pudhcha point karel
			tmp.next= null;      //
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
	private void reversePrintrec(Node head) {  // 12 24 23 7 8 5 23 
		if (head.next != null)
			reversePrintrec(head.next);          // unfinished recursive call
		// until head.next is null,, condition fails and will execute next line
		System.out.println(head.data + ", ");    // values will print in backward recursion 23 5 8 7 23 24 12
	}
	//----------------------------------------------------------------------------------------------------------------- 
	// SMALLEST NUMBER
	public void smallestNumber()
	{ 
		Node it = this.head;
		Node min = new Node(99999);
		while (it != null)
		{
			if (it.data < min.data)  // if value of it is less than value of min put min value in min
			{ 
				min.data = it.data;
			}
			it = it.next;
		}
		System.out.println("Minimum number of all elements is: " + min.data);       
	}
	//----------------------------------------------------------------------------------------------------------------- 
	//LARGEST NUMBER
	public void largestNumber()
	{   Node it = this.head;
	Node max = new Node();
	max.data= -99999;
	while (it != null)
	{
		if (it.data > max.data)
		{ 
			max.data = it.data;

		}
		it = it.next;  
	}
	System.out.println("Maximum number of all elements is: " + max.data);      
	}
	//----------------------------------------------------------------------------------------------------------------- 
	//EVEN NUMBER
	public void evenNumber()
	{
		if(this.head == null)
		{
			System.out.println("Link list is empty....");
		}

		System.out.print("Even numbers are : ");
		Node it = this.head;
		while(it != null)
		{
			if(it.data % 2 == 0)
			{
				System.out.print( it.data + ", ");
			}
			it = it.next;
		}
		System.out.println();
	}
	//----------------------------------------------------------------------------------------------------------------- 
	//ODD NUMBER
	public void oddNumber()
	{
		if(this.head == null)
		{
			System.out.println("Link list is empty....");
		}

		System.out.print("Odd numbers are : ");
		Node it = this.head;
		while(it != null)
		{
			if(it.data % 2 != 0)
			{
				System.out.print( it.data + ", ");
			}
			it = it.next;
		}
		System.out.println();
	}
	//----------------------------------------------------------------------------------------------------------------- 
	//  // INSERT BY VALUE - PASS VALUE AND AFTER THAT VALUE INSERT NEW VALUE
	public void insertByValue(int present_value, int new_value) 
	{   
		int count = 0;
		int n = getLLlength();
		Node it = head;

		while (it.data != present_value)
		{
			count++;   
			it = it.next;
		}                  // it is pointing to present node

		if (count == 0)
		{
			insertFirst(new_value);
		}
		else if (count == n)
		{
			append(new_value);
		}
		else
		{
			Node temp = new Node(new_value);
			temp.next = it.next;    
			it.next = temp;

		}

	}
	//----------------------------------------------------------------------------------------------------------------- 
	//  public void insertByValue(int prev_value, int insert_value)
	//  {
	//	  int pos = 0;
	//	  for (Node it = head ; it.next != null ; it = it.next)
	//	  {
	//		  if (it.data != prev_value)
	//		  {
	//			  insertByPos(insert_value, pos);
	//			  break;
	//		  }
	//		  pos++;
	//	  }  
	//  }
	public String toString()
	{
		String str = "";
		if (this.head == null)   // if only 1 node
		{
			str = "Link list is empty...";
		}
		else // multiple nodes 
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
	//-----------------------------------------------------------------------------------------------------------------

	 public static Node reversePart(Node half) // completely reverse
	  {
		  Node it = half;  // 
		  Node itp = null;
		  Node itn= half;    
		  while(it != null)
		  {
			  itn = it.next;    
			  it.next= itp;  
			  itp=it;
			  it = itn;
		  }
		  half=itp;
		  return half;
	  }
	public static boolean isPalindrome(linklist list)
	{
		Node slow, fast, second_start, prev_slow;
		boolean result;
		if((list.head==null)||(list.head.next==null))
			result = true;
		else
		{
			prev_slow=second_start=fast=slow=head;  // all are at head
			
			while(fast.next!=null && fast.next.next!=null)
			{
				prev_slow = slow;
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("Middle node : " + slow.data);
			second_start = slow.next;
			
			if(fast.next == null) //  if odd number nodes in list
			{
				second_start = reversePart(second_start);
				prev_slow.next=null;
				result = isIdentical(head, second_start);
				
				second_start = reversePart(second_start);
				prev_slow.next = second_start;
			}
			
			else
			{
				second_start = reversePart(second_start);
				slow.next=null;
				result = isIdentical(head, second_start);
				
				second_start = reversePart(second_start);
				slow.next = second_start;
			}
		}
		 return result;
	}
	
	static public boolean isIdentical(Node s1, Node s2)
	{
		while(true)
		{
			if(s1==null && s2==null)
				return true;
			
			if(s1==null || s2==null)
				return false;
			
			if(s1.data != s2.data)
				return false;
			
			s1 = s1.next;
			s2= s2.next;
			
		}
		
		



























	}
}
