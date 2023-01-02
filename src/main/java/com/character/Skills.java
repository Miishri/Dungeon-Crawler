package com.character;

import com.Boss.Boss;
import com.items.Rarity;

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

    //use skill by inputting
    public void useSkill(Boss boss){

    }

    //set cooldown based on rarity
    @Override
    public String toString(){
        return  "NAME: " + skillName +
                "| LVL: " + skillLevel +
                "| Proficiency: " + percentTillLevel +
                "\n| DMG: " + skillDamage +
                "| RARITY: " + skillRarity;
    }
}
