package MainFiles.character;

import MainFiles.Boss.Boss;
import MainFiles.items.Rarity;

import java.io.Serializable;

public class Skills implements Serializable {

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
        if (percentTillLevel + level > 100){
            skillLevel = 1;
            percentTillLevel -= level;
        }else {
            percentTillLevel += level;
        }
    }

    //set cooldown based on rarity
    @Override
    public String toString(){
        return  "\n" + "NAME: " + skillName +
                " LVL: " + skillLevel +
                " Proficiency: " + percentTillLevel + "%" +
                " DMG: " + skillDamage +
                " RARITY: " + skillRarity + "\n";
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public double getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(double skillDamage) {
        this.skillDamage = skillDamage;
    }

    public double getPercentTillLevel() {
        return percentTillLevel;
    }

    public void setPercentTillLevel(double percentTillLevel) {
        this.percentTillLevel = percentTillLevel;
    }

    public Rarity getSkillRarity() {
        return skillRarity;
    }

    public void setSkillRarity(Rarity skillRarity) {
        this.skillRarity = skillRarity;
    }

    //use skill by inputting

}
