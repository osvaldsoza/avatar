package com.github.osvaldsoza.infrastructure.repositories;

import com.github.osvaldsoza.domain.models.Customer;
import com.github.osvaldsoza.domain.models.ProfilePhoto;
import com.github.osvaldsoza.domain.repositories.CustomerQuery;
import com.github.osvaldsoza.domain.repositories.CustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> find(CustomerQuery customerQuery) {
        return List.of(new Customer("customerId",List.of(new ProfilePhoto("profilePhotoId","originalPhoto","generatedPhoto"))));
    }
}
