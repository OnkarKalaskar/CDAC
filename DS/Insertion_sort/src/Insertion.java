import java.util.Scanner;

public class Insertion {
	private int [] arr;
	
	Insertion(int x)
	{
		this.arr= new int[x];   // 
	}
	
	public void Insert()  // ascending
	{int temp=0;
		for ( int j=1;j<arr.length;j++ )  // assuemed first element started // loop will execute for no of arr elements
		{
			for(int i=j ; i>0; i-- )      // will iterate upto j and will switch continously
			{
				if (arr[i]<arr[i-1])  // 1st with 0th // 2nd with first // 3rd with first
				{
					temp= arr[i-1];
					arr[i-1]= arr[i];
					arr[i]= temp;
				}
			}
		}
	}
	
	public void InsertDescending()  // Descending
	{int temp=0;
		for (int j=1;j<arr.length;j++)
		{
			for (int i=j ; i>0; i--)
			{
				if (arr[i] > arr[i-1])
				{
					temp= arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
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
	
	public void scanfun() 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<this.arr.length;i++ )
		{
			this.arr[i] = sc.nextInt();
		}	
	}
}
