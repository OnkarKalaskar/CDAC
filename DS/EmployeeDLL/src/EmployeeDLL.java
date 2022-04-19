
public class EmployeeDLL {
  private Node head;
  private Node tail;
  
  public EmployeeDLL()  //no argument constructor
  {
  head = null;
  tail = null;
  }
  
int getDLLlength()    // no of elements in LL
  {
	  int noOfNodes = 0;
	  Node it = head;
	  while (it != null)
	  {
		  noOfNodes++;
		  it = it.get_next();  
	  }
	  return noOfNodes;
  }
  
  public void insert (Employee e)  // insert first
  {  Node tmp = new Node();
	 Node new_node = new Node(e);  // jo employee cha data alay e variable madhe tr to new_node madhe taka
	 if (this.head == null && this.tail == null)
	 {
		 head=tail = new_node;   // head and tail new node la point kartay
	 }  
	 else 
	 {
		 new_node.set_next(head);   // 
		 head.set_prev(new_node);   // 
		 head = new_node;
	 }
  }
  
public void append (Employee e)
  {
	  Node new_node = new Node(e);
	  if (head== null && tail == null)
	  {
		  head = tail = new_node;
	  }
	  else 
	  {
		  tail.set_next(new_node);
		  new_node.set_prev(tail); 
		  tail = new_node; // tail = new node
	  }
  }

 public void append (String nm , int age , float sal)
{     
	  Employee e = new Employee(nm,age,sal);
	  Node new_node = new Node(e);
	  if (head== null && tail == null)
	  {
		  head = tail = new_node;
	  }
	  else 
	  {
		  tail.set_next(new_node);
		  tail=new_node; // tail = new node
		  new_node.set_prev(new_node); 
	  }
}

  public void insertAtPos(Employee e, int pos)
  { Node it = head; 
	  Node new_node = new Node (e);
	  
	  if (pos == 1)
	  {
		  insert (e);
		  return;
	  }
	  else
	  {
		   // int flag =0
		  for (int i=1;i<pos-1;i++)
		  {
			  if (it.get_next()==null)
			  {    
				  break;  // flag ==1
			  }
			  it = it.get_next();
		  }
		 // if (flag ==1) {sysout ("invalid choice")} 
	  }
	  new_node.set_next(it.get_next());  // it.next point krtoy to object ata new_node.next point karel
	  new_node.set_prev(it);             // new_node.prev = it;
	  it.set_next(new_node);             // it.next = new_node;
	  new_node.get_next().set_prev(new_node);  // new_node. = 
	  
  }
//  public void deleteOlderThan31Age()
//  {
//	  Node it =head;
//	  Node itp, deletable=null; 
//	  while(it!=null)
//	  {
//		  if(it.get_data().getAge() > 31 )    // head vala yeil adhi
//		  {   deletable = it;  // delete by position function call karaych i pathvaycha ani tith delete karaych
//			  it.get_prev().set_next(it.get_next());
//			  it.get_next().set_prev(it.get_prev());
//		  }
//		  it = it.get_next();
//		  deletable.set_prev(null);
//		  deletable.set_next(null);
//		  deletable.set_data(null);
//		  
//	  }
//  }
  public void deleteOlderThan31Age()
  {
	  Node it =head;
	  int i=1;
	  while(it!=null)
	  {
		  if(it.get_data().getAge() > 31 )    // head vala yeil adhi
		  {   
			  it = it.get_next();
			  deleteByPosition(i);
			  continue;
		  }
		 i = i+1;
		 it= it.get_next();
	  }
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
			else if (position > 1 && position < count)
			{
				Node it = head;
				for (int i=1 ; i<position-1 ;i++) // pos-1 ka tr aplyala delete karaych tych 1 adhi paryant aanaycha ahe.
				{
					it = it.get_next();
				}
				Node tmp = it.get_next();  // it.next delete karaycha ahe
				
				it.set_next(tmp.get_next());
				tmp.set_next(it.get_prev());

				tmp.set_next(null);
				tmp.set_prev(null);
				tmp.set_data(null);
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
				if (this.head.get_next() == null)
				{
					this.head = null;
				}
				else 
				{
					Node it = head;
					head = it.get_next();
					it = null;
				}
			}
		}
	 public void deletelast ()
		{
			if (tail == null)
			{
				System.out.println("list is empty.");
			}
			
			else {
				
				if(tail.get_prev() == null)//if (head.next == null) // (tail == head null)or tail prev jr null tr 1 ch element 
				{
					head = null;
					tail = null;
				}
				else {
					Node tmp = tail;
					tail = tail.get_next();
					tail.set_next(tail.get_prev());
					tmp.set_prev(null);
				}
			}
		}
  public void append (EmployeeDLL b)   // append linklist objects
  {
	  if (tail == null)
	  {
		  head = b.head;   // if 1st list is empty then this will append 2nd to first
	  }
	  else if (b.head == null && b.tail == null)
	  {
		  head = this.head;
	  }
	  else
	  {
		  this.tail.set_next(b.head);
	      b.head.set_prev(this.tail);
	  }
  }
  
  public static EmployeeDLL concat(EmployeeDLL l1, EmployeeDLL l2)
  {  EmployeeDLL l3 = new EmployeeDLL();
	  if (l1.head == null)
	  {
		   l3.head = l2.head;     // if 1st list is empty then this will append 2nd to first
	  }
	  else if (l2.head == null && l2.tail == null)
	  {
		 l3.head=l1.head;
	  }
	  else
	  {   l1.head.set_prev(null);
		  l1.tail.set_next(l2.head); // l1 chya tail.next madhe l2 cha head
	      l2.head.set_prev(l1.tail);  // l2 chya head.prev madhe l1 cha head
	      l2.tail.set_next(null);
	      l3.head = l1.head;
	      l3.tail = l2.tail;
	      
	  }
	  
	  return l3;
  }
  
  public void printCommonEmployees(EmployeeDLL l1, EmployeeDLL l2)
  {
	  Node it = l1.head;
  }
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
			  str += n.get_data() + ", \n";
			  n = n.get_next();
		  }
	  }
	  return str;
  } 
}
