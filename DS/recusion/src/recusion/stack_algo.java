package recusion;

import java.util.Scanner;
public class stack_algo {
	static int [] arr;
	static int topIndex=-1;
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
	  System.out.print("Size of array:  ");
	  int num= sc.nextInt();
	  arr = new int[num];
	  for(int i=0;i<num;i++)
		{push(10);
		}
		pop();
		print();
	}
	private static void print() {
		if (topIndex==-1)
		{
			System.out.println("Stack is empty..");
		}
		else
		{ for(int i=topIndex; i>=0; i--)
			System.out.print(arr[i] + ", ");
		}
	}
	private static int pop() {

		if(topIndex != -1)
		{
	
			int value = arr[topIndex];
			topIndex--;
			return value;
		}
		else
			System.out.println("Underflow...");
			return 0;
	}

	private static void push(int value) {
		if(topIndex < arr.length-1)
		{
			topIndex++;
			arr[topIndex] = value;
		}
		else
			System.out.println("Overflow...");

	}
}