import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NetassetComponent } from './components/netasset/netasset.component';
import { AuthGuard } from './services/auth.guard';
import { SellassetComponent } from './components/sellasset/sellasset.component';

const routes: Routes = [

  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:'login',
    component:LoginComponent,
    pathMatch:'full'
  },
  {
    path:'dashboard',
    component:DashboardComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'net',
    component:NetassetComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'sellasset',
    component:SellassetComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
