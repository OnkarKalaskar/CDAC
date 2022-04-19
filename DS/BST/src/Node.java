
public class Node {
	int data;
	Node left;
	Node right;
	
	public Node()
	{
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	
	public Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public Node(int data, Node n1, 	Node n2)
	{
		this.data = data;
		this.left = n1;
		this.right = n2;
	}
	
	public String toString()
	{
		String str = "";
		str = str + data + ", ";
		return str;
	}
}
