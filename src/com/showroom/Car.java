package com.showroom;

public class Car {

    private String model;
    private String manufacturer;
    private double price;

    public Car(String model, String manufacturer, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return manufacturer + ", " + price; // Chỉ hiển thị hãng và giá
    }

}
