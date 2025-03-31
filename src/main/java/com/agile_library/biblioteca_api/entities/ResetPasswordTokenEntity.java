package com.agile_library.biblioteca_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_password_reset_tokens")
@Table(name = "tb_password_reset_tokens")
public class ResetPasswordTokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true, length = 6)
    private String token;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(name = "expiration", nullable = false)
    private LocalDateTime expiration;

    @Column(name = "creation", nullable = false)
    private LocalDateTime creation;

    @Column(name = "used", nullable = false)
    private boolean used;
}
