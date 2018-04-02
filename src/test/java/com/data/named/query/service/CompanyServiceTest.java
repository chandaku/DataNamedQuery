package com.data.named.query.service;

import com.data.named.query.DataNamedQueryApplicationTests;
import com.data.named.query.entity.Company;
import com.data.named.query.entity.Employee;
import com.data.named.query.repository.CompanyRepository;
import com.data.named.query.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EmbeddedId;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

public class CompanyServiceTest extends DataNamedQueryApplicationTests{

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Before
    public void setup(){
        Company company = Company.builder()
                .address("ParkCentra").name("Xebia").build();
       List<Employee> employees = Arrays.asList(new Employee[]{
                Employee.builder().name("ckumar").contact("+919912321").company(company).build(),
                Employee.builder().name("mangal").contact("+919912321").company(company).build()
                });

        company.setEmployees( employeeRepository.saveAll(employees));
        companyRepository.save(company);
        Company company1 = Company.builder()
                .address("ParkCentra").name("Xebia").build();
        List<Employee> employees1 = Arrays.asList(new Employee[]{
                Employee.builder().name("ckumar").contact("+919912321").company(company1).build(),
                Employee.builder().name("mangal").contact("+919912321").company(company1).build()
        });
       company1.setEmployees( employeeRepository.saveAll(employees1));
       companyRepository.save(company1);

    }

    @Test
    public void getCompany() throws Exception {
        List<Company> comp = companyRepository.findByName("Xebia");
        List<Employee> allEmployee = employeeRepository.findAll();

       Assert.assertTrue( comp.stream().count()==2);

       comp.stream().forEach(
               company -> {
                   Assert.assertNotNull("Employee Null found", company.getEmployees());
                   company.getEmployees().stream().forEach(employee -> {
                       Assert.assertNotNull("Employee Name is null found", employee.getName());
                   });
               }
       );

    }

}