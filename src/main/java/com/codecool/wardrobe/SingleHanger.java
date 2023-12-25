package com.codecool.wardrobe;

public class SingleHanger extends Hanger {
    private Clothing hungClothing;

    @Override
    public void hang(Clothing clothing) {
        if(hungClothing == null && (clothing.getType() == ClothingType.SHIRT || clothing.getType() == ClothingType.BLOUSE)){
            hungClothing = clothing;
            System.out.println("Hung a" + clothing.getType());
        }else {
            System.out.println("Cannot hung");
        }
    }
}
