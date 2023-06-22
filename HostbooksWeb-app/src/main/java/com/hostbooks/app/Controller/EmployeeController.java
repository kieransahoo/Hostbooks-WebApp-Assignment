package com.hostbooks.app.Controller;

import com.hostbooks.app.Exception.EmployeeException;
import com.hostbooks.app.Model.Employee;
import com.hostbooks.app.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostbooks-app/v1/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addNewEmployeeHandler(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addNewEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>>getAllEmployees() throws EmployeeException {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeList,HttpStatus.OK);
    }


    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("id") Integer employeeId) throws EmployeeException {
        Employee getEmployee = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(getEmployee,HttpStatus.OK);
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) throws EmployeeException{
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee,HttpStatus.OK);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Employee>deleteEmployee(@PathVariable("id") Integer employeeId) throws EmployeeException{
        Employee deleteEmployee = employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(deleteEmployee,HttpStatus.OK);
    }

}
