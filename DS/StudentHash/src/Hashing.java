
public class Hashing {
	Student [] strArray;

	public Hashing(int size) {	
		strArray = new Student [size];
	}
/*---------------------HASH FUNCTION------------------------------------------------------------------------------------------------------------------------------------*/
	public int hashFunction(Student s1)           // he function int return karel jo arr cha index asel
	{
		int sum = 0;                              // conversion of str to int
		for ( int i = 0 ;i<s1.mobile_no.length(); i++ )
		{
			sum = sum + s1.mobile_no.charAt(i);  // char aatun int ch asto  // asciii value add hoil
		}
		int index = sum % strArray.length;       // will give index of array
		return index;

	}
/*---------------------INSERT LINEAR------------------------------------------------------------------------------------------------------------------------------------*/
	public void insertLin(Student s1)  // linear 
	{
		int index = hashFunction(s1); // index bhetel ,, key pathavli tya sathi
		System.out.print(s1 + " got key from hashFunction = "+ index);
		if (strArray[index] == null)
		{
			strArray[index] = s1;
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
					strArray[index] = s1;
					break;  // will rotate until get place
				}
			}
		}

		if (index < strArray.length)
		{
			System.out.println(" and is placed at" + index);
		}
	}
	/*---------------------REMOVE LINEAR----------------------------------------------------------------------------------------------------------------------------------*/
	public void removeLin(Student s1)
	{
		int index = searchLin(s1);  // search function index deil jo delete karaycha aheint index = searchQ(inputStr);  // search function index deil jo delete karaycha ahe
		if (index == -1)
		{
			System.out.println(s1+ " No such element present in hash table..........");
		}
		else
		{
			strArray[index] = null;
			System.out.println(" AND IT IS REMOVED FROM " + index);	
		}
		
	}
	/*---------------------SEARCH LINEAR----------------------------------------------------------------------------------------------------------------*/
	public int searchLin(Student s1) {
		int index = hashFunction(s1);
		if (strArray[index] != null && strArray[index].equals(s1))  // user input and content same asel tr delete hoil
		{
			System.out.print(s1 + " got index from hashFunction = " + index);
			return index;
		}
		else 
		{ 
			while (true)
			{
				if (index < strArray.length-1)
					{
					index = 0;
					}
				else 
				    {
					index++;
				    }

				if (strArray[index] != null && strArray[index].equals(s1)) // index null nahi ahe ani index content ani input same asel
				{
					System.out.print(s1 + "/n got index from hashFunction = " + index);
					return index;
				}
				else
				{
					return -1;
				}
			}
		}
	}
	/*-----------------------------------------------------------------------------------------------------------------------------------------------------*/
	public String toString() {
		String str = " ";
		for(int i=0; i<strArray.length;i++ )
		{
			str = str + strArray[i] + ", \n";
		}
		return str;
	}
}
