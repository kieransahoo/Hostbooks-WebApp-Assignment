import { Component,OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit{
  
  employeeId!: number;
  employee: Employee=new Employee();
  constructor(private employeeService:EmployeeService,private router:Router,private route:ActivatedRoute){

  }
  ngOnInit(): void {
    this.employeeId = this.route.snapshot.params['employeeId'];

    this.employee = new Employee();
    this.employeeService.getEmployee(this.employeeId).subscribe( data => {
      this.employee = data;
    });
    
  }

  onSubmit(){
    // console.log(this.employee);
      this.employeeService.addEmployee(this.employee).subscribe(data => {
      console.log(data);
      this.router.navigate(['/all']);
    })
  }

  
}
