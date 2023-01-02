package com.character;

import com.rpgClass.Class;

import java.util.ArrayList;

public class Character {

    private int characterLevel;
    private final String characterName;
    private double characterCoins;
    private Class characterClass;
    private ArrayList<Skills> characterSkills;

    public Character(String name){
        characterName = name;
        characterClass = new Class("Human");
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


}
