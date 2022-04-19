
public class Dlinklist {
  Node head;
  Node tail;
  
  public Dlinklist ()   // constructor
  {
	  this.head = null;
	  this.tail = null;
  }
  
  public void insert (int value )
  {   
	  Node tmp = new Node(value);
	                           //can check head and tail both for first condition
	  if(head == null)         // tail == null  // donhi head ani tail ekch object point kartil
	  {
		  head = tmp;
		  tail = tmp;  
	  }
	  else
	  {
		   head.prev = tmp;    // tmp head chya adhi jail 
		   tmp.next = head;
		   head = tmp;
	  }
  }
  public void append (int value)
  {   Node tmp = new Node(value);
	  if(tail == null)         // append last la hot na mhanun
	  {
		  head = tmp;
		  tail = tmp;  
	  }
	  
	  else 
	  {   
		  tail.next = tmp;     // tail next madhe tmp jail 
	      tail.prev = tail;    // tail prev madhe tail taka	  
		  tail = tmp;
		  
	  }
	  }
  
   public void insertByPosition(int position , int value)
   {   
	   int count = getDLLlength();
	   Node tmp = new Node(value);
		if (position == 1)
		{
		   insert(value);
		}
		else if (position == count)
		{
			append(value);
		}
		else if (position > 1 && position < count+1)
		{
			Node it = head;
			for (int i=1;i<position-1;i++) // pos-1 ka tr aplyala delete karaych tych 1 adhi paryant aanaycha ahe.
			{
				it = it.next;
			}
		    tmp.next = it.next;
		    tmp.prev=it;
			it.next.prev = tmp;
			it.next = tmp;
		} 
   }
  
	public void deletelast ()
	{
		if (tail == null)
		{
			System.out.println("list is empty.");
		}
		
		else {
			
			if(tail.prev == null)//if (head.next == null) // (tail == head null)or tail prev jr null tr 1 ch element 
			{
				head = null;
				tail = null;
			}
			else {
				Node tmp = tail;
				tail = tail.next;
				tail.next = tail.prev;
				tmp.prev = null;
			}
		}
	}
	
	public void deletefirst()
	{
		if (this.head == null)
		{
			System.out.println("Link list is empty...");
		}
		else 
		{
			if (this.head.next == null)
			{
				this.head = null;
			}
			else 
			{
				Node it = head;
				head = it.next;
				it = null;
			}
		}
	}
	int getDLLlength()    // no of elements in LL
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
	
	public void deleteByPosition(int position)
	{
		int count = getDLLlength();
		if (position == 1)
		{
		   deletefirst();
		}
		else if (position == count)
		{
			deletelast();
		}
		else if (position > 1 && position < count-1)
		{
			Node it = head;
			for (int i=0 ; i<position-1 ;i++) // pos-1 ka tr aplyala delete karaych tych 1 adhi paryant aanaycha ahe.
			{
				it = it.next;
			}
			Node tmp = it.next;  // it.next delete karaycha ahe
			
			it.next = tmp.next;
			tmp.next.prev = it;

			tmp.next = null;
			tmp.prev = null;
			tmp = null;
		}
	}
		  	  
	public String toString() {
		String str = "";
		
		if(head == null)
		{
			str = "LL is empty..";
		}
		else
		{
			Node it = head;
			while(it != null)       //  ==> with last node
			{
				str += it + ", ";   // ith fakt node dila tr string node madhe lihavi lagel, or else direct ith data gheta yeil
				it = it.next;
			}
		}
		return str;
	}	    
  }

