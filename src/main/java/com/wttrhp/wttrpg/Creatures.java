package com.wttrhp.wttrpg;

import java.io.Serializable;

public class Creatures implements Serializable {
    //Характеристики ____________________________________________________________________________________________

    int intel;
    int refl;
    int bt;
    int agility;
    int speed;
    int emp;
    int crt;
    int will;
    int luck;
    int energy;


    // Показатели __________________________________________________________________________________________________
    int run = speed * 3;
    int jump = speed / 5;
    public int hp = (bt + will) / 2  * 5;
    public int tmp_hp = hp;
    public int stm = (bt + will) / 2  * 5;
    public int tmp_stm = stm;
    public int rlx = (bt + will) / 2;
    public int stb = (bt + will) / 2; int tmp_stb = stb;
    public int mdf = 0;



    // Эффекты______________________________________________________________________________________________________
    boolean isBurning;
    boolean isDisorientated;
    boolean isPoisoned;
    boolean isFrozen;
    int isBleeding;
    boolean isStunned;
    boolean isDrunk;
    boolean isHallucinated;
    boolean isSick; int sickCount;
    boolean isChoking;
    boolean isBlind;
    boolean isAlmostDead; int almostDead;
    boolean isDead;
    boolean isKnockedOut;
    //Навыки __________________________________________________________________________________________________________
    //Навыки интеллекта

    int attention = 0;
    int survival= 0;
    int deduction= 0;
    int monstrology= 0;
    int orientation= 0;
    int education= 0;
    int  kt= 0;
    int tactics= 0;
    int trade= 0;
    int etiquette= 0;
    int language_humen= 0;
    int language_dwarfs= 0;
    int laguage_elfs= 0;

    //Навыки Эмпатии
    int gambling= 0;
    int appearance= 0;
    int performance= 0;
    int art= 0;
    int leaderShip= 0;
    int deception= 0;
    int understandingPeople= 0;
    int seduction= 0;
    int belief= 0;
    int charisma= 0;

    //Навыки Реакции
    int melee= 0;
    int struggle= 0;
    int horseBackRiding= 0;
    int polearm= 0;
    int lightBlades= 0;
    int swordsmanship= 0;
    int navigation= 0;
    int dodge= 0;

    //Навыки Ловкости
    int athletics= 0;
    int prestidigitation= 0;
    int stealth= 0;
    int crossbow= 0;
    int bow= 0;

    //Навыки Телосложения
    int strength= 0;
    int durability= 0;


    //Навыки воли
    int intimidation= 0;
    int corruption= 0;
    int rituals= 0;
    int stubbornness= 0;
    int magicResist= 0;
    int castingSpells= 0;
    int bravery= 0;


    //Навыки ремесла
    int alchemy= 0;
    int lockpicking= 0;
    int tramKnowledge= 0;
    int making= 0;
    int disguise= 0;
    int firstAid= 0;
    int forgery= 0;


    int mSkill= 0;
    int mSkill11= 0;
    int mSkill12= 0;
    int mSkill13= 0;
    int mSkill21= 0;
    int mSkill22= 0;
    int mSkill23= 0;
    int mSkill31= 0;
    int mSkill32= 0;
    int mSkill33= 0;


    public Creatures(Creatures c) {
        this.attention = c.attention;
        this.survival = c.survival;
        this.deduction = c.deduction;
        this.monstrology = c.monstrology;
        this.orientation = c.orientation;
        this.education = c.education;
        this.kt = c.kt;
        this.tactics = c.tactics;
        this.trade = c.trade;
        this.etiquette= c.etiquette;
        this.language_humen= c.language_humen;
        this.language_dwarfs= c.language_dwarfs;
        this.laguage_elfs= c.laguage_elfs;

        //Навыки Эмпатии
        this.gambling= c.gambling;
        this.appearance= c.appearance;
        this.performance= c.appearance;
        this.art= c.art;
        this.leaderShip= c.leaderShip;
        this.deception= c.deception;
        this.understandingPeople= c.understandingPeople;
        this.seduction= c.seduction;
        this.belief= c.belief;
        this.charisma= c.charisma;

        //Навыки Реакции
        this.melee= c.melee;
        this.struggle= c.struggle;
        this.horseBackRiding= c.horseBackRiding;
        this.polearm= c.polearm;
        this.lightBlades= c.lightBlades;
        this.swordsmanship= c.swordsmanship;
        this.navigation= c.navigation;
        this.dodge= c.dodge;

        //Навыки Ловкости
        this.athletics= c.athletics;
        this.prestidigitation= 0;
        this.stealth= c.stealth;
        this.crossbow= c.crossbow;
        this.bow= c.bow;

        //Навыки Телосложения
        this.strength= c.strength;
        this.durability= c.durability;


        //Навыки воли
        this.intimidation= c.intimidation;
        this.corruption= c.corruption;
        this.rituals= c.rituals;
        this.stubbornness= c.stubbornness;
        this.magicResist= c.magicResist;
        this.castingSpells= c.castingSpells;
        this.bravery= c.bravery;


        //Навыки ремесла
        this.alchemy= c.alchemy;
        this.lockpicking= c.lockpicking;
        this.tramKnowledge= c.tramKnowledge;
        this.making= c.making;
        this.disguise= c.disguise;
        this.firstAid= c.firstAid;
        this.forgery= c.forgery;


        this.mSkill= c.mSkill;
        this.mSkill11= c.mSkill11;
        this.mSkill12= c.mSkill12;
        this.mSkill13= c.mSkill13;
        this.mSkill21= c.mSkill21;
        this.mSkill22= c.mSkill22;
        this.mSkill23= c.mSkill23;
        this.mSkill31= c.mSkill31;
        this.mSkill32= c.mSkill32;
        this.mSkill33= c.mSkill33;
    }

