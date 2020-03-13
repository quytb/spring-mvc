package com.quytb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createddate")
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(name = "modifieddate")
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Column(name = "createby")
    @CreatedBy
    private Integer createBy;

    @Column(name = "modifiedby")
    @LastModifiedDate
    private Integer modifiedBy;
}
