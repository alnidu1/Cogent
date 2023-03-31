package employee;

import java.util.ArrayList;


public interface EmployeeDao {

	public EmployeePojo create();
	
	public void printAll(ArrayList<EmployeePojo> Employees ) ;
	
	public void update(ArrayList<EmployeePojo> Employees);
	
	public void delete(ArrayList<EmployeePojo> Employees);
	
	public void find(ArrayList<EmployeePojo> Employees);
	
	public void sort(ArrayList<EmployeePojo> Employees);

}
