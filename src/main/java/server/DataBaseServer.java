package server;

import Dao.EmployeeServer;
import modelbase.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBaseServer {

    @Autowired
    private EmployeeServer dao;

    public Employee findById(int id) {
        return dao.findById(id);
    }
}
