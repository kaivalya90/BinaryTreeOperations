public interface BSTStrategy
{
	public int compare (Node currentNode, Node newNode);
	
}

//ordered works with EmployeeData only as it compares employee name of the node data
class ByEmployeeName implements BSTStrategy
{

	@Override
	public int compare(Node currentNode, Node newNode) {
		// TODO Auto-generated method stub
		
		if (((EmployeeData)currentNode.data).emp_Name.compareTo(((EmployeeData)newNode.data).emp_Name) > 0)
		return 1;
		else  if (((EmployeeData)currentNode.data).emp_Name.compareTo(((EmployeeData)newNode.data).emp_Name) == 0)
		return 0;
		else if   (((EmployeeData)currentNode.data).emp_Name.compareTo(((EmployeeData)newNode.data).emp_Name) < 0)
		return -1;
		return 0;	
	}
	
}

//ByYearsOfExperience works with EmployeeData objects
//Employees are stored in order based on their years of experience
class ByYearsOfExperience implements BSTStrategy
{
	@Override
	public int compare(Node currentNode, Node newNode) {
		// TODO Auto-generated method stub		
		if (((EmployeeData)currentNode.data).yearsOfExperience>((EmployeeData)newNode.data).yearsOfExperience)
		return 1;
		else if  (((EmployeeData)currentNode.data).yearsOfExperience<=((EmployeeData)newNode.data).yearsOfExperience)
		return -1;
		return 0;	
		
	}
	
}

//lengthWise strategy works only with string values
class LengthWise implements BSTStrategy{

	@Override
	public int compare(Node currentNode, Node newNode) {
		// TODO Auto-generated method stub		
		
		if (((String)currentNode.data).length()<=((String)newNode.data).length())
		return 1;
		else if (((String)currentNode.data).length()>((String)newNode.data).length())
		return -1;
		return 0;			
		
	}
	
}