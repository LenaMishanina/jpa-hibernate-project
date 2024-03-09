package me.course.spring.jpahibernateproject2.controller;

import me.course.spring.jpahibernateproject2.entity.EmployeeEntity;
import me.course.spring.jpahibernateproject2.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping
    public List<EmployeeEntity> findAllEmployee() {
        return service.findAllEmployee();
    }
    @GetMapping("/find/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee) {
        return service.saveEmployee(employee);
    }
    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee) {
        return service.updateEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long id) {
        service.deleteEmployee(id);
    }


}
