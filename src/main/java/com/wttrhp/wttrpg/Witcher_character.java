package com.wttrhp.wttrpg;

public class Witcher_character extends Humanoids {

    public Witcher_character(String name, String race, String sex, String prof) {
        super(name, race, sex, prof);
    }

    public Witcher_character(Humanoids h) {
        super();
        this.attention = h.attention;
        this.survival = h.survival;
        this.deduction = h.deduction;
        this.monstrology = h.monstrology;
        this.orientation = h.orientation;
        this.education = h.education;
        this.kt = h.kt;
        this.tactics = h.tactics;
        this.trade = h.trade;
        this.etiquette= h.etiquette;
        this.language_humen= h.language_humen;
        this.language_dwarfs= h.language_dwarfs;
        this.laguage_elfs= h.laguage_elfs;
    }

    public void setProfSkills(int att, int ded,int spell,int alch,int dodge,int surv, int sword, int atl,int stl,int hbr,int wt) {
        this.attention = att;
        this.deduction = ded;
        this.castingSpells = spell;
        this.alchemy = alch;
        this.dodge = dodge;
        this.survival = surv;
        this.swordsmanship = sword;
        this.athletics = atl;
        this.stealth = stl;
        this.horseBackRiding = hbr;
        this.mSkill = wt;
    }


}
