package com.character;

public class Rarity{
    //common, rare, epic, legendary
    private String rarity;

    public Rarity (String howRare){
        //check if within rarity
        if (howRare.equals("common") ||
                howRare.equals("rare") ||
                howRare.equals("epic") ||
                howRare.equals("legendary")){
            rarity = howRare;
        }else {
            rarity = "common";
        }
    }
    //get rarity on call
    public String getRarity() {
        return rarity;
    }
}
