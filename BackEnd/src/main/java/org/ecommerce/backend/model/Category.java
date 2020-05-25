package org.ecommerce.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE")
    private int code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private String type;

    public Category(int code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public Category() {

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
