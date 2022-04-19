
public class Node {
		  Book data;
		  Node next;
		  
		  public Node ()
		  {
			  this.data = null;
			  this.next = null;
		  }

		  public Node (Book data)
		  {
			  this.data = data;
			  this.next = next;
		  }
		  public Node (Book data,Node next)
		  {
			  this.data = null;
			  this.next = null;
		  }
		  
		  public Node (Node next )
		  {
			  this.data = null;
			  this.next = next;
		  } 
		  
		  public String toString()
		  {
			  String str = " ";
			  str = str + data + "";
			  return str;
		  }
		}