import { Component, OnInit } from '@angular/core';
import { User } from '../model/user.component';
import { Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  data = {};
  arr = {};
  username = '';
  password = '';
  
  // user: User={"userId": 0, "username":"", "password":"", "userPhone": 0, "email":"", "active": null, "roles":""};
  user: User={"userId": 0, "username":"", "password":"", "userPhone": 0, "email":"","active": null, "roles":""};
  invalidLogin = false;

  constructor(private router: Router,
    private loginservice: AuthenticationService) { }

  ngOnInit(): void {
  }

  // Check user for authenticatoin
  checkLogin() {
    this.loginservice.authenticate(this.username, this.password)
    .subscribe(
      userData => {
        sessionStorage.setItem('username', this.username);
        let tokenStr = 'Bearer' +userData.token;
        sessionStorage.setItem('token', tokenStr);
        console.log(userData.roles);
        this.user = userData;
        this.redirect();
        return userData;
      }, error => alert("Invalid Username or Password"));
  }

  // Redirect based on the user role
  redirect() {
    if(this.user.roles[0] === "ROLE_CUSTOMER") {
      sessionStorage.setItem('role', 'customer');
      sessionStorage.setItem('userId', String(this.user.userId));
      this.invalidLogin = false;
      this.router.navigate(["/customerDashboard"])
    }
    else if(this.user.roles[0] === "ROLE_ADMIN") {
      sessionStorage.setItem('role', 'admin');
      sessionStorage.setItem('userId', String(this.user.userId));
      this.invalidLogin = false;
      this.router.navigate(["adminDashboard"])
    }
  }

}
