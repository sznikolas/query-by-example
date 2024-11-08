package com.nikolas.query_by_example.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, QueryByExampleExecutor<Employee> {

//    List<Employee> findAllByFirstName(String firstName);

}
