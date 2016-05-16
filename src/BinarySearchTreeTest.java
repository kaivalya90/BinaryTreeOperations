import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class BinarySearchTreeTest<T> {

	BinarySearchTree bst=new BinarySearchTree<T>();
	BinarySearchTree employeeDetails=new BinarySearchTree();

	@Test
	public void testgetSize() {
		//fail("Not yet implemented");
		employeeDetails.add(new EmployeeData(12,"Mark",1));
		employeeDetails.add(new EmployeeData(11,"Mary",2));
		employeeDetails.add(new EmployeeData(10,"Seul",10));
		employeeDetails.add(new EmployeeData(9,"Audi",4));
		assertEquals(employeeDetails.getSize(),4);
		
	}

	//ierator.next() should throw exception if tries to access the element which is null
	@Test(expected=java.util.NoSuchElementException.class)
	public void testIterator() {
		
		employeeDetails.setStrategy(new ByEmployeeName());
		employeeDetails.add(new EmployeeData(12,"Mark",1));
		employeeDetails.add(new EmployeeData(11,"Mary",2));
		employeeDetails.add(new EmployeeData(10,"Seul",10));
		employeeDetails.add(new EmployeeData(9,"Audi",4));
		Iterator i=employeeDetails.iterator();
		while(i.hasNext())
			System.out.println(i.next().toString());
		
		i.next();
		
	}

	@Test
	public void testToArray() {
		BinarySearchTree bst=new BinarySearchTree();
		ArrayList array=new ArrayList();
		array.add("Aston");
		array.add("Mark");
		bst.setStrategy(new LengthWise());
		bst.add(new String ("Mark"));
		bst.add(new String("Aston"));
		 Object []objList= bst.toArray();		 
		assertEquals(objList[0].toString(),"Aston");
		assertEquals(objList[1].toString(),"Mark"); 
	
		       
		 
		//assertEquals("toArray of BST",bst.toArray(),"Aston,Mark");
	}

	@Test
	public void testToString() {
		bst.setStrategy(new LengthWise());
		bst.add(new String ("Mark"));
		bst.add(new String("Aston"));
		System.out.println(bst.toString());
		assertEquals("toString of BST",bst.toString(),"Aston,Mark");
	}

	@Test
	public void testAddT() {
		
		bst.setStrategy(new LengthWise());
		assertEquals("successful addition",true,bst.add(new String ("Sjjja")));
	//	assertEquals("If the successful addition",true,bst.add("jskcjk"));
	//	assertEquals("If the successful addition",true,bst.add(new String("Rocky")));//bst.add("Rocky");
		assertEquals("successful addition",true,bst.add(new String ("Mark")));
		assertEquals("successful addition",true,bst.add(new String("Aston")));
		assertEquals("successful addition",true,employeeDetails.add(new EmployeeData(12,"Mark",11)));
		assertEquals("successful addition",true,employeeDetails.add(new EmployeeData(13,"Anny",1)));
		assertEquals("successful addition",true,employeeDetails.add(new EmployeeData(15,"Jenny",10)));
	
	
	}

}
