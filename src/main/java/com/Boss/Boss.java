package com.Boss;

import com.character.Stats;

public class Boss {

    private String bossName;
    private int bossHP;
    private int bossAttack;
    private int bossCH;

    public Boss (String name){
        bossName = name;
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

    public int getBossAttack() {
        return bossAttack;
    }

    public void setBossAttack(int bossAttack) {
        this.bossAttack = bossAttack;
    }

    public int getBossCH() {
        return bossCH;
    }

    public void setBossCH(int bossCH) {
        this.bossCH = bossCH;
    }
}

