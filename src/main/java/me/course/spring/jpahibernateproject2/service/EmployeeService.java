package me.course.spring.jpahibernateproject2.service;

import me.course.spring.jpahibernateproject2.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(EmployeeEntity employee);
    void deleteEmployee(Long id);

}
