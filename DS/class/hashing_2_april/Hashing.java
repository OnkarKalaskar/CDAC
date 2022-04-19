
public class Hashing {

	String [] strArray;

	public Hashing(int size) {
		strArray = new String[size];
	}

	public int hashFunction(String inputStr)
	{
		int sum = 0;
		for(int i=0; i<inputStr.length(); i++)
		{
			sum = sum + inputStr.charAt(i);
		}
		int index = sum % strArray.length;
		return index;
	}
	
	public void insertL(String inputStr)
	{
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if(strArray[index] == null)
		{
			strArray[index] = inputStr;
		}
		else
		{
			//collision...
			while(true)
			{
				if(index > strArray.length-1)
					index++;
				else
					index=0;

				if(strArray[index] == null)
				{
					strArray[index] = inputStr;
					break;
				}
			}
		}
		System.out.println(" and it is placed at " + index);
	}
	public void insertMyOwnWay(String inputStr)
	{
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if(strArray[index] == null)
		{
			strArray[index] = inputStr;
		}
		else
		{
			//collision...
			int i=1;
			while(true)
			{
				index = index + i++;
				if(index > strArray.length-1)
					index=0;

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
	public void insertQ(String inputStr)
	{
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if(strArray[index] == null)
		{
			strArray[index] = inputStr;
		}
		else
		{
			//collision...
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

	public void removeQ(String inputStr)
	{
		int index = searchQ(inputStr);
		strArray[index] = null;
		System.out.println(" and it is removed from " + index);
	}
	public void removeMyOwnWay(String inputStr)
	{
		int index = searchMyOwnWay(inputStr);
		strArray[index] = null;
		System.out.println(" and it is removed from " + index);
	}
	public void removeL(String inputStr)
	{
		int index = searchL(inputStr);
		strArray[index] = null;
		System.out.println(" and it is removed from " + index);
	}

	private int searchL(String inputStr) {

		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if(strArray[index] != null && strArray[index].equals(inputStr))
		{
			return index;
		}
		else
		{
			//collision...
			while(true)
			{
				if(index > strArray.length-1)
					index++;
				else
					index=0;

				//index = (++index % strArray.length);

				if(strArray[index] != null && strArray[index].equals(inputStr))
				{
					return index;
				}
			}
		}

	}
	private int searchMyOwnWay(String inputStr) {

		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if(strArray[index] != null && strArray[index].equals(inputStr))
		{
			return index;
		}
		else
		{
			//collision...
			int i=1;
			while(true)
			{
				index = index + i++;
				if(index > strArray.length-1)
					index=0;

				//circuler index
				//index = (++index % strArray.length);

				if(strArray[index] != null && strArray[index].equals(inputStr))
				{
					return index;
				}
			}
		}

	}
	private int searchQ(String inputStr) {

		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if(strArray[index] != null && strArray[index].equals(inputStr))
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

	@Override
	public String toString() {
		String str = "";

		str = "{ ";
		for (int i = 0; i < strArray.length; i++) {
			str = str + strArray[i] + ", ";
		}
		str = str + " }";
		return str;
	}

}
