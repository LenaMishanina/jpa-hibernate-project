package me.course.spring.jpahibernateproject2.service.impl;

import me.course.spring.jpahibernateproject2.entity.EmployeeEntity;
import me.course.spring.jpahibernateproject2.repository.EmployeeRepository;
import me.course.spring.jpahibernateproject2.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    public final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return repository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        return repository.save(employee);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employee) {
        return repository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
