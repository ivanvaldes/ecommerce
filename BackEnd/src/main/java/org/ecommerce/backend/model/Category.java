package org.ecommerce.backend.model;

public class Category {
    private int code;
    private String name;
    private String type;

    public Category(int code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
