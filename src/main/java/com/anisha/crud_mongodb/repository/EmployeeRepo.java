package com.anisha.crud_mongodb.repository;

import com.anisha.crud_mongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,Integer> {
    Employee findById(int id);
}
