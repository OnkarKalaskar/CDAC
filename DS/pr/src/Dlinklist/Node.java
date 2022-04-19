package Dlinklist;

public class Node {  // a node has a 3 elements 1 keeps referance of prev node , other to store reference of next node and data to store data
	int data;
	Node prev;
	Node next;
	
	public Node ()
	{
		data = 0;
		next = null;
		prev = null;
	}
	
	public Node(int data)
	{
		prev = null;
		this.data = data; 
		next = null;
	}

	public String toString()
	{
		String str = " ";
		str = str + data + " ";
		return str;
	}
}
