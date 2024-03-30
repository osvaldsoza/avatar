package com.github.osvaldsoza.infrastructure.repositories;

import com.github.osvaldsoza.domain.models.ProfilePhoto;
import com.github.osvaldsoza.domain.repositories.ProfilePhotoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProfilePhotorepositoryImpl implements ProfilePhotoRepository {
    @Override
    public void save(String customerId, ProfilePhoto profilePhoto) {

    }
}
