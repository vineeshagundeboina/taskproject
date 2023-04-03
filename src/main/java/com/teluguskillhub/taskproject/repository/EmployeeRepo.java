package com.teluguskillhub.taskproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teluguskillhub.taskproject.entity.Employee;
@Repository 
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
