package org.ecommerce.backend.model;

public class OrderProduct {
    private int code;
    private int amount;
    private int product_Code;
    private int client_code;
    private int order_number;

    public OrderProduct(int code, int amount, int product_Code, int client_code, int order_number) {
        this.code = code;
        this.amount = amount;
        this.product_Code = product_Code;
        this.client_code = client_code;
        this.order_number = order_number;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProduct_Code() {
        return product_Code;
    }

    public void setProduct_Code(int product_Code) {
        this.product_Code = product_Code;
    }

    public int getClient_code() {
        return client_code;
    }

    public void setClient_code(int client_code) {
        this.client_code = client_code;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }
}
