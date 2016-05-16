abstract class Node<T>{ //smallest element of the binary search tree
	T data;
	public Node <T>leftNode;
	public Node <T>rightNode;
	Node()
	{
		
	}	
	public abstract boolean isNull();
	public abstract String toString();
}

class TreeNode<T> extends Node<T>
{
	TreeNode(T data)
	{
		this.data=data;
		leftNode=new NullNode();
		rightNode=new NullNode();
	}
	TreeNode()
	{
		data=null;
		leftNode=new NullNode();
		rightNode=new NullNode();
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}
	
	public boolean equals(Node x)
	{
		return this.data.equals(x.data);
	}

	
}


class NullNode<T> extends Node<T>
{

	NullNode() {
		data=null;
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	public boolean equals(Node x)
	{
		return false;
	}
}
