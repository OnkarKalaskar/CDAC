package Dlinklist;

public class Main {

	static public void main (String [] args)
	{
		Dlinklist list = new Dlinklist();
		
		list.InsertFirst(5);
		list.InsertFirst(3);
		list.InsertFirst(2);
		list.InsertFirst(1);
		list.InsertByPosition(2, 345);
		System.out.println(list);
		list.deleteLast();
		System.out.println(list);
		list.InsertByPosition(3, 000);
		System.out.println(list);
	}
}
