public class Hashing {
	Student [] arr;

	public Hashing(int size) {
		arr = new Student [size];
	}

	public int hashFunction(Student s1)
	{
		int index = 0;
		int sum = 0;
		long num = s1.mobile_no;   // mobile number is taken as a int
		while (num != 0) 
		{
			long rem = num % 10;
			num = num/10;
			sum = sum + (int)rem;   // typecasting of rem to int
		}
		index = sum %arr.length;
		return index;
	}

	public void linearInsert(Student s1)
	{
		int index = hashFunction(s1);
		if (arr[index] == null){
			arr[index] = s1;
		}
		else 
		{
			while(true){
				if (index < arr.length) {   
					index++;
				}
				else{
					index = 0;
				}
				if(arr[index] == null){
					arr[index] = s1;
					break;
				}
			}
		}
	}
	public void linearRemove(Student s1)
	{
		int index = searchIndex(s1);
		if (index == -1)
		{
			System.out.println(s1 + "ELEMENT NOT FOUND.........");
		}
		if (arr[index] != null && arr[index].mobile_no == (s1.mobile_no))
		{
			arr[index] = null;
		}
		else
		{
			arr[index] = null;
			System.out.println(s1 + "ELEMENT FOUND and removed from: " + index);
		} 
	}
	public int searchIndex(Student s1)
	{
		int index = hashFunction(s1);
		if (arr[index] != null && arr[index].mobile_no == s1.mobile_no)
		{
			System.out.println(s1 + " got index: " +index);
			return index;
		}
		else
			while(true)
			{
				if(index < arr.length-1)
				{
					index++;
				}
				else 
				{
					index = 0;
				}

				if (arr[index] != null && arr[index].mobile_no == (s1.mobile_no))
				{
					System.out.println("  and placed at: " + index);
					return index;
				}
				else
					return -1;
			}
	}

	public String toString()
	{
		String str = " ";
		for (int i = 0; i<arr.length ;i++)
		{
			str = str + arr[i] + "\n";
		}
		return str;
	}
}