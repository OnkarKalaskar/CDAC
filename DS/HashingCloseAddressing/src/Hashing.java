public class Hashing {
    linklist [] headArray;
    
    public Hashing(int size) {	
    	headArray = new linklist[size];
    	for (int i=0 ; i<headArray.length;i++)
    	{
    		headArray[i]  = new linklist();
    	}
    }
    
    public int hashFunction(String data)    // he function int return karel jo arr cha index asel
    {
    	int sum=0;
    	for ( int i = 0;i < data.length();i++ )
    	{
    		sum = sum + data.charAt(i);      // char aatun int ch asto  // asciii value add hoil
    	}
    	int index = sum % headArray.length;  // will give index of array
    	return index;
    	
    }
    public void insertLin(String data)  
    {
    	int index = hashFunction(data);    // index or key bhetel
    	System.out.println(data + " got key from hashFunction = "+ index);
    	
    	headArray[index].append(data);    // e.g. 1st index chya ll madhe data append
    	
    	System.out.println(" and is placed at" + index);
    }
     
    public void removeLin(String data)
    {
    	int index = searchLin(data);
    	int status = headArray[index].deleteValue(data);
    	if(status == 0)
    	{
    		System.out.println(data + " not found");
    	}
    	else
    		System.out.println(" removed from "+ index);
    }
  
	public int searchLin(String data) {
		int index = hashFunction(data); // hash function madhun key yeil
		if(headArray[index].isPresent(data)) // key through aalelya index cha content user string sobat compare kela 
		{
		   System.out.println(data + " key from hashFunction "+ index);   // if content same then return that index to delete
		}
		else
		{
			System.out.println(data+" not found");
		}
		return index;
	}
	
    public String toString() {
    	String str = " ";
    	for(int i=0; i<headArray.length;i++ )
    	{
    		str = str + headArray[i] + ", ";
    	}
    	return str;
    }
}
