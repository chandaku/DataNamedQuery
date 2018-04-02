package com.data.named.query.repository;

import com.data.named.query.entity.Company;
import com.data.named.query.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
