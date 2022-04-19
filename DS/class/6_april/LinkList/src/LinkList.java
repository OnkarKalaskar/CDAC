
public class LinkList {

	private Node head;
	
	public LinkList() {
		this.head = null;
	}
	
	public LinkList(Node head) {
		this.head = head;
	}
	
	public void insert(int data)
	{
		Node tmp = new Node(data);
		
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			tmp.next = head;
			head = tmp;
		}
	}
	
	public void append(int data)
	{
		Node tmp = new Node(data);
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			Node it = head;
			
			while(it.next != null)
			{
				it = it.next;
			}
			
			//it reached at last node
			it.next = tmp;
			tmp.next = null;
		}
	}
	
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("LL is empty");
		}
		else
		{
			//Check if only 1 node in LL
			if(head.next == null)
			{
				head = null;
			}
			else
			{
				//More than 1 node..
				Node t = head;
				head = t.next;
				t.next = null;
			}
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
			//while(it.next != null)  ==> this is without last node
			while(it != null)   //  ==> with last node
			{
				str += it.data + ", ";
				it = it.next;
			}
		}
		return str;
	}
	
}
