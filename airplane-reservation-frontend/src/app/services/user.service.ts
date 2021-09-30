import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable} from 'rxjs';
import { User } from '../model/user.component';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl='http://localhost:8080/user';
  constructor(private http: HttpClient) { }

  createUser(user: object): Observable<Object>{
    return this.http.post(`${this.baseUrl}/createUser`, user);
  } 
   signUp(user: User) {
    return this.http.post('http://localhost:8080/api/auth/signup', user);
  }

  updateUser(user: any): Observable<Object>{
    return this.http.put(`${this.baseUrl}/updateUser/`, user);
  }

  deleteUser(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrl}/deleteUser/${id}`,{ responseType: 'text'});
  }
  
  getUser(userId: number): Observable<any>{
    return this.http.get(`${this.baseUrl}/searchUser/${userId}`);
  }

  getUserList(): Observable<any>{
    return this.http.get(`${this.baseUrl}/readAllUsers`)
  }
}
