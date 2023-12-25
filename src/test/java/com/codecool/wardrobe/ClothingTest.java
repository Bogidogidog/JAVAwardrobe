package com.codecool.wardrobe;

import static org.junit.jupiter.api.Assertions.*;

class ClothingTest {

    @org.junit.jupiter.api.Test
    void getBrand() {
        // Arange
        Clothing clothing = new Clothing(1, "MELLO", ClothingType.SHIRT);
        // Act
        String brand = clothing.getBrand();
        // Assert
        assertEquals("MELLO", brand);
    }
}