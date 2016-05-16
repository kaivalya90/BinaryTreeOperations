 public interface Iterators
    {
    	public boolean hasNext();
    	public Object next();
    	public Object inorderSuccessor(Node currentNode,String val, Node parentNode);
    	public Object rightSuccessor(Node rightNode);
    }