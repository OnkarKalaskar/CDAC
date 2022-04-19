
public class Quick {

	public static int partition(int[] arr, int low, int high)
	{
		int p = high;  // declared last element as pivot
		int i = low-1;   // -1
		int j = low;     //   0

		while (j != p)
		{
			if (arr[j] < arr[p])
			{
				i++;  // swap arr[i] and arr[j]  
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		i++;       //swap arr[i] and arr[j]  // i is at a perfect position for current p
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;	

		return i;  // i is a position pivot
	}
	public static void quickSort(int[] arr, int low, int high)
	{
		if(low<high)
		{int part = partition(arr,low,high); 
		quickSort(arr,low,part-1);   //array will start from lowest element to middle element
		quickSort(arr,part+1,high);  // middle to highest
		}
	}

	public static void print(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
