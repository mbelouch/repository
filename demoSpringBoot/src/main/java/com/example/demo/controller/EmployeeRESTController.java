package com.example.demo.controller;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeList;
import com.example.demo.entity.EmployeeListVO;
import com.example.demo.entity.EmployeeVO;
 
 
@RestController
public class EmployeeRESTController 
{
    @RequestMapping(value = "/employees")
    public EmployeeList getAllEmployees() 
    {
    	EmployeeList employees = new EmployeeList();
         
        Employee empOne = new Employee("Lokesh","Gupta","howtodoinjava@gmail.com");
        Employee empTwo = new Employee("Amit","Singhal","asinghal@yahoo.com");
        Employee empThree = new Employee("Kirti","Mishra","kmishra@gmail.com");
         
         
        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);
         
        return employees;
    }
     
    @RequestMapping(value = "/employees/{id}")
    @ResponseBody
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id) 
    {
        if (id <= 3) {
            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}