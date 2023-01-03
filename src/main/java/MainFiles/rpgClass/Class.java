package MainFiles.rpgClass;

import MainFiles.character.Skills;

import java.io.Serializable;
import java.util.ArrayList;

public class Class implements Serializable {

    private String className;

    private ArrayList<Skills> classSkills;
    private String classLore;
    public Class(String name){
        className = name;
        classSkills = new ArrayList<Skills>();
        classLore = "No Lore";
    }

    //set class name for simple
    public void setClassName(String name){
        className = name;
    }
    //add skills to list, no doubles
    public void addClassSkills(Skills skill){
        if (!classSkills.contains(skill)){
            classSkills.add(skill);
        }else {
            //personal check for mistake in future
            System.out.println("Skill already exists!");
        }
    }

    //make lore, info about skills and class
    public void makeLore(String lore){
        StringBuilder builder = new StringBuilder(lore);
        classLore = builder.toString();
    }
    //print lore, didn't add get because not useful
    public void printLore(){
        System.out.println(classLore);
    }


    public void printSkills (){
        int counter = 1;
        for (Skills eachSkill: classSkills){
            System.out.print(counter + ": " +eachSkill.getSkillName() + " | ");
            counter++;
        }
    }

    public Skills getSkill(int number){
        return classSkills.get(number);
    }
    @Override
    public String toString(){
        return "Class: " + className +
                ", Lore: " + classLore +
                ", Skills: \n" + classSkills;
    }
}
