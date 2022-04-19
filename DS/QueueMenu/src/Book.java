
import java.util.Scanner;

public class Book {
   int Bookid;
   String BookName;
   float BookPrice;
   
   Book(int x, String nm, float y)
   { Bookid= x;
	 BookName= nm;
	 BookPrice = y;   
   }
 
  void setBookid(int x)
  {Bookid= x;
  }
  int getBookid()
  {return Bookid;
  }
  
  void setBookName(String x)
  {BookName= x;
  }
  String getBookName()
  {return BookName;
  }
  
  void setBookPrice(float x)
  {BookPrice= x;
  }
  float getBookPrice()
  {return BookPrice;
  }
  
  void display()
  {
	System.out.println("BookID:"+ Bookid +"   Book Name:"+ BookName +"   Book Price"+ BookPrice);
  }

  public String toString()
  {
	String str= "BookID:"+ Bookid +"   Book Name:"+ BookName +"   Book Price"+ BookPrice;
	return str;
  }
  public Book scanfun()
  {    
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter bookID: ");
	     Bookid= sc.nextInt();
	  
	      {System.out.println("Enter book Name: ");
	       BookName= sc.next();
	      }
	     
	     System.out.println("Enter book Price: ");
	     BookPrice= sc.nextFloat(); 
	     Book b1=new Book(Bookid,BookName,BookPrice);
	 
	     System.out.println("-----------next entry-------"); 
	     return b1;
  }
}
