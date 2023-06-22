package com.hostbooks.app.Service;

import com.hostbooks.app.Exception.EmployeeException;
import com.hostbooks.app.Model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addNewEmployee(Employee employee);

    public List<Employee> getAllEmployees() throws EmployeeException;

    public Employee getEmployeeById(Integer employeeId) throws EmployeeException;

    public Employee updateEmployee(Employee employee)throws EmployeeException;

    public Employee deleteEmployee(Integer employeeId)throws EmployeeException;

}
