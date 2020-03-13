package com.quytb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "news")
public class NewEntity extends BaseEntity {
    @Column(name = "title")
    private String title;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "shortdescription", columnDefinition = "TEXT")
    private String shortDescription;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
    @Column(name = "categoryid")
    private Long categoryId;
}
