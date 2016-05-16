//user defined class which will be data field of the node 
public class EmployeeData
{
	 int empID;
	 String emp_Name;
	 int yearsOfExperience;
	 
	 EmployeeData()
	 {
		 empID=0;
		 emp_Name=null;
		 yearsOfExperience=0;
	 }
	 EmployeeData(int id,String name, int money)
	 {
		 empID=id;
		 emp_Name=name;
		 yearsOfExperience=money;
	 }
	 EmployeeData(EmployeeData e)
	 {
		 this.empID=e.empID;
		 this.emp_Name=e.emp_Name;
		 this.yearsOfExperience=e.yearsOfExperience;
	 }
	 
	 public String toString()
	 {
		return emp_Name+"\t"+empID+"\t"+yearsOfExperience;
		 
	 }
	 public boolean equals(EmployeeData x)
	 {
		 return (this.emp_Name.equals(x.emp_Name)&& this.empID==x.empID && this.yearsOfExperience==x.yearsOfExperience);
	 }
}
