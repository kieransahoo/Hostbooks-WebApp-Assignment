import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent {
  employeeId!: number;
  employee: Employee=new Employee();
  constructor(private route: ActivatedRoute, private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.employeeId = this.route.snapshot.params['employeeId'];

    this.employee = new Employee();
    this.employeeService.getEmployee(this.employeeId).subscribe( data => {
      this.employee = data;
    });
  }
}
