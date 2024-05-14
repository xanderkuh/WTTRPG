package com.wttrhp.wttrpg;

public abstract class Humanoids extends Creatures{
      String name;
    int carryingWeight;
    String sex;
    int age;
    String race;
    int armor = 0;
    int gold;
    String prof;
    int profSkillPoint;
    int skillPoint;


    public Humanoids(String name, String race,String sex, String prof) {
        super();
        this.name = name;
        this.race = race;

        this.sex = sex;
        this.prof = prof;

    }

    public Humanoids() {

    }

    public abstract void setProfSkills(int ps1,int ps2,int ps3, int ps4,int ps5, int ps6, int ps7, int ps8,int ps9, int ps10, int ps11);


    public static Humanoids create_char(String name, String race, String sex, String prof) {
        switch (race){
            case  ("Ведьмак") : {
                Witcher_character witcher = new Witcher_character(name,race,sex,prof);
                return witcher;
            }
        }
        return null;
    }

    public void setPar(int intel,int refl,int bt,int agility,int speed,int emp,int crt,int will, int luck) {
        this.intel = intel;
        this.refl = refl;
        this.bt = bt;
        this.agility = agility;
        this.speed = speed;
        this.emp = emp;
        this.crt = crt;
        this.will = will;
        this.luck = luck;
        System.out.println(intel);
    }







    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public String getSex() {
        return sex;
    }
}
