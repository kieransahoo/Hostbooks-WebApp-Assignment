import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  //If Running on Local System 
  // private baseURL = "http://localhost:8081/hostbooks-app/v1/employee";

  //If running on deployed Server(Here Deployed on Railway App)
  private baseURL = "https://hostbooks-webapp.up.railway.app/hostbooks-app/v1/employee/"

  constructor(private httpClient: HttpClient) { }
  
   /**
   * Retrieves the list of all employees.
   * @returns An observable of the employee list.
   */ 
  getEmployeeList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}/all`);
  }


  /**
   * Adding a New Employee.
   * @param employee The employee object to be added.
   * @returns An observable of the added employee.
   */
  addEmployee(employee:Employee):Observable<Employee[]>{
    return this.httpClient.post<Employee[]>(`${this.baseURL}/addEmployee`,employee);
  }

  /**
   * Retrieves a employee by ID.
   * @param id The ID of the employee.
   * @returns An observable of the employee.
   */
  getEmployee(employeeId:number):Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/getEmployee/${employeeId}`);
  }

  /**
   * Updates an existing employee.
   * @param employee The employee object to be updated.
   * @returns An observable of the updated employee.
   */
  updateEmployee(employee:Employee):Observable<Employee[]>{
    return this.httpClient.post<Employee[]>(`${this.baseURL}/updateEmployee`,employee);
  }

  
/**
   * Deleting a employee by ID.
   * @param id The ID of the employee.
   * @returns An observable of the deleted employee.
   */
  deleteEmployee(employeeId:number):Observable<Employee>{
    return this.httpClient.delete<Employee>(`${this.baseURL}/deleteEmployee/${employeeId}`);
  }
}
