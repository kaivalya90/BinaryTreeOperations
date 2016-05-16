import java.util.Iterator;

public abstract class IteratorDecorator<T> implements  Iterator<T>{
	public abstract boolean hasNext() ;
	public abstract T next() ;
}

