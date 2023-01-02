package com.character;

public class Skills {

    private String skillName;
    private int skillLevel;
    private double skillDamage;
    private double percentTillLevel;
    private Rarity skillRarity;

    public Skills(String name, double damage, Rarity rarity) {
        skillName = name;
        skillLevel = 1;
        skillDamage = damage;
        percentTillLevel = 0.0;
        skillRarity = rarity;
    }

    //skill level up if double
    public void increaseSkillProgressLevel(double level){
        percentTillLevel += level;
    }
}
