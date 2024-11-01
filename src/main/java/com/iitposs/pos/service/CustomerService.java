package com.iitposs.pos.service;

import com.iitposs.pos.dto.request.CustomerSaveRequestDTO;
import com.iitposs.pos.dto.response.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {

    String saveCustomer(CustomerSaveRequestDTO saveRequestDTO);

    String updateCustomer(CustomerSaveRequestDTO saveRequestDTO);

    CustomerResponseDTO getCustomerById(int customerID);

    List<CustomerResponseDTO> getAllCustomers();

    String deleteCustomer(int customerID);
}
