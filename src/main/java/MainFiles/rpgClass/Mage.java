package MainFiles.rpgClass;

import MainFiles.character.Skills;
import MainFiles.items.Rarity;

import java.util.ArrayList;

public class Mage extends Class{

    //MAGE BASIC SKILLS : FIREBALL, MAGIC ARROW, SUPER NOVA and HEAL
    private ArrayList<Skills> classList;
    public Mage(String name) {
        super(name);
        classList = new ArrayList<>();
        addSkills(new Skills("Fireball", 15.0, new Rarity("rare")));
        addSkills(new Skills("Magic Arrow", 45.0, new Rarity("uncommon")));
        addSkills(new Skills("Super Nova", 90.0, new Rarity("epic")));
        addSkills(new Skills("HEAL", 0.0, new Rarity("epic")));
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
