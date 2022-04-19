
public class merge {
	
	
 	static public int[] merging(int [] arr, int [] brr)
	{
		int [] crr = new int [arr.length+ brr.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr.length && j<brr.length)
		{
			if (arr[i] <= brr[j])
			{
				crr[k] = arr[i];
				i++;
				k++;
			}
			else
			{
				crr[k] = brr[j]; 
				k++;
				j++;
			}
		}
		if (i == arr.length)  // i chi length sampli b che remaining print hotil array madhe
		{
			while(j<brr.length)  // brr chya length evdh bvadhel
			{
				crr[k] = brr[j];
				k++;
				j++;
			}
		}
		else   // out because of brr's length over..
		{
			while(i<arr.length)
			{
				crr[k]=arr[i];
				i++;
				k++;
			}
		}
		return crr;
	}
	
 	static public void print(int [] crr)
 	{
 		for (int i=0;i<crr.length;i++)
 		{
 			System.out.print(crr[i]+ ", ");
 		}
 	}
}
