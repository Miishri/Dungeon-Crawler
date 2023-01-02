package MainFiles.rpgClass;

import MainFiles.character.Skills;
import MainFiles.items.Rarity;

import java.util.ArrayList;

public class Necromancer extends Class{
    //NECROMANCER SKILLS: LIFE STEAL, SCYTHE SLASH, DEFLECT and REVIVE
    private ArrayList<Skills> classList;
    public Necromancer(String name) {
        super(name);
        classList = new ArrayList<>();
        addSkills(new Skills("Life Steal", 10.0, new Rarity("uncommon")));
        addSkills(new Skills("Scythe Slash", 30, new Rarity("rare")));
        addSkills(new Skills("Deflect", 0.0, new Rarity("common")));
        addSkills(new Skills("Revive", 0.0, new Rarity("epic")));
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
