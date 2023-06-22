import { Component,OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit{
 employees: Employee[] = [];

  constructor(private employeeService:EmployeeService,private router:Router){}

  ngOnInit():void{
   this.getEmployees();

  }

  private getEmployees(){
    this.employeeService.getEmployeeList().subscribe(data =>{
      this.employees=data;
    })
  }

  updateEmployee(employee:Employee){
    this.router.navigate(['updateEmployee',employee]);
  }
  deleteEmployee(id:number){
    this.employeeService.deleteEmployee(id).subscribe(data=>{
      console.log(data);
      this.getEmployees();
    })
  }
  viewEmployee(id:number){
    this.router.navigate(['viewEmployee',id]);
  }
   
}
