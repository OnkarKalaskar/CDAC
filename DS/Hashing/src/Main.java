
public class Main {
	
	public static void main (String [] args)
	{
		Hashing hash = new Hashing(25);
		System.out.println("----------------------------linear probling------------------------");
		hash.insertLin("onk");
		hash.insertLin("onk");
		hash.insertLin("vis");
		hash.insertLin("sun");
		hash.insertLin("moon");
		hash.insertLin("onk");
		hash.removeLin("moo");
		System.out.println("linear insert "+ hash +"\n");
		
		System.out.println("---------------------------- probling------------------------");
		hash.insertEasy("abc");
		hash.insertEasy("abc");
		hash.insertEasy("xyz");
		hash.insertEasy("pqr");
		hash.removeEasy("abc");
		//System.out.println("linear insert "+ hash +"\n");
		
		System.out.println("----------------------------quadratic probling------------------------");
		hash.insertQ("ABC");
		hash.insertQ("ABC");
		hash.removeQ("ABC");
		System.out.println("quadratic insert "+ hash +"\n");
		
		
		
	}
}
