package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApiController {
@Autowired
EmployeeRepo serviceRepository;
@GetMapping("/getvalues")
List<Employee> getList(){
return serviceRepository.findAll();
}
@PostMapping("/post")
public Employee create(@RequestBody Employee stu) {
return serviceRepository.save(stu);
}

}