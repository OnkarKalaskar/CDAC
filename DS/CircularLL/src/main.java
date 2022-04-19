
public class main {
public static void  main(String [] args)
{
	Clinklist CLL = new Clinklist();
	
	CLL.append(10);
	CLL.append(20);
	CLL.append(30);
	System.out.println("APPEND : \n" +CLL);
	CLL.insert(50);
	System.out.println("INSERT : \n" +CLL);
	
	CLL.insertByPos(60,2);
	System.out.println("Inset by position: \n"+ CLL);
//	int num = CLL.getLLlength();
	
	CLL.deleteLast();
	System.out.println("last delete: \n"+ CLL);
	
    CLL.deleteFirst();
    System.out.println("first delete: \n"+ CLL);
    
    CLL.deleteByPos(3);
	System.out.println("Delete by pos: \n"+CLL);
}
}
