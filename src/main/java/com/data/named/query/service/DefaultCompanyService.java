package com.data.named.query.service;

import com.data.named.query.entity.Company;
import com.data.named.query.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class DefaultCompanyService implements CompanyService {


    @Autowired
    CompanyRepository repository;

    @Override
    public List<Company> getCompany() {
        List<Company> companies =  repository.findAll();
        return companies;
    }
}