    public Creatures() {

    }

    public void setPar (int intel,int refl,int bt, int agility, int speed, int emp, int crt,int will,int luck) {
        this.intel = intel;
        this.refl = refl;
        this.bt = bt;
        this.agility = agility;
        this.speed = speed;
        this.emp = emp;
        this.crt = crt;
        this.will = will;
        this.luck = luck;


    }
    public void setInd(){
        run = speed * 3;
        jump = speed / 5;
        hp = (bt + will) / 2  * 5;
        stm = (bt + will) / 2  * 5;
        rlx = (bt + will) / 2;
        stb = (bt + will) / 2;
    }



    protected void setWillSkills(int intimi, int corr, int rituals, int stubbornness, int magicResist, int castingSpells, int bravery) {
        this.intimidation = intimi;
        this.corruption = corr;
        this.rituals = rituals;
        this.stubbornness = stubbornness;
        this.magicResist = magicResist;
        this.castingSpells = castingSpells;
        this.bravery = bravery;

    }

    void setCrtSkils(int Alchemy, int lockpicking, int tramKnowledge, int making, int disguise, int firstAid, int forgery) {
        this.alchemy = alchemy;
        this.lockpicking = lockpicking;
        this.tramKnowledge = tramKnowledge;
        this.making = making;
        this.disguise = disguise;
        this.firstAid = firstAid;
        this.forgery = forgery;

    }

    void setEmpSkills(int gambling, int appearance, int performance, int art, int leaderShip, int deception, int understandingPeople, int seduction, int belief, int charisma) {
        this.gambling = gambling;
        this.appearance = appearance;
        this.performance = performance;
        this.art = art;
        this.leaderShip = leaderShip;
        this.deception = deception;
        this.understandingPeople = understandingPeople;
        this.seduction = seduction;
        this.belief = belief;
        this.charisma = charisma;

    }

    void setAglSkills(int athletics, int prestidigitation, int stealth, int crossbow, int bow) {
        this.athletics = athletics;
        this.prestidigitation = prestidigitation;
        this.stealth = stealth;
        this.crossbow = crossbow;
        this.bow = bow;

    }

    void setRflSkills(int melee, int struggle, int horseBackRiding, int polearm, int lightBlades, int swordsmanship, int navigation, int dodge) {
        this.melee = melee;
        this.struggle = struggle;
        this.horseBackRiding = horseBackRiding;
        this.polearm = polearm;
        this.lightBlades = lightBlades;
        this.swordsmanship = swordsmanship;
        this.navigation = navigation;
        this.dodge = dodge;

    }

    void setBtSkills(int strength, int durability) {
        this.strength = strength;
        this.durability = durability;

    }

    public void setIntSkills(int attention, int survival, int deduction, int monstrology, int orientation, int education, int tactics, int trade, int etiquette, int language_humen, int language_dwarfs, int laguage_elfs) {
        this.attention = attention;
        this.survival = survival;
        this.deduction = deduction;
        this.monstrology = monstrology;
        this.orientation = orientation;
        this.education = education;
        this.tactics = tactics;
        this.trade = trade;
        this.etiquette = etiquette;
        this.language_humen = language_humen;
        this.language_dwarfs = language_dwarfs;
        this.laguage_elfs = laguage_elfs;
    }
}
