package com.agile_library.biblioteca_api.repositories;

import com.agile_library.biblioteca_api.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserDetails findByEmail(String email);
}
