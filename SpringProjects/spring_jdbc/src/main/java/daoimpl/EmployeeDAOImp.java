package daoimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import dao.EmployeDAO;
import dto.Employee;

@Component("employdao")
public class EmployeeDAOImp implements EmployeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	DriverManagerDataSource dmds= new DriverManagerDataSource();
	
	@Override
	public int create(Employee emp) {
		// TODO Auto-generated method stub
		
		String sql= "insert into employee value(???)";
		int result= jdbcTemplate.update(sql);
		return result;
	}

	@Override
	public int update(Employee emp) {
		// TODO Auto-generated method stub
		String sql= "update  employee value(???) where ";
		int result= jdbcTemplate.update(sql);
		return result;
	}

	@Override
	public int delete(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> read() {
		// TODO Auto-generated method stub
		return null;
	}

}
