
public class Quick {

	public static int partition(Student[] arr, int low, int high)
	{
		int p = high;
		int i = low-1;   // -1
		int j = low;     //   0
		
		while (j != p)
		{
			if (arr[j].getMarks() < arr[p].getMarks())
			{
				i++;  // swap arr[i] and arr[j]  
				Student temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		i++;     //swap arr[i] and arr[j]
		Student temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;	
		
		return i;
	}
	
	public static void quickSort(Student[] arr, int low, int high)
	{
		if(low<high)
		{int part = partition(arr,low,high);  
		quickSort(arr,low,part-1);  //array will start from lowest element to middle element
		quickSort(arr,part+1,high);  // middle to highest
		}
	}
	
	public static void print(Student [] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
