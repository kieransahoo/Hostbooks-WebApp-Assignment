import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';


const routes: Routes = [
  {path:'all',component:EmployeeListComponent},
  {path :'addEmployee',component:AddEmployeeComponent},
  {path :'updateEmployee',component:UpdateEmployeeComponent},
  {path :'viewEmployee/:employeeId',component:ViewEmployeeComponent},
  {path: '', redirectTo: 'all', pathMatch: 'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
