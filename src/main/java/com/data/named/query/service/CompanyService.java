package com.data.named.query.service;

import com.data.named.query.entity.Company;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CompanyService {
    List<Company> getCompany();
}
