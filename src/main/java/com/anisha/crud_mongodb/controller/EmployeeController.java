package com.anisha.crud_mongodb.controller;

import com.anisha.crud_mongodb.model.Employee;
import com.anisha.crud_mongodb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo repo;

    @RequestMapping(method = RequestMethod.GET, value = "/getEmployee")
    public List<Employee> getEmployee() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/postEmployee")
    public String postEmployee(@RequestBody Employee employee) {
        repo.save(employee);
        return "Added Successfully";
    }

    @DeleteMapping(path = "/delEmployee/{id}")
    public String delEmployee(@PathVariable int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }

}
