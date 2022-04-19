import java.util.Scanner;
public class Insertion {
	Book [] arr;
	int pos;

	Insertion(int x)
	{
		this.arr= new Book[x];
		int pos=-1;
	}
	public void SortBypriceAscend()  // ascending
	{
		for (int j=1;j<arr.length;j++)
		{
			int i=j;
			while (i>0)
			{
				if (arr[i].getBookPrice()<arr[i-1].getBookPrice())
				{
					Book temp= arr[i-1];
					arr[i-1]= arr[i];
					arr[i]= temp;
					i--;
				}
				else 
				{
					break;
				}
			}
		}
	}
	public void SortBypriceDescend()  // Descending
	{
		for (int j=1;j<arr.length;j++)
		{
			int i=j;
			while (i>0)
			{
				if (arr[i].getBookPrice()>arr[i-1].getBookPrice())
				{
					Book temp= arr[i-1];
					arr[i-1]= arr[i];
					arr[i]= temp;
					i--;
				}
				else 
				{
					break;
				}
			}
		}
	}
	public String toString()
	{
		String str= "";
		for (int i=0;i<arr.length;i++)
		{
			str= str + arr[i] + ", \n";         
		}
		return str;
	}
	

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public void SortByAlpha() {
		{
			for (int j=1;j<arr.length;j++)
			{
				int i=j;
				while (i>0)
				{
					if (arr[i].getBookName().compareTo(arr[i-1].getBookName())<0)// compare to vala bracket madhe, if 1st if greater value it returns + int else -ve  
					{
						Book temp= arr[i-1];
						arr[i-1]= arr[i];
						arr[i]= temp;
						i--;
					}
					else 
					{
						break;
					}
				}
			}
		}
   
	}

	public void SortByBookid() {
		{
			for (int j=1;j<arr.length;j++)
			{
				int i=j;
				while (i>0)
				{
					if (arr[i].getBookid()<arr[i-1].getBookid())
					{
						Book temp= arr[i-1];
						arr[i-1]= arr[i];
						arr[i]= temp;
						i--;
					}
					else 
					{
						break;
					}
				}
			}
		}
	}
}
