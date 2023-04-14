package dao;

import java.util.List;

import dto.Employee;


public interface EmployeDAO {

	int create(Employee emp);
	int update(Employee emp);
	int delete(Employee emp);
	List<Employee> read();
}
