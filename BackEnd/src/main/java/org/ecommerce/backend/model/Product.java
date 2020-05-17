package org.ecommerce.backend.model;

public class Product {
    private int code;
    private String username;
    private String name;
    private String description;
    private int category_code;

    public Product(int code, String username, String name, String description, int category_code) {
        this.code = code;
        this.username = username;
        this.name = name;
        this.description = description;
        this.category_code = category_code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getCategory_code() {
        return category_code;
    }

    public void setCategory_code(int category_code) {
        this.category_code = category_code;
    }
}
