import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = "http://localhost:8081/hostbooks-app/v1/employee";

  constructor(private httpClient: HttpClient) { }
  
  getEmployeeList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}/all`);
  }

  addEmployee(employee:Employee):Observable<Employee[]>{
    return this.httpClient.post<Employee[]>(`${this.baseURL}/addEmployee`,employee);
  }

  updateEmployee(employee:Employee):Observable<Employee[]>{
    return this.httpClient.post<Employee[]>(`${this.baseURL}/updateEmployee`,employee);
  }

  getEmployee(employeeId:number):Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/getEmployee/${employeeId}`);
  }

  deleteEmployee(employeeId:number):Observable<Employee>{
    return this.httpClient.delete<Employee>(`${this.baseURL}/deleteEmployee/${employeeId}`);
  }
}
