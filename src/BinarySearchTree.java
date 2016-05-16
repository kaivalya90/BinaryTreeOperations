


import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;



public class BinarySearchTree<T> extends AbstractCollection<T>{
	private Node <T>root; 
	private BSTStrategy strategy;  
	private int size;//stores the number of elements in the binary search tree

	public  BinarySearchTree() 
	{     
		this.root = new NullNode();
		strategy=new ByEmployeeName();       
		size=0;
	}    
	
	BinarySearchTree(BSTStrategy bst)
	{
		strategy=bst;
		this.root=new NullNode();
		size=0;
	}    

	public void setStrategy(BSTStrategy st)
	{
		strategy=st;    	
	}


	//inorder traversal of the tree to get the elements in alphabetical order
	public void getOrderedTreeElements() {
		inorder(root);
	}
	
	public <T> void inorder(Node <T> t)
	{
		if(t.isNull())
		return;
		inorder(t.leftNode);    
		System.out.println(t.toString());
		inorder(t.rightNode);
	}
	public int getSize()
	{
		return size;
	}
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new TreeIterator(root);
	}

	// toArray returns the array of all elements present the binary search tree
	public T[] toArray() 
	{
		// TODO Auto-generated method stub
		
		Iterator curser=new TreeIterator(this.root);//creating a new iterator to go through the tree
		int i=0;		
		T [] treeElements = (T[])new Object[size];
		while (curser.hasNext())
		{
			treeElements [i]=(T)curser.next();
			i++;
		}
		
		return treeElements;
	}
	
	//converting binary search tree to String
	public String toString()
	{
		Iterator i=new TreeIterator(this.root);
		String finalString="";
		while(i.hasNext())
		{
			finalString+=(i.next().toString()+",");
		}
		return finalString.substring(0, finalString.length()-1);	
	}

	//adding new element to the binary search tree	
	public  boolean add(T nodekey) {
		
		if (root.isNull()) 
		{
			root = new TreeNode(nodekey); //adding the first element 
			size++;
			return true;
		}		        
		
		Node currentNode = root;
		TreeNode newNode=new TreeNode(nodekey);
		while (true) 
		{
			if (strategy.compare(currentNode, newNode) > 0) 
			{//new node is smaller than the current node value 
				if(currentNode.leftNode.isNull())
				{
					currentNode.leftNode=newNode;
					size++;
					return true;
				}
				currentNode=currentNode.leftNode;
			}
			else if (strategy.compare(currentNode, newNode) == 0) 
			{
				System.out.println("NO");
				System.out.println("Same node already exists in the tree"); //avoid adding duplicate elements in the tree 
				return false;
			}
			else if (strategy.compare(currentNode, newNode)< 0) //new node value is greater than the current node value
			{
				if(currentNode.rightNode.isNull())
				{
					currentNode.rightNode=newNode;
					size++;
					return true;
				}
				currentNode=currentNode.rightNode;
			} 
			
		}	       		
	}

	//size() returns the number of elements stored in the binary search tree
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	
	
	
}
