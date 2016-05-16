import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class StartsWithVowelsTest<T> {

	BinarySearchTree bst=new BinarySearchTree<String>();
	BinarySearchTree employeeDetails=new BinarySearchTree();

	@Test(expected=ClassCastException.class)
	public void testHasNext() {
		employeeDetails.add(new EmployeeData(12,"Mark",1));
		employeeDetails.add(new EmployeeData(11,"Mary",2));
		employeeDetails.add(new EmployeeData(10,"Seul",10));
		employeeDetails.add(new EmployeeData(9,"Audi",4));
			
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
		
		Iterator i=employeeDetails.iterator();
		IteratorDecorator id=new Capitalise(i);	
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
		IteratorDecorator idj=new StartsWithVowels(j);
		assertEquals("Element start with vowel ",idj.next(),"e");
		assertEquals("Element start with vowel ",idj.next(),"a");
				
	
	}

}
