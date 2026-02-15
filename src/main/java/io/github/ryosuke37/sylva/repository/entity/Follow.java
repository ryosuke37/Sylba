package io.github.ryosuke37.sylva.repository.entity;

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
@Table(name = "follows")
@Getter
@Setter
@ToString
public class Follow {
    @Id
    @Column
    @GenerateUuidV7
    private String id;

    @Column
    private String followUserId;

    @Column
    private String followerUserId;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column
    @UpdateTimestamp
    @LastModifiedDate
    private LocalDateTime updatedDate;
}