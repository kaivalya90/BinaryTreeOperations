import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class CapitaliseTest<T> {

	BinarySearchTree bst=new BinarySearchTree<T>();
	BinarySearchTree employeeDetails=new BinarySearchTree();

	@Test (expected=ClassCastException.class)//capitalise should throw exception with iterator<EmployeeData>
	//it should work only with iterator<String>
	public void testHasNext() {
		employeeDetails.add(new EmployeeData(12,"Mark",1));
		employeeDetails.add(new EmployeeData(11,"Mary",2));
		employeeDetails.add(new EmployeeData(10,"Seul",10));
		employeeDetails.add(new EmployeeData(9,"Audi",4));
		Iterator i=employeeDetails.iterator();
		IteratorDecorator id=new Capitalise(i);		
		bst.add("Arron");
		bst.add("Finch");
		bst.add("Steven");
		bst.add("Free");
		bst.add("Ola");		
		Iterator j=bst.iterator();
		IteratorDecorator idj=new Capitalise(j);
		assertEquals("String in capital",true, idj.hasNext());
		idj.next();
		assertEquals("String in capital",true, idj.hasNext());
		idj.next();
		assertEquals("String in capital",true, idj.hasNext());
		idj.next();
		assertEquals("String in capital",true, idj.hasNext());
		idj.next();
		assertEquals("String in capital",true, idj.hasNext());
		idj.next();
		assertEquals("String in capital",true, idj.hasNext());
		idj.next();
		assertEquals("String in capital",false, idj.hasNext());		
		assertEquals("there is an element",true,id.hasNext());
		id.next();		
	}

	@Test
	public void testNext() {
		bst.setStrategy(new LengthWise());
		bst.add("a");
		bst.add("b");
		bst.add("c");
		bst.add("d");
		bst.add("e");	
		Iterator j=bst.iterator();
		IteratorDecorator idj=new Capitalise(j);
		assertEquals("capitalise ",idj.next(),"E");
		assertEquals("capitalise ",idj.next(),"D");
		assertEquals("capitalise ",idj.next(),"C");		
		idj.next();
	}

}
