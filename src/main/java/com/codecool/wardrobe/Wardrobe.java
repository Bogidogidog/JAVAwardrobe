package com.codecool.wardrobe;
import java.util.HashMap;
import java.util.Map;

public class Wardrobe {
    private int maxCapacity;
    private final Map<ClothingType, Integer> clothingCount;
    private final Map<Hanger, Boolean> hangers;

    public Wardrobe(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.clothingCount = new HashMap<>();
        this.hangers = new HashMap<>();
    }

    public void hangClothing(Hanger hanger, Clothing clothing){
        if(hangers.containsKey(hanger) && hangers.get(hanger)){
            hanger.hang(clothing);
            int count = clothingCount.getOrDefault(clothing.getType(),0);
            clothingCount.put(clothing.getType(),count +1);
        } else {
            System.out.println("No Hangers");
        }
    }
    public int getClothingCount(ClothingType type){
        return clothingCount.getOrDefault(type,0);
    }
    public void hangHanger(Hanger hanger){
        if(hangers.size()< maxCapacity){
            hangers.put(hanger, true);
        } else {
            System.out.println("Wardrobe is full");
        }
    }
}
