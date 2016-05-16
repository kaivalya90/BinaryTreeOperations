import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeIterator implements Iterator
{
	private Node mainNode;
	private Node currentNode;

	TreeIterator(Node x)
	{
		mainNode=x;	
		currentNode=new NullNode();
	}

	@Override
	
	public boolean hasNext()
	{
		// TODO Auto-generated method stub
		Node k=(Node) inorderSuccessor(mainNode,currentNode,new NullNode());
		if(k.isNull())
		return false;
		return true;
	}

	@Override
	public Object next() 
	{
		// TODO Auto-generated method stub			
		Node k=(Node) inorderSuccessor(mainNode,currentNode,new NullNode());
		currentNode=k;
		if(k.isNull())
			throw new NoSuchElementException();
		return k.data;		
	}
	
	public TreeIterator()
	{
		// TODO Auto-generated constructor stub			
		currentNode=new NullNode();
	}
	
	public TreeIterator(Iterator i) {
		// TODO Auto-generated constructor stub
		this.mainNode=((TreeIterator)i).mainNode;
		this.currentNode=((TreeIterator)i).currentNode;
	}

	public Object inorderSuccessor(Node rootNode,Node atNode, Node parentNode) {
		// TODO Auto-generated method stub
		if(currentNode.isNull())
		{
			Node t=mainNode;
			while(!t.leftNode.isNull())
			t=t.leftNode;
			return t;
		}
		if (rootNode.isNull())
		{	
			
			return rootNode;
		}
		if (rootNode.equals(atNode))
		{
			//System.out.println("Got the same nodes"+ currentNode.toString()+" "+atNode.toString());
			if (!rootNode.rightNode.isNull())
			{
				return rightSuccessor(rootNode.rightNode);
			}
			else
			{			        	
				return parentNode;
			}
		}
		Node left=(Node) inorderSuccessor(rootNode.leftNode,atNode,rootNode);
		if (!left.isNull())
		{		
			return left;
		}
		return inorderSuccessor(rootNode.rightNode,atNode,parentNode);
		
	}

	public Node rightSuccessor(Node rightNode) 
	{			
		while(!rightNode.leftNode.isNull())
		rightNode=rightNode.leftNode;
		return rightNode;
		// TODO Auto-generated method stub
	}

	
}


