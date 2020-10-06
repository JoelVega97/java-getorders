package com.work.orders.repositories;

import com.work.orders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepo extends CrudRepository<Customers, Long> {
}
