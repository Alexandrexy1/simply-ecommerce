package com.studyingalex.simply_ecommerce.dto;

import com.studyingalex.simply_ecommerce.entities.Product;

public final class ProductDTO {
    private long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;

    public ProductDTO() {}

    public ProductDTO(long id, String name, String description, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.imageUrl = product.getImageUrl();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
