package com.rpgClass;

import com.character.Skills;

public class Mage extends Class{

    public Mage(String name) {
        super(name);
    }

    //add lore to superclass
    public void addLore(String addLore){
        super.makeLore(addLore);
    }

    //add skills to superclass list
    public void addSkills(Skills skill){
        super.addClassSkills(skill);
    }

    //print lore
    public void printLore(){
        super.printLore();
    }
}
