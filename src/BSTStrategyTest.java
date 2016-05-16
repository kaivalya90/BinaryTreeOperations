import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class BSTStrategyTest<T> {
	BinarySearchTree<T> bst=new BinarySearchTree<T>();
	BinarySearchTree employeeDetails=new BinarySearchTree();
	@Test
	public void testCompare() {
		employeeDetails.setStrategy(new ByYearsOfExperience());
		employeeDetails.add(new EmployeeData(12,"Mark",1));
		employeeDetails.add(new EmployeeData(11,"Mary",2));
		employeeDetails.add(new EmployeeData(10,"Seul",10));
		employeeDetails.add(new EmployeeData(9,"Audi",4));
	
		//toString gives the employee data in increasing order of yearOfExperience
		assertEquals(employeeDetails.toString(),"Mark	12	1,Mary	11	2,Audi	9	4,Seul	10	10");	
		
		
		BinarySearchTree e=new BinarySearchTree();
		e.setStrategy(new ByEmployeeName());
		e.add(new EmployeeData(12,"Mark",1));
		e.add(new EmployeeData(11,"Mary",2));
		e.add(new EmployeeData(10,"Seul",10));
		e.add(new EmployeeData(9,"Audi",4));
		
		System.out.println("********");
		//toString gives employee data in alphabetical order of employee name 
		assertEquals(e.toString(),"Audi	9	4,Mark	12	1,Mary	11	2,Seul	10	10");
		
		
	}

}
