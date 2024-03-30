package com.github.osvaldsoza.application.dto;

import com.github.osvaldsoza.domain.models.ProfilePhoto;

import java.util.List;

public record Customer (String customerId, List<String> photos){

    public static Customer fromDomain(com.github.osvaldsoza.domain.models.Customer customerDomain) {
        return new Customer(customerDomain.id(),
                customerDomain.profilePhotos().stream()
                        .map(ProfilePhoto::generatedPhoto)
                        .toList());
    }
}