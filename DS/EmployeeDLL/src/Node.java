
public class Node {   
   private Employee data;   
   private Node prev;
   private Node next;
   
   Node ()
   {
	   data= null;
	   prev=null;
	   next=null;
   }
   Node(Employee e)   // employee constructor 
   {
	   data = e;
	   prev = next = null;
   }
public Employee get_data() {
	return data;
}
public void set_data(Employee data) {
	this.data = data;
}
public Node get_prev() {
	return prev;
}
public void set_prev(Node prev) {
	this.prev = prev;
}
public Node get_next() {
	return next;
}
public void set_next(Node next) {
	this.next = next;
}
   
}
