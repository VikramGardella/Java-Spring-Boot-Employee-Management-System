package hr;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeService {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int addEmployee(Employee e) {
	    return jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?)", 5, "Bill", "Gates", "USA");
	}
	
    
	public Employee findByEmployeeId(int empID){
	    
	    String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
	    Employee employee = (Employee)getJdbcTemplate().queryForObject(sql, new Object[] { empID }, new EmployeeRowMapper());
	       
	    return employee;
	}
}
