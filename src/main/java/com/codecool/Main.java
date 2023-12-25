package com.codecool;

import com.codecool.wardrobe.*;

/*
* Wardrobe
Your task is to model a wardrobe.

Wardrobe
Clothings can be hung into it but only if they are on a hanger
Empty hangers can be hung into it as well
Has a maximum capacity: only a certain amount of hangers can be hung into it
Can tell how many of each type of clothing are inside
Has tests for the business logic

Clothing
Has a unique identifier
Has a brand name
Can be of different types

Clothing types
Shirt
Blouse
Skirt
Trousers

Hanger
We can hang items of clothing on it
We can take off clothes from it
Can be of two types: Single or Double

Single Hanger
Can hold only a shirt or blouse

Double Hanger
Can hold a shirt or blouse, and a skirt or a pair of trousers at the same time
We can take off clothes from it individually or all at once*/
public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(4);

        Clothing shirt = new Clothing(1, "PUMA", ClothingType.SHIRT);
        Clothing skirt = new Clothing(2,"ADIDAS", ClothingType.SKIRT);
        Clothing blouse = new Clothing(3, "GUCCI", ClothingType.BLOUSE);
        Clothing trousers = new Clothing(4, "MELLO", ClothingType.TROUSERS);

        Hanger singleHanger = new SingleHanger();
        Hanger doubleHanger = new DoubleHanger();

        wardrobe.hangHanger(singleHanger);
        wardrobe.hangHanger(doubleHanger);

        wardrobe.hangClothing(singleHanger, shirt);
        wardrobe.hangClothing(singleHanger, blouse);
        wardrobe.hangClothing(doubleHanger, skirt);
        wardrobe.hangClothing(doubleHanger, trousers);

        System.out.println("Shirts in closet" + wardrobe.getClothingCount(ClothingType.SHIRT));
        System.out.println();
    }
}