package linklist;
// palindrome , polynomial representation using LL
// polynomial addition multiplocation

// find out singly ll is palindrome or not
//
public class Main {

	static public void main(String [] args)
	{
		linklist list = new linklist();
		
		list.insertFirst(45);
		list.insertFirst(34);
		list.insertFirst(56);
		list.insertFirst(56);
		list.insertFirst(34);
		list.insertFirst(45);
		
		boolean answer = linklist.isPalindrome(list);
		if(answer == true)
		{
			System.out.println("Link list is palindrome...");
		}
		if(answer == false)
		{
			System.out.println("Link list is not palindrome...");
		}
	}
}

