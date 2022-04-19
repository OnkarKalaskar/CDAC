public class Bubble {
	int [] arr;

	
	Bubble(int x)
	{
		this.arr= new int[x];
	}
	
	public void InsertAsce()  // ascending
	{int temp=0;
		for (int j=0;j<arr.length-1;j++) // j will iterate from 0 to last node
		{
			for (int i=0; i<arr.length-1 ;i++) // for each j iteration i will iterate from 0 to arr.length
			{
				if (arr[i+1]<arr[i])
				{
					temp= arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= temp;
				}
				 	
			}
		}
	}
	public void InsertDescending()  // Descending
	{int temp=0;
	for (int j=0;j<arr.length-1;j++)
	{
		for (int i=0; i<arr.length-1 ;i++)
		{
			if (arr[i+1]>arr[i])
			{
				temp= arr[i];
				arr[i]= arr[i+1];
				arr[i+1]= temp;
			}
			 	
		}
	}
}
	public String toString()
	{
		String str= "";
		for (int i=0;i<arr.length;i++)
		{
			str= str + arr[i] + ", ";         
		}
		return str;
	}

}
