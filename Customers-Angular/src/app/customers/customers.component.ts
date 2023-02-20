import { Component, OnInit } from '@angular/core';
import { Customers, HttpClientService } from '../service/http-client.service'; 

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})

export class CustomersComponent implements OnInit {
  customers: Customers[] = [];

  constructor(private httpClient: HttpClientService) {
  }

  ngOnInit(): void {
    this.httpClient.getCustomers().subscribe(
      response => {this.customers = response;}
    )
  }
}
