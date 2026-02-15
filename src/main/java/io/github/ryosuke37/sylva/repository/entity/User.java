package io.github.ryosuke37.sylva.repository.entity;

import io.github.ryosuke37.sylva.common.enums.Country;
import io.github.ryosuke37.sylva.common.enums.Language;
import io.github.ryosuke37.sylva.repository.annotation.GenerateUuidV7;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column
    @GenerateUuidV7
    private String id;

    @Column
    private String account;

    @Column
    private String name;

    @Column
    private String mail;

    @Column
    private String hashedPassword;

    @Column
    private String phoneNumber;

    @Column
    private Country country;

    @Column
    private Language language;

    @Column
    private String selfIntroduction;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column
    @UpdateTimestamp
    @LastModifiedDate
    private LocalDateTime updatedDate;
}