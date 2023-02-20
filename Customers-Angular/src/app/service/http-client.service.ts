import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Customers {
  constructor(public firstName: string, public lastName: string) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private httpClient: HttpClient) { }

  getCustomers() {
    console.log("test call");
    return this.httpClient.get<Customers[]>('http://localhost:8080/Customers');
  }
}
