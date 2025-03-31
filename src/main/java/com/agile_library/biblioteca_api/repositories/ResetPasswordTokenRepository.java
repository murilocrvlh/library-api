package com.agile_library.biblioteca_api.repositories;

import com.agile_library.biblioteca_api.entities.ResetPasswordTokenEntity;
import com.agile_library.biblioteca_api.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResetPasswordTokenRepository extends JpaRepository<ResetPasswordTokenEntity, String> {
    Optional<ResetPasswordTokenEntity> findByToken(String token);
    List<ResetPasswordTokenEntity> findByusersOrderByCreationDesc(UserEntity user);
}
