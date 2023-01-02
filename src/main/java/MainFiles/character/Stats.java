package MainFiles.character;

import java.io.Serializable;

public class Stats implements Serializable {

    private int statHealth;
    private int statStamina;
    private int statMagic;
    private double statCriticalHit;
    private int statDexterity;

    public Stats(){}

    //set hp
    public void increaseStatHealth(int hp){
        statHealth += hp;
    }

    //set stamina
    public void increaseStatStamina(int stam) {
        statStamina += stam;
    }

    //set magic
    public void increaseStatMagic(int magic) {
        statMagic += magic;
    }

    //set CH%
    public void increaseStatCriticalHit(double ch) {
        statCriticalHit += ch;
    }

    //set DEX
    public void increaseStatDexterity(int dex) {
        this.statDexterity += dex;
    }

    //GETTERS -----------------------------------------------------------------------------------------
    public int getStatHealth() {
        return statHealth;
    }

    public int getStatStamina() {
        return statStamina;
    }

    public int getStatMagic() {
        return statMagic;
    }

    public double getStatCriticalHit() {
        return statCriticalHit;
    }

    public int getStatDexterity() {
        return statDexterity;
    }

    @Override
    public String toString() {
        return  "HP: " + statHealth +
                "\n| STAMINA: " + statStamina +
                "\n| MAGIC: " + statMagic +
                "\n| CRITICAL%: " + statCriticalHit +
                "\n| DEX: " + statDexterity
                ;
    }
}
