package com.character;

import java.util.ArrayList;

public class Character {

    private int characterLevel;
    private final String characterName;
    private double characterCoins;
    private Class characterClass;
    private ArrayList<Skills> characterSkills;

    public Character(String name){
        characterName = name;
        characterLevel = 0;
        characterCoins = 0.0;
        characterClass = null;
        characterSkills = new ArrayList<Skills>();
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
    public void setCharacterClass(Class cClass){
        characterClass = cClass;
    }

}
