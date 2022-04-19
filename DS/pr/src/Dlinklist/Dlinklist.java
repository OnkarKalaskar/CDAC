package Dlinklist;

public class Dlinklist {
	Node head;
	Node tail;
	
	public Dlinklist()
	{
		this.head = null;
		this.tail = null;
	}
	
	public void InsertFirst(int data)
	{
		Node newNode = new Node(data);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	public void append(int data)
	{
		Node newNode = new Node(data);
		if (tail != null)
		{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		else
		{
			tail = newNode;
			head = newNode;
		}
		
	}
	public int getLLlength()
	{
		int count = 0;
		Node it = head;
		while(it.next != null)
		{
			count++;
			it = it.next;
		}
		return count;
	}
	public void InsertByPosition(int position, int data)
	{
		Node tmp = new Node (data);
		int count = getLLlength();
		if(position == 1)
		{
			InsertFirst(data);
		}
		if(position == count)
		{
			append(data);
		}
		else if (position >1 && position <count)
		{
			Node it =head;
			for (int i =0 ;i<position-1;i++)  // to traverse upto position -1 
			{
				it = it.next;
			}
			tmp.next = it.next;
			tmp.prev = it;
			it.next = tmp;
		}
	}
	
	public void deleteFirst()
	{
		if (head != null)
		{
			Node it = head;
			head = it.next;
			it = null;
		}
		else
		{
			System.out.println("Link list is empty");
		}	
	}
	
	public void deleteLast()
	{
		if (tail != null)
		{
			Node tmp = tail;
			tail = tmp.prev;
			tmp.prev = null;
			tail.next = null;	
		}
		else
		{
			System.out.println("Link list is empty");
		}
	}
	
	public String toString()
	{
		Node it = head;
		String str = " ";
		while(it != null)
		{
			str = str + it + " ";
			it = it.next;
		}
		return str;
	}
}
