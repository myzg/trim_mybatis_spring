package Dao;

import modelbase.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeServer {
   public Employee findById(Integer id);
}
