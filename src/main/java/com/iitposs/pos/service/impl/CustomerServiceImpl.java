package com.iitposs.pos.service.impl;

import com.iitposs.pos.dto.request.CustomerSaveRequestDTO;
import com.iitposs.pos.entity.Customer;
import com.iitposs.pos.repo.CustomerRepo;
import com.iitposs.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerSaveRequestDTO saveRequestDTO) {

        Customer customer = new Customer(
                saveRequestDTO.getCustomerID(),
                saveRequestDTO.getCustomerName(),
                saveRequestDTO.getCustomerAddress(),
                saveRequestDTO.getSalary(),
                saveRequestDTO.getContacts(),
                saveRequestDTO.getNic(),
                saveRequestDTO.isActiveState()
        );

        customerRepo.save(customer);

        return "Saved";
    }

    @Override
    public String updateCustomer(CustomerSaveRequestDTO saveRequestDTO) {

        if (customerRepo.existsById(saveRequestDTO.getCustomerID())){

            Customer customer = customerRepo.getReferenceById(saveRequestDTO.getCustomerID());

            customer.setCustomerName(saveRequestDTO.getCustomerName());
            customer.setCustomerAddress(saveRequestDTO.getCustomerAddress());
            customer.setSalary(saveRequestDTO.getSalary());
            customer.setActiveState(saveRequestDTO.isActiveState());

            customerRepo.save(customer);

            return saveRequestDTO.getCustomerName()+ " has been updated...";

        }else {
            return "Something went wrong...";
        }

    }
}
