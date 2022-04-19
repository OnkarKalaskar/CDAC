
public class Node{
  String data;
  Node next;
  
  
  public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

public Node ()
  {
	  this.data = null;
	  this.next = null;
  }

  public Node (String data)
  {
	  this.data = data;
	  this.next = null;
  }
  public Node (String data,Node next)
  {
	  this.data = data;
	  this.next = null;
  }
  
  public Node (Node next )
  {
	  this.data = null;
	  this.next = next;
  } 
  public String toString()
  {
	  return (" " + data);
  }
}
