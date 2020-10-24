package org.sid.catservice;

import org.sid.catservice.dao.EmployeeRepository;
import org.sid.catservice.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class EmployeeRestService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value="/listEmployes")
    public List<Employee> list(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/listEmployes/{id}")
    public Employee list(@PathVariable(name="id") Long id){
     return  employeeRepository.findById(id).get();
    }


    @PutMapping (value = "/listEmployes/{id}")
    public Employee update(@PathVariable(name="id") Long id, @RequestBody Employee E){
         E.setId(id);
         return employeeRepository.save(E);
    }

    @PostMapping (value = "/listEmployes")
    public Employee save(@RequestBody Employee E){
        return employeeRepository.save(E);
    }

    @DeleteMapping (value = "/listEmployes/{id}")
    public  void delete(@PathVariable(name="id") Long id){
        employeeRepository.deleteById(id);
    }





}
