import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';


const routes: Routes = [
  {path:'employees',component:EmployeeListComponent},
  {path :'employees',component:AddEmployeeComponent},
  {path :'employees',component:UpdateEmployeeComponent},
  {path :'employees/:employeeId',component:ViewEmployeeComponent},
  {path: '', redirectTo: 'employees', pathMatch: 'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
