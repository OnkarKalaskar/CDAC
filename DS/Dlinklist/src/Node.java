
public class Node {
	  Node prev;
	  int data;
	  Node next;
	  
	  public Node (int data)
	  {
		  this.prev = null;
		  this.data = data;
		  this.next = null;
	  }
	  public Node (Node prev,int data,Node next) 
	  {   this.prev = prev;
		  this.data = 0;
		  this.next = next;
	  }
	  public String toString() {
			return ("" + data);
		}   
}
