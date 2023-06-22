package com.hostbooks.app.Service;

import com.hostbooks.app.Exception.EmployeeException;
import com.hostbooks.app.Model.Employee;
import com.hostbooks.app.Repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public Employee addNewEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        List<Employee> employeeList = employeeDao.findAll();
        if(employeeList.isEmpty()){
            throw new EmployeeException("No Employee Found");
        }else {
            return employeeList;
        }
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) throws EmployeeException {
        Optional<Employee> optionalEmployee = employeeDao.findById(employeeId);
        if(optionalEmployee.isEmpty()){
            throw new EmployeeException("No Employee found with ID : "+employeeId);
        }
        Employee employee = optionalEmployee.get();
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        Optional<Employee> optionalEmployee = employeeDao.findById(employee.getEmployeeId());
        if(optionalEmployee.isEmpty()){
            throw new EmployeeException("No Employee found with ID : "+employee.getEmployeeId());
        }
        Employee updateEmployee = optionalEmployee.get();
        updateEmployee = employeeDao.save(employee);
        return updateEmployee;
    }

    @Override
    public Employee deleteEmployee(Integer employeeId) throws EmployeeException {
        Optional<Employee> optionalEmployee = employeeDao.findById(employeeId);
        if(optionalEmployee.isEmpty()){
            throw new EmployeeException("No Employee found with ID : "+employeeId);
        }
        Employee employee = optionalEmployee.get();
        employeeDao.delete(employee);
        return employee;
    }
}
