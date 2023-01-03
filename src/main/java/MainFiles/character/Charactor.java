package MainFiles.character;

import MainFiles.Boss.Boss;
import MainFiles.items.Item;
import MainFiles.items.Rarity;
import MainFiles.rpgClass.*;
import MainFiles.rpgClass.Class;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Charactor extends Stats implements Serializable {

    private int characterLevel;
    private final String characterName;
    private double characterCoins;
    private Class characterClass;
    private ArrayList<Item> characterBag;
    private boolean alive;
    private ArrayList<Boss> bossesList;
    private ArrayList<Boss> completedBosses;

    private Scanner scanner = new Scanner(System.in);

    public Charactor(String name){
        super();
        characterName = name;
        characterLevel = 1;
        characterCoins = 100;
        characterClass = new Class("Human");
        characterBag = new ArrayList<Item>();
        alive= true;
        //add bosses
        addBoss();
        setHP(100);
        setSTAM(10);
        setMAGIC(5);
        setCH(1.0);
        setDEX(0);
    }

    //get characterLevel
    public int getCharacterLevel(){
        return characterLevel;
    }

    public Class getCharacterClass() {
        return characterClass;
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
        return "\n|-----------|\n" +
                "| USER: " + characterName + "\n" +
                "| Level: " + characterLevel + "\n" +
                "| Coins: " + characterCoins + "\n" +
                "| " + characterClass + "\n" +
                "| Stats: " + super.toString() +
                "\n|-----------|";
    }

    //extra
    public void setCharacterClass(int input){
        if (input == 1){
            characterClass = new Assassin("Assassin");
        }else if (input == 2){
            characterClass = new Swordsman("Swordsman");
        }else if (input == 3){
            characterClass = new Mage("Mage");
        }else if (input == 4){
            characterClass = new Necromancer("Necromancer");
        }else {
            System.out.println("Choose the existing classes!");
        }
    }

    //inputs for playing game
    public void selectWhichMethod(int input) {
        if (input == 1){
            printOptionsAndSelect();
        }else if (input == 2){

        }else if (input == 3){

        }else if (input == 4){
            saveAll();
        }else {
            System.out.println("Command does not exist!");
        }
    }

    //log out option save all on exit
    public void saveAll(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("rpgData.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.flush();
            outputStream.writeObject(this);
            outputStream.close();

        }catch (Exception e){
            System.out.println("ERROR OCCURED INSIDE saveAll method " + e);
        }
    }

    public boolean printOptionsAndSelect(){
        System.out.println("[1] Kill new Boss");
        System.out.println("[2] Stats");
        System.out.println("[3] Go Back");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 1) {

            } else if (input == 2) {

            } else if (input == 3) {

            } else {
                System.out.println("Choose an appropriate action!");
            }
        }
    }

    public void killBoss() {
        printAllBosses();
        System.out.print("Which boss (name)?");
        while (true){
            String bossSelect = scanner.nextLine();
            Boss boss = getBoss(bossSelect);
            System.out.println("Starting fight with " + boss.getBossName());
            System.out.println(boss);

        }

    }

    public Boss getBoss (String name){
        for (Boss eachBoss: bossesList){
            if (eachBoss.getBossName().equals(name)){
                return eachBoss;
            }
        }
        return null;
    }
    //add boss my personal ones
    private void addBoss(){
        //boss 1
        Boss dracula = new Boss("Dracula", 1000 );
        dracula.setBossSkills(new Skills("Suck Life", 15, new Rarity("common")));
        bossesList.add(dracula);
        //boss 2
        Boss treelord = new Boss("Tree Lord", 2000 );
        treelord.setBossSkills(new Skills("Root attack", 30, new Rarity("common")));
        bossesList.add(treelord);
        //boss 3
        Boss samuren = new Boss("Samuren", 3000 );
        samuren.setBossSkills(new Skills("Haduken", 35, new Rarity("uncommon")));
        samuren.setBossSkills(new Skills("Kenchi", 40, new Rarity("uncommon")));
        bossesList.add(samuren);
        //boss 4
        Boss ornstein = new Boss("Ornstein", 4000 );
        ornstein.setBossSkills(new Skills("Swift", 20, new Rarity("uncommon")));
        ornstein.setBossSkills(new Skills("Fat Plum", 45, new Rarity("rare")));
        bossesList.add(ornstein);
        //boss 5
        Boss cthun = new Boss("C'thun", 5000 );
        cthun.setBossSkills(new Skills("Laser Beam", 40, new Rarity("rare")));
        cthun.setBossSkills(new Skills("Purple Orb", 60, new Rarity("uncommon")));
        bossesList.add(cthun);
        //boss 6
        Boss armstrong = new Boss("Senator Armstrong", 6500 );
        armstrong.setBossSkills(new Skills("Strong Arm", 65, new Rarity("epic")));
        armstrong.setBossSkills(new Skills("Mechanical Punch", 35, new Rarity("rare")));
        armstrong.setBossSkills(new Skills("Flying Kick", 10, new Rarity("rare")));
        bossesList.add(armstrong);
        //boss 7
        Boss sans = new Boss("Sans", 8000);
        sans.setBossSkills(new Skills("Sensei Bend", 10, new Rarity("common")));
        sans.setBossSkills(new Skills("Suction Cup", 40, new Rarity("rare")));
        sans.setBossSkills(new Skills("Sans Special Headbutt", 70, new Rarity("epic")));
        bossesList.add(sans);
        //boss 8
        Boss nameless = new Boss("The Nameless King", 10000 );
        nameless.setBossSkills(new Skills("Ultimate Slash", 55, new Rarity("rare")));
        nameless.setBossSkills(new Skills("Nameless Poison", 80, new Rarity("epic")));
        nameless.setBossSkills(new Skills("King's Wrath", 100, new Rarity("epic")));
        bossesList.add(nameless);
        //boss 9
        Boss isshin = new Boss("Isshin the Sword Saint", 13000 );
        nameless.setBossSkills(new Skills("Saint's Blessing", 30, new Rarity("uncommon")));
        nameless.setBossSkills(new Skills("Buddha Killer", 100, new Rarity("epic")));
        nameless.setBossSkills(new Skills("Isshin's glock", 10, new Rarity("legendary")));
        bossesList.add(isshin);
        //boss 10
        Boss goku = new Boss("Goku", 20000);
        nameless.setBossSkills(new Skills("Kame Ha Me Ha", 100, new Rarity("legendary")));
        nameless.setBossSkills(new Skills("Ki Blast", 80, new Rarity("epic")));
        nameless.setBossSkills(new Skills("Ultra Instinct Roar", 200, new Rarity("legendary")));
        bossesList.add(goku);
    }

    //add to completed boss list and remove from left bosses
    public void addToCompleted(Boss boss){
        completedBosses.add(boss);
        bossesList.remove(boss);
    }
    public void printAllBosses() {
        int counting = 1;
        for (Boss eachBoss: bossesList){
            System.out.println(counting + ": " +eachBoss);
            counting++;
        }
    }

    public void useCharSkills(Boss boss) {
        while (alive){
            System.out.println("Which skills would you like to use?");
            characterClass.printSkills();
            int input = scanner.nextInt();
            if (input == 1){

            }else if (input == 2){

            }else if (input == 3){

            }else if (input == 4){

            }else {
                System.out.println("Choose appropriate skill!");
            }

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

    public void setAlive(Boolean bool) {
        alive = bool;
    }

}
