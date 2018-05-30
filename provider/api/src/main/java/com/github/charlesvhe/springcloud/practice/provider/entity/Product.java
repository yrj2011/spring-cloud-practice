package com.github.charlesvhe.springcloud.practice.provider.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@ApiModel
@Entity
public class Product implements Serializable {
    @ApiModelProperty("编号")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ApiModelProperty("类别")
    private Long categoryId;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("描述")
    private String description;
    @ApiModelProperty("图片")
    private String imageUrl;

    // 仅用来自动产生关联SQL 不使用
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    private Category category;

    public Product() {
    }

    public Product(Long id, Long categoryId, String name, String description, String imageUrl) {
        this();
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}