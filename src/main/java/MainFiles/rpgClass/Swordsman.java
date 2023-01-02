package MainFiles.rpgClass;

import MainFiles.character.Skills;
import MainFiles.items.Rarity;

import java.util.ArrayList;

public class Swordsman extends Class{

    //SWORD SKILLS : BASIC SLASH, PIERCE, BLOCK and Last Resort
    private ArrayList<Skills> classList;
    public Swordsman(String name) {
        super(name);
        classList = new ArrayList<>();
        addSkills(new Skills("Basic Slash", 15.0, new Rarity("common")));
        addSkills(new Skills("PIERCE", 60, new Rarity("uncommon")));
        addSkills(new Skills("BLOCK", 0.0, new Rarity("rare")));
        addSkills(new Skills("Last Resort", 100, new Rarity("legendary")));
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

    //print skills that are related to the class
    public void printSkills(){
        System.out.println(classList);
    }
}
