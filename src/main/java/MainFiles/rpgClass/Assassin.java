package MainFiles.rpgClass;

import MainFiles.character.Skills;
import MainFiles.items.Rarity;

import java.util.ArrayList;

public class Assassin extends Class{

    //ASSASSIN BASIC SKILLS: BACKSTAB, STEALTH, POISON and KNIFE THROW
    private ArrayList<Skills> classList;
    public Assassin(String name) {
        super(name);
        classList = new ArrayList<>();
        addSkills(new Skills("Backstab", 90.0, new Rarity("rare")));
        addSkills(new Skills("Stealth", 0.0, new Rarity("rare")));
        addSkills(new Skills("Poison", 10.0, new Rarity("epic")));
        addSkills(new Skills("Knife Throw", 100.0, new Rarity("rare")));
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
        for (Skills eachSkill: classList){
            System.out.println(eachSkill + "\n");
        }
    }
}
