package com.sbc.sbc_brewery.services;

import com.sbc.sbc_brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}