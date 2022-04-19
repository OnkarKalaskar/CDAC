
public class Main {

	static public void main (String [] args)
	{
		Hashing hash = new Hashing(50);
		System.out.println("----------------------------linear probling------------------------");
		Student s1 = new Student();
		s1.scanfun();
		hash.linearInsert(s1);
		
		Student s2= new Student();
		s2.scanfun();
		hash.linearInsert(s2);
		
//		Student s3= new Student();
//		s3.scanfun();
//		hash.linearInsert(s3);
		
		System.out.println("linear insert "+ hash +"\n");
		
		hash.linearRemove(s2);
		System.out.println("linear insert after remove "+ hash +"\n");
	}
}
