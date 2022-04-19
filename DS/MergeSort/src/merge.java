
public class merge {
	static public void merging(int [] crr, int l,int m, int r)   //left right elements resp sending index
	{
		int ElementIn1st = m-l + 1; //first array would be upto middle index 
		int ElementIn2nd = r-(m+1)+1;
		int [] arr = new int [ElementIn1st];
		int [] brr = new int [ElementIn2nd];
		
		for (int i=0; i<arr.length; i++ )
		{
			arr[i] = crr[l+i];// l is 0th index now will increase 
		}
		for (int i=0; i<brr.length; i++ )
		{
			brr[i] = crr[m+1+i];   // l is 0th index now will increase 
		}
		int i=0;
		int j=0;
		int k=l;  // will give value of lower element
		while(i<arr.length && j<brr.length)
		{
			if (arr[i] <= brr[j])
			{
				crr[k] = arr[i];  // 0  0
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
	    while(j<brr.length)  // brr chya length evdh bvadhel
			{
				crr[k] = brr[j];
				k++;
				j++;
			}
		
		while(i<arr.length)  // out because of brr's length over.. arr che rahilele insert hotil
			{
				crr[k]=arr[i];
				i++;
				k++;
			}
	}
	static public void mergeSort(int [] arr , int l, int r)  // [23,34,56,12,67]
	{
		if (l<r)
		{
			int m = (l+r)/2;    // (0+4)/2= 2, (0+2)/2= 1   (0+1)/2 =0
			//(left side array)    [23,34,56]
			mergeSort(arr,l,m); // (arr, 0,2)==> (arr, 0, 1) ==> (arr, 0, 0) condition fail
			//(right side array)               control back to this
			mergeSort(arr,m+1,r); //           (arr, 1, 1) condition fail nxt line    			
			                                 
			merging(arr,l,m,r);   //           (arr, 1,0,1)   
		}
	}
	
	static public void print(int [] crr)
 	{
 		for (int i=0;i<crr.length;i++)
 		{
 			System.out.print(crr[i]+ ", ");
 		}
 	}
}