import java.util.Iterator;

//this works only with Iterator<String>, with others it gives exception
public class Capitalise extends IteratorDecorator<String>
{
	Iterator  currentIterator; 
	Capitalise(Iterator i)
	{
		currentIterator =i;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		return currentIterator.hasNext();		
	}
	
	@Override
	public String next() {
		// TODO Auto-generated method stub
		return ((String) currentIterator.next()).toUpperCase();
	}	

}