package com.praveenit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.praveenit.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>{

}
