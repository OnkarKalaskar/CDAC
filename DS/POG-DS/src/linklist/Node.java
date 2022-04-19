package linklist;

public class Node {

    int data;
    Node next;
    
    public Node()
    {
    	data = 0;
    	next = null;
    }
    public Node(int data)
    {
    	this.data = data;
    	next = null;
    }
    public String toString()
    {
    	String str = " ";
    	str = str+ data+", ";
    	return str;
    }
}
