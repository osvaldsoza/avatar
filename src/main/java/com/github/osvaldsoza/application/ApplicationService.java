package com.github.osvaldsoza.application;

import com.github.osvaldsoza.application.dto.Customer;
import com.github.osvaldsoza.application.dto.ProfilePhoto;
import com.github.osvaldsoza.domain.services.CustomerReadService;
import com.github.osvaldsoza.domain.services.ProfilePhotoCreateService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ApplicationService {

    private final CustomerReadService customerReadService;
    private final ProfilePhotoCreateService profilePhotoCreateService;

    public ApplicationService(CustomerReadService customerReadService, ProfilePhotoCreateService profilePhotoCreateService) {
        this.customerReadService = customerReadService;
        this.profilePhotoCreateService = profilePhotoCreateService;
    }

    public List<Customer> searchCustomers(){
        return customerReadService.findAll().stream().map(Customer::fromDomain).toList();
    }
    public Customer getCustomer(String customerId) {
        return Customer.fromDomain(customerReadService.findById(customerId));
    }

    public void persistProfilePhoto(String customerId, ProfilePhoto profilePhotoDto){
        profilePhotoCreateService.save(customerId, profilePhotoDto.toDomain());
    }
}
