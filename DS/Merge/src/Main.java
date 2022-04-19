
public class Main {
	public static void main(String [] args)
	{
		int [] arr = {10,20,34,38,50}; 
		int [] brr = {5,7,9,14,78};
		
		int [] crr = new int [arr.length+brr.length]; // length will be 10. means 11 elements
		
		crr = merge.merging( arr, brr);
		
		merge.print(crr);
	}

}

