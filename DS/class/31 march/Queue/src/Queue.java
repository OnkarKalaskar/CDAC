
public class Queue {

	int [] arr;
	int F;
	int R;

	public Queue() {
		arr = new int[5];
		F=-1;
		R=-1;		
	}

	public void insert(int value)
	{
		//Full condition
		if(R < arr.length-1)
		{
			R++;
			arr[R] = value;

			//If this is the first value, make F++ as well
			if(F == -1)
				F++;
		}
		else
			System.out.println("Queue is full");
	}
	
	public int remove()
	{
		int value=0;
		
		//Check for empty condition
		if(F != -1)
		{
			value = arr[F];
		
			//Check if this is the last value, if yes make F, R to -1. Else F++.
			if(F != R)
				F++;
			else
				F=R=-1;
		}
		else
			System.out.println("Queue is empty");
		
		return value;
	}
	
	public String toString() {
		String str = "";
		if(F == -1)
			str = "Queue is Empty!";
		else
		{
			for(int i=F; i<=R; i++)
			{
				str += arr[i] + ", ";
			}
		}
		
		return str;
	}
}
