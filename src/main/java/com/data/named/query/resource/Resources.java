package com.data.named.query.resource;

import com.data.named.query.entity.Company;
import com.data.named.query.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/resources")
@RestController
public class Resources {

    @Autowired
    CompanyService companyService;

    @GetMapping("/company")
    List<Company> getCompanies(){
        return companyService.getCompany();
    }
}
