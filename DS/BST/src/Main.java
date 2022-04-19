
public class Main {

	static public void main(String [] args)
	{
		BST searchTree = new BST();
		
		searchTree.insert(14);
		searchTree.insert(34);
		searchTree.insert(23);
		searchTree.insert(15);
		searchTree.insert(5);
		searchTree.insert(4);
		searchTree.insert(84);
		searchTree.insert(67);
		searchTree.insert(28);
		searchTree.insert(9);
		
		searchTree.preOrder();
		searchTree.inOrder();
		searchTree.PostOrder();	
		searchTree.smallestNumber();
		searchTree.largestNumber();
		
		searchTree.delete(4);
		searchTree.inOrder();
		int height = searchTree.height();
		System.out.println("Height of the binary tree is: "+ height);
	}
}
