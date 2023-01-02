package com.character;

import com.rpgClass.Class;

import java.util.ArrayList;

public class Character extends Stats{

    private int characterLevel;
    private final String characterName;
    private double characterCoins;
    private Class characterClass;
    private ArrayList<Skills> characterSkills;

    public Character(String name){
        super();
        characterName = name;
        characterClass = new Class("Human");
        characterSkills = new ArrayList<Skills>();
    }

    //get characterLevel
    public int getCharacterLevel(){
        return characterLevel;
    }

    //increase level when boss dead or boost
    public void increaseLevel(int addLevel){
        this.characterLevel += addLevel;
    }

    //increase coins on randomDrop
    public void increaseCoin(double coins){
        this.characterCoins += coins;
    }

    //set string class on use or buy from shop
    public void changeCharacterClass(Class cClass){
        characterClass = cClass;
    }

    //add new skill and level up existing if double
    public void addSkill(Skills skill){
        if (!characterSkills.contains(skill)){
            characterSkills.add(skill);
        }else {
            skill.increaseSkillProgressLevel(10);
        }
    }

    //GETTER SETTER FOR STATS ---------------------------------------------------------------------------------------

    public void setHP(int hp){
        super.increaseStatHealth(hp);
    }

    //set stamina
    public void setSTAM(int stam) {
        super.increaseStatStamina(stam);
    }

    //set magic
    public void setMAGIC(int magic) {
        super.increaseStatMagic(magic);
    }

    //set CH%
    public void setCH(double ch) {
        super.increaseStatCriticalHit(ch);
    }

    //set DEX
    public void setDEX(int dex) {
        super.increaseStatDexterity(dex);
    }

    public int getHP() {
        return super.getStatHealth();
    }

    public int getSTAM() {
        return super.getStatHealth();
    }

    public int getMAGIC() {
        return super.getStatMagic();
    }

    public double getCH() {
        return super.getStatCriticalHit();
    }

    public int getDEX() {
        return super.getStatDexterity();
    }

}
