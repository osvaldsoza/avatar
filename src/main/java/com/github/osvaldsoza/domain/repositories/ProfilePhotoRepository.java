package com.github.osvaldsoza.domain.repositories;

import com.github.osvaldsoza.domain.models.ProfilePhoto;

public interface ProfilePhotoRepository {

    void save(String customerId, ProfilePhoto profilePhoto);
}
