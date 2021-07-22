package com.active_shoppe.repository;

import com.active_shoppe.model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel, String> {

}
