package com.sposs;

public class Item {

    private String description;
    private String code;
    private float uPrice; // unit price
    private int quantity;

    public Item() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getUPrice() {
        return uPrice;
    }

    public void setUPrice(float uPrice) {
        this.uPrice = uPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item [description=" + description + ", code=" + code + ", uPrice=" + uPrice + ", quantity=" + quantity
                + "]";
    }

}
