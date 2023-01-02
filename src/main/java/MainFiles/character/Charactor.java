package MainFiles.character;

import MainFiles.items.Item;
import MainFiles.rpgClass.Class;

import java.io.Serializable;
import java.util.ArrayList;


public class Charactor extends Stats implements Serializable {

    private int characterLevel;
    private final String characterName;
    private double characterCoins;
    private Class characterClass;
    private ArrayList<Skills> characterSkills;
    private ArrayList<Item> characterBag;

    public Charactor(String name){
        super();
        characterName = name;
        characterClass = new Class("Human");
        characterSkills = new ArrayList<Skills>();
        characterBag = new ArrayList<Item>();
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
        characterCoins += coins;
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

    //get name
    public String getName(){
        return characterName;
    }
    //add to bag
    public void addToBag(Item item){
        characterBag.add(item);
    }

    //check if it returns null to get proper item
    public Item getFromBag(Item item){
        Item itemOne = null;
        for (Item eachItem: characterBag){
            if (eachItem.equals(item)){
                itemOne = eachItem;
            }
        }
        return itemOne;
    }
    //return string representation for the character class
    @Override
    public String toString(){
        return "USER: " + characterName +
                "| Level: " + characterLevel +
                "| Coins: " + characterCoins +
                "| Class: " + characterLevel +
                "\n| Skills: " + characterSkills +
                "| Stats: " + super.toString();
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
