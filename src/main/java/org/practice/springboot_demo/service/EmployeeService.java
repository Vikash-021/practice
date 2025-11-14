package org.practice.springboot_demo.service;

import org.practice.springboot_demo.dto.EmployeeDto;
import org.practice.springboot_demo.model.Address;
import org.practice.springboot_demo.model.Employee;
import org.practice.springboot_demo.repository.AddressRepository;
import org.practice.springboot_demo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    AddressRepository addressRepository;
    public void saveData(EmployeeDto employeeDto){
          Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeRepository.save(employee);
        Address a=new Address();
        BeanUtils.copyProperties(employeeDto,a);
        addressRepository.save(a);
    }

    public void delete(){
        employeeRepository.findById(1L)
                .ifPresent(ele->employeeRepository.delete(ele));
        addressRepository.deleteById(1);
    }
}
