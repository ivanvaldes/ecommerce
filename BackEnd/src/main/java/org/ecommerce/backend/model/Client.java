package org.ecommerce.backend.model;

public class Client {
    private int code;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public Client(int code, String name, String lastName, String email, String phone) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
