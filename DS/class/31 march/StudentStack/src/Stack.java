
public class Stack {

	private Student [] arr;
	private int top;

	public Stack() {
		this.arr = new Student[5];
		this.top = -1;
	}

	public Stack(int size) {
		this.arr = new Student[size];
		this.top = -1;
	}

	public void push(Student value)
	{
		//overflow condition
		if(this.top < this.arr.length-1)
		{
			this.top++;
			this.arr[this.top] = value;
		}
		else
			System.out.println("Overflow...");
	}

	public Student pop()
	{
		if(this.top != -1)
		{
			Student value = this.arr[this.top];
			this.top--;
			return value;
		}
		else
			System.out.println("Underflow...");
		return null;
	}

	public String toString() {

		String str = "";
		if(this.top == -1)
			str = "Stack is empty";
		else
		{
			for(int i=this.top; i>=0; i--)
				str = str + (this.arr[i] + ", ");
		}

		return str;
	}

	public boolean equals(Stack x) {
		//s1.equals(s2)
		// s1 ==> this
		// s2 ==> x
		if(this.arr.length != x.arr.length)
			return false;

		if(this.top != x.top)
			return false;


		//iterate on both arr and check each element
		for (int i = 0; i < this.top; i++) {

			if(this.arr[i] != x.arr[i])
			{
				return false;
			}
		}

		return true;
	}

}
