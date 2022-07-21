import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials={
    username:'',
    password:''
  }

  constructor( private loginservice:LoginService) { }

  ngOnInit(): void {
  }
  onSubmit(){
    
    if((this.credentials.username!='' && this.credentials.password!='')&&(this.credentials.username!=null && this.credentials.password!=null))
    {

      this.loginservice.generateToken(this.credentials).subscribe(
        (response:any)=>{
          //token succesfully generated

         console.log(response);

         this.loginservice.loginUser(response.token)
         window.location.href="/dashboard"
          

        },
        error=>{

          console.log(error);


        }
      )

    }
  }

}
