
public class BST {
	Node root;   // first node

	public BST()
	{
		root = null;
	}

	public void insert(int value)
	{
		if (root == null)
		{
			Node temp = new Node (value);
			root = temp;
		}
		else  // if the value in upcoming node is smaller than current node value then it will 
			  // go to left side of it else goes to right side
		{
			Node temp = new Node(value);
			Node it = root;  
			while(true)
			{
				if ( it.data < value )      // if value is greater than node value it will go to right 
				{
					if (it.right == null )  // next right rikama asel trch takta yeil
					{
						it.right = temp;
						break;
					}
					else
						it = it.right;	
				}
				else if(it.data > value)    // new value is smaller than node value it will go to left of it
				{
					if(it.left == null)
					{
						it.left = temp;
						break;
					}
					else
						it = it.left;
				}
				else              //*
					break;
			}
		}
	}

	/*-------------PRE ORDER------------------------------------------------------------*/
	public void preOrder()  // PLR
	{
		System.out.print("Elements in pre order: ");
		PrintPreOrder(root);
		System.out.println();	
	}

	private void PrintPreOrder(Node it)  // it have root elements reference
	{
		if(it != null)  // print left then right // accordingly manage length
		{
			System.out.print(it.data + ", ");
			PrintPreOrder(it.left);
			PrintPreOrder(it.right);
		}
	}
	/*-------------IN ORDER------------------------------------------------------------*/
	public void inOrder()  // LPR // ELEMENTS IN SORTED MANNER
	{
		System.out.print("Elements in order: ");
		PrintInOrder(root);
		System.out.println();	
	}

	private void PrintInOrder(Node it)  // it have root elements reference
	{
		if(it != null)  // left then print then right // accordingly manage length
		{
			PrintPreOrder(it.left);
			System.out.print(it.data + ", ");
			PrintPreOrder(it.right);
		}
	}
	/*-------------POST ORDER------------------------------------------------------------*/
	public void PostOrder()  // LRP left right print 
	{
		System.out.print("Elements in post order: ");
		PrintPostOrder(root);
		System.out.println();	
	}

	private void PrintPostOrder(Node it)  // it have root elements reference
	{
		if(it != null)  // left then right then print  // accordingly manage length
		{
			PrintPostOrder(it.left);
			PrintPreOrder(it.right);
			System.out.print(it.data + ", ");
		}
	}
	/*-------------SMALLEST ORDER------------------------------------------------------------*/
	public void smallestNumber(){  
		Node it = root;
		if (root == null){
			System.out.println("Binary search tree is empty...");
		}
		else
		{
			while (root != null && it.left != null)  // to get smallest number
			{
				it = it.left;
			}
			System.out.println("smallest number is: " +it);
		}
	}
	/*-------------LARGEST NUMBER------------------------------------------------------------*/
	public void largestNumber()
	{
		Node it = root;
		if (root != null)
		{
			while(it.right != null)
			{
				it = it.right;
			}
			System.out.println("largest number is: " +it);
		}
		else
		{
			System.out.println("Binary search tree is empty...");
		}
	}
	/*--------DELETENUMBER------------------------------------------------------------*/
	public void delete(int key) 
	{
		root = deleteValue(root,key);
	}
	private Node deleteValue(Node currentRoot, int key) 
	{
		if (currentRoot == null)   // no elements
		{
			return null;
		}
		if (currentRoot.left == null && currentRoot.right == null)  // has no child elements , only single node
		{
			if(currentRoot.data == key)
			{
				return null;
			}		
		}
		// if key is more than root then it will store right  to the root
		if (key > currentRoot.data)  // or currentRoot.data < key   ==> element is on right side 
		{
			currentRoot.right = deleteValue(currentRoot.right, key);
			return currentRoot;
		}
		// if key is less than root then it will store left to the root
		else if (key < currentRoot.data)  // or currentRoot.data > key ==> element is on left side
		{
			currentRoot.left = deleteValue(currentRoot.left, key);
			return currentRoot;
		}
		else
		{
			if (currentRoot.left == null)  // theres element on right side
			{
				Node tmp = currentRoot.left;
				currentRoot.right = null;
				return tmp;
			}
			
			else if(currentRoot.right == null)
			{
				Node tmp = currentRoot.left;
				currentRoot.left = null;
				return tmp; 
			}
			else // both side have elements, find smallest element from right side // this is leaf node 
			{
				int x = smallestOfRight(currentRoot.right);
				currentRoot.data = x;
				currentRoot.right = deleteValue(currentRoot.right, x);
			}		
		}
		return currentRoot;	
	}
/*-------------SMALLEST NUMBER------------------------------------------------------------*/
	
	private int smallestOfRight(Node it ) {
		while(it.left != null)
			it = it.left;
		return it.data;
	}
/*-------------SMALLEST NUMBER------------------------------------------------------------*/
	public int height()  // wrapper function
	{
		int ht = heightOfTree(root);
		return ht;
	}
	
	public int heightOfTree(Node tmp)   // root will come here in tmp
	{
		int left;
		int right;

		if(tmp == null)
		{
			return 0;
		}

		left =heightOfTree(tmp.left);
		right =heightOfTree(tmp.right);

		if (left < right)
			return 1 + right;

		else
			return 1 + left;
	}

}
