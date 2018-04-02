package com.data.named.query.repository;

import com.data.named.query.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CompanyRepository extends JpaRepository<Company,Integer> {
    List<Company> findByName(String xebia);

    @Query("from Company company join fetch company.employees")
    List<Company> findAll();
}
