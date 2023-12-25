package com.codecool.wardrobe;

public class DoubleHanger extends Hanger{

    private Clothing upperClothing;
    private Clothing lowerClothing;

    @Override
    public void hang(Clothing clothing) {
    if(upperClothing == null &&(clothing.getType() == ClothingType.SKIRT || clothing.getType() == ClothingType.BLOUSE)){
        upperClothing = clothing;
        System.out.println("Hung" + clothing.getType());
    } else if (lowerClothing == null && (clothing.getType()== ClothingType.SHIRT || clothing.getType() == ClothingType.TROUSERS)){
        lowerClothing = clothing;
        System.out.println("Hung" +  clothing.getType());
        } else {
            System.out.println("Cannot Hung clothes");
        }

    }
}

