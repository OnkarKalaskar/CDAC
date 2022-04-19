
public class main {
  public static void main (String [] args) {
	  Dlinklist dlink = new Dlinklist();
	  
//	  dlink.insert(50);  // 50 
//	  dlink.insert(30);  // 30 50 
//	  dlink.insert(20);  // 20 30 50 
//	  dlink.insert(10);  // 10 20 30 40
	  dlink.append(30);
	  dlink.append(31);
	  dlink.append(33);
	  dlink.append(32);
	  dlink.append(36);   // 10 20 30 40 3
	  dlink.append(26);   // 10 20 30 40 3 2
	  dlink.insertByPosition(3,34);
	  System.out.println(dlink);
	  //dlink.deletefirst();
	  //dlink.deleteByPosition(1);
	 dlink.insertByPosition(3, 111);  // position followed by value to insert
	  System.out.println(dlink);
  }
} 
