package com.codecool.wardrobe;

public class Clothing {
    private final int id;
    private final String brand;
    private final ClothingType type;

    public Clothing(int id, String brand, ClothingType type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public ClothingType getType() {
        return type;
    }
}
