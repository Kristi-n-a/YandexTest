package com.example.testtask;

public class item {
    private final String itemType;
    private final String priceForm;
    private final String priceTo;
    private final String brand;

    public item(String itemType, String priceForm, String priceTo, String brand) {
        this.itemType = itemType;
        this.priceForm = priceForm;
        this.priceTo = priceTo;
        this.brand = brand;
    }

    public String getItemType() {
        return itemType;
    }

    public String getPriceForm() {
        return priceForm;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public String getBrand() {
        return brand;
    }
}
