package com.github.osvaldsoza.domain.services;

import com.github.osvaldsoza.domain.models.ProfilePhoto;
import com.github.osvaldsoza.domain.repositories.ProfilePhotoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProfilePhotoCreateService {

    private final ProfilePhotoRepository repository;

    public ProfilePhotoCreateService(ProfilePhotoRepository repository) {
        this.repository = repository;
    }

    public void save(String customerId, ProfilePhoto profilePhoto){
        repository.save(customerId,profilePhoto);
    }
}
