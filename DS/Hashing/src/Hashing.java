
public class Hashing {
	String [] strArray;

	public Hashing(int size) {	
		strArray = new String [size];
	}
/*---------------------HASH FUNCTION------------------------------------------------------------------------------------------------*/
	public int hashFunction(String inputStr)  // he function int return karel jo arr cha index asel
	{
		int sum = 0;                          // conversion of str to int
		for ( int i = 0;i < inputStr.length();i++ )
		{
			sum = sum + inputStr.charAt(i);   // char aatun int ch asto  // asciii value add hoil
		}
		int index = sum % strArray.length;    // will give index of array
		return index;

	}
/*---------------------INSERT LINEAR------------------------------------------------------------------------------------------------*/
	public void insertLin(String inputStr)  // linear 
	{
		int index = hashFunction(inputStr); // index bhetel ,, key pathavli tya sathi
		System.out.print(inputStr + " got key from hashFunction = "+ index);
		if (strArray[index] == null)
		{
			strArray[index] = inputStr;
		}
		else  // collision
		{   
			while (true)
			{  
				if (index < strArray.length-1)
					index++;
				else 
					index = 0;   

				//index = (++index % strArray.length);  // circular index
				//index will increase upto strArray.length and then will go to 0th index
				if (strArray[index] == null)
				{
					strArray[index] = inputStr;
					break;  // will rotate until get place
				}
			}
		}

		if (index < strArray.length)
		{
			System.out.println(" and is placed at" + index);
		}


	}
	/*---------------------INSERT EASY------------------------------------------------------------------------------------------------*/
	public void insertEasy(String inputStr)
	{
		int index = hashFunction(inputStr);
		System.out.println(inputStr + " got key from hashFunction "+ index );
		if(strArray[index] == null)
		{
			strArray[index] = inputStr;
		}
		else
		{
			int i=1;
			while(true)
			{
				index = index + i++;  // will find empty position in array
				if (index > strArray.length-1)
					index = 0;

				if (strArray[index] == null)
				{
					strArray[index] = inputStr;
					System.out.println(inputStr +" is placed "+ (i-1) + " index further...");
					break;
				}
			}
		}
		System.out.println(" and it is placed at "+index);
		System.out.println();

	}
	/*---------------------INSERT QUADRATIC------------------------------------------------------------------------------------------------*/
	
	public void insertQ(String inputStr) // quadratic 
	{
		int index = hashFunction(inputStr); // 4
		System.out.print(inputStr + " got key from hashFunction = " + index);

		if(strArray[index] == null)
		{
			strArray[index] = inputStr;
		}
		else
		{
			//collision...
			//collision...
			int i=1;   //2  
			while(true)
			{
				index = index + (i*i); // index increased i square times   // 4 + 1*1 = 5
				if(index > strArray.length-1)
				{
					index=0;
					i=0;
				}

				if(strArray[index] == null)
				{
					strArray[index] = inputStr;
					break;
				}
				i++;
			}
		}
		System.out.println(" and it is placed at " + index);
	}

	/*---------------------REMOVE LINEAR------------------------------------------------------------------------------------------------*/
	public void removeLin(String inputStr)
	{
		int index = searchLin(inputStr);  // search function index deil jo delete karaycha aheint index = searchQ(inputStr);  // search function index deil jo delete karaycha ahe
		if (index == -1)
		{
			System.out.println(inputStr + " No such element present in hash table..........");
		}
		else
		{
			strArray[index] = null;
			System.out.println(" AND IT IS REMOVED FROM " + index);	
		}
		
	}
	/*---------------------REMOVE EASY------------------------------------------------------------------------------------------------*/
	
	public void removeEasy(String inputStr)
	{
		int index = searchEasy(inputStr);  // search function index deil jo delete karaycha ahe
		if (index == -1)
		{
			System.out.println(inputStr + " No such element present in hash table..........");
		}
		else
		{
			strArray[index] = null;
		    System.out.println(" AND IT IS REMOVED FROM " + index);
		}
	}
	/*---------------------REMOVE QUADRATIC------------------------------------------------------------------------------------------------*/
	public void removeQ(String inputStr)
	{
		int index = searchQ(inputStr);  // search function index deil jo delete karaycha ahe
		if (index == -1)
		{
			System.out.println("No such element present in hash table..........");
		}
		else
		{
		strArray[index] = null;
		System.out.println(" AND IT IS REMOVED FROM " + index);	
		}
	}
	/*---------------------SEARCH LINEAR------------------------------------------------------------------------------------------------*/
	public int searchLin(String inputStr) {
		int index = hashFunction(inputStr);
		if (strArray[index] != null && strArray[index].equals(inputStr))  // user input and content same asel tr delete hoil
		{
			System.out.print(inputStr + " got index from hashFunction = " + index);
			return index;
		}
		else 
		{ 
			while (true) // collision
			{
				if (index > strArray.length-1)
					{
					index = 0;
					}
				else 
				    {
					index++;
				    }

				if (strArray[index] != null && strArray[index].equals(inputStr)) // index null nahi ahe ani index content ani input same asel
				{
					System.out.print(inputStr + " got index from hashFunction = " + index);
					return index;
				}
				else
				{
					return -1;
				}
			}
		}
	}
	/*---------------------SEARCH QUADRATIC------------------------------------------------------------------------------------------------*/
	public int searchQ(String inputStr)
	{
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);
		if (strArray[index] != null && strArray[index].equals(inputStr))
		{
			return index;
		}
		else
		{
			//collision...
			int i=1;
			while(true)
			{
				index += (i*i);
				if(index > strArray.length-1)
				{
					index=0;
					i=0;
				}

				if(strArray[index] != null && strArray[index].equals(inputStr))
				{
					return index;
				}
				i++;
			}
		}
	}
	/*---------------------SEARCH EASY------------------------------------------------------------------------------------------------*/
	public int searchEasy(String inputStr) {
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);
		int x=0;
		if (strArray[index] != null && strArray[index].equals(inputStr))  // user input and content same asel tr delete hoil
		{
			x= index;
		}
		else 
		{ 
			int i= 1;
			index = index + i++;
			if (index > strArray.length-1)
				index=0;

			if (strArray[index].equals(inputStr))
			{
				x= index;
			}

		}
		return x;
	}
	/*---------------------------------------------------------------------------------------------------------------------*/
	public String toString() {
		String str = " ";
		for(int i=0; i<strArray.length;i++ )
		{
			str = str + strArray[i] + ", \n";
		}
		return str;
	}
}
