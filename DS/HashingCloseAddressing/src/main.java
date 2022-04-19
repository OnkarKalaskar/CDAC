
public class main{
   public static void main(String []args){
   
	  Hashing arrhash = new Hashing(50);
	  
	  arrhash.insertLin("onkar");   // passing string
	  arrhash.insertLin("pankaj");
	  arrhash.insertLin("onkar");
	  arrhash.insertLin("sneha");
	  
	  arrhash.removeLin("pankj");
	  
	  //System.out.println(arrhash);
   }
}
