package com.rpgClass;

import com.character.Skills;

import java.util.ArrayList;

public class Class {

    private String className;

    private ArrayList<Skills> classSkills;
    public Class(String name){
        className = name;
        classSkills = new ArrayList<Skills>();
    }

    //add skills to list, no doubles
    public void addClassSkills(Skills skill){
        if (!classSkills.contains(skill)){
            classSkills.add(skill);
        }
    }
}
