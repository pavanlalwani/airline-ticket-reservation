import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user.component';

//Author: SANCHIT SINGHAL
//Description: Performs Authentication and user management operations
//Created On: 08/05/2020


@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private httpClient: HttpClient) { }

  //Retrieves user token and checks authentication
  authenticate(username, password) {

    // return this.httpClient.post<any>('http://localhost:8080/authenticate',
    return this.httpClient.post<any>('http://localhost:8080/api/auth/signin',{username, password})
  }

  // Checks whether the user is logged in
  isUserLoggedIn():boolean {
    let user = sessionStorage.getItem('username')
    return !(user === null)
  }

  // Removes user session(logout)
  logOut() {
    sessionStorage.removeItem('username');
  }

  // Adds a new User
  signUp(user: User) {
    return this.httpClient.post('http://localhost:8080/api/auth/signup', user);
  }


}
