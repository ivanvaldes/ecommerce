package org.ecommerce.backend.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE")
    private int code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    //@ManyToMany(cascade = {
    //        CascadeType.PERSIST,
    //        CascadeType.MERGE
    //})
    //@JoinTable(name = "PRODUCT_CATEGORY",
    //        joinColumns = @JoinColumn(name = "PRODUCT_CODE"),
    //        inverseJoinColumns = @JoinColumn(name = "CATEGORY_CODE")
    //)
    //private List<Category> categories = new ArrayList<>();

    @Lob
    @Column(name = "IMAGE")
    private byte[] image;

    public Product() {
    }

    public Product(int code, String name, String description, byte[] image) {
        this.code = code;
        this.name = name;
        this.description = description;
        //this.categories = categories;
        this.image = image;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
