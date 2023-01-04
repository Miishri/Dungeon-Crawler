package MainFiles.Boss;

import MainFiles.character.Charactor;
import MainFiles.character.Skills;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Boss implements Serializable {

    private String bossName;
    private int bossHP;

    private boolean killed;
    private ArrayList<Skills> bossSkills;

    public Boss (String name, int hp){
        bossName = name;
        bossHP = hp;
        bossSkills = new ArrayList<>();
        killed = false;
    }
    //GETTERS AND SETTERS -------------------------------------------------------------------------
    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public int getBossHP() {
        return bossHP;
    }

    public void setBossHP(int bossHP) {
        this.bossHP = bossHP;
    }

    public void bossWinDrop(Charactor user, Boss boss, double coins){
        if (boss.getBossHP() == 0){
            Random randomDropCoins = new Random();
            user.increaseCoin(randomDropCoins.nextDouble(coins));
            user.addToCompleted(boss);
        }
    }

    //used for boss attack only!
    //FIX THIS
    public void useBossAttack(Charactor charactor){
        Random randomSkill = new Random();
        int randomInt = randomSkill.nextInt(bossSkills.size());

        double attack = bossSkills.get(randomInt).getSkillDamage();

        if (charactor.getHP() - attack > 0){
            charactor.setHP((int) (charactor.getHP() - attack));
            System.out.println(bossName + " used " + bossSkills.get(randomInt).getSkillName() + " and dealt " + attack + " damage to you!");
        }else {
            System.out.println("You have been killed!");
            charactor.setAlive(false);
        }
    }

    //FIX THIS
    public void attackBoss(Charactor user, Skills skills){
        if (bossHP > skills.getSkillDamage()){
            System.out.println("You dealt " + skills.getSkillDamage() + " damage to " + bossName);
            bossHP -= skills.getSkillDamage();
        }else {
            System.out.println(bossName  + "has died!");
            killed = true;
            user.addToCompleted(this);
        }
    }

    //add skills to boss
    public void setBossSkills(Skills skill){
        bossSkills.add(skill);
    }

    public void setKilled() {
        killed = true;
    }

    public String randomEntranceWord(){
        Random random = new Random();
        String[] arrayString = {
                "power!", "anger!", "annoyance!",
                "flames!", "displeasure!", "sorrow!",
                "rage!", " murderous intent!", "enraged feelings!"};
        return  arrayString[random.nextInt(arrayString.length)];
    }
    @Override
    public String toString() {
        return bossName + " has HP: " + bossHP + " comes with " + randomEntranceWord();
    }

}

