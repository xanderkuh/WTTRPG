package com.wttrhp.wttrpg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateController4 {

    @FXML
    private Button alchemy_down;

    @FXML
    private Text alchemy_txt;

    @FXML
    private Button alchemy_up;

    @FXML
    private Button appearance_down;

    @FXML
    private Text appearance_txt;

    @FXML
    private Button art__up;

    @FXML
    private Button art_down;

    @FXML
    private Text art_txt;

    @FXML
    private Button athletics_down;

    @FXML
    private Text athletics_txt;

    @FXML
    private Button athletics_up;

    @FXML
    private Button att_down;

    @FXML
    private Text att_txt;

    @FXML
    private Button att_up;

    @FXML
    private Button belief_down;

    @FXML
    private Text belief_txt1;

    @FXML
    private Button belief_up;

    @FXML
    private Button bow_down;

    @FXML
    private Text bow_txt;

    @FXML
    private Button bow_up;

    @FXML
    private Button bravery_down;

    @FXML
    private Text bravery_txt;

    @FXML
    private Button bravery_up;

    @FXML
    private Button castingSpells_down;

    @FXML
    private Text castingSpells_txt;

    @FXML
    private Button castingSpells_up;

    @FXML
    private Button charisma_down;

    @FXML
    private Text charisma_txt;

    @FXML
    private Button corruption_down;

    @FXML
    private Text corruption_txt;

    @FXML
    private Button corruption_up;

    @FXML
    private Button crossbow__up;

    @FXML
    private Button crossbow_down;

    @FXML
    private Text crossbow_txt;

    @FXML
    private Button deception_down;

    @FXML
    private Text deception_txt;

    @FXML
    private Button deception_up;

    @FXML
    private Button deduction_down;

    @FXML
    private Button deduction_up;

    @FXML
    private Button disguise_down;

    @FXML
    private Text disguise_txt;

    @FXML
    private Button disguise_up;

    @FXML
    private Button dodge_down;

    @FXML
    private Text dodge_txt;

    @FXML
    private Button dodge_up;

    @FXML
    private Text dudction_txt;

    @FXML
    private Button durab_down;

    @FXML
    private Text durab_txt;

    @FXML
    private Button durab_up;

    @FXML
    private Button dwarves_down;

    @FXML
    private Label dwarves_txt;

    @FXML
    private Button dwarves_up;

    @FXML
    private Button education_down;

    @FXML
    private Text education_txt;

    @FXML
    private Button education_up;

    @FXML
    private Button elvish_down;

    @FXML
    private Text elvish_txt;

    @FXML
    private Button elvish_up;

    @FXML
    private Text etiquette_txt;

    @FXML
    private Button etiquette_up;

    @FXML
    private Button etiquette_up1;

    @FXML
    private Button ettiquete_down;

    @FXML
    private Button firstAid_down;

    @FXML
    private Text firstAid_txt;

    @FXML
    private Button firstAid_up;

    @FXML
    private Button forgery_down;

    @FXML
    private Text forgery_txt;

    @FXML
    private Button forgery_up;

    @FXML
    private Text gambl_txt;

    @FXML
    private Button gambling_down;

    @FXML
    private Button gambling_up;

    @FXML
    private Button horseBackRiding_down;

    @FXML
    private Text horseBackRiding_txt;

    @FXML
    private Button horseBackRiding_up;

    @FXML
    private Label human_txt;

    @FXML
    private Button humen_down;

    @FXML
    private Button humen_up;

    @FXML
    private Button intimidation_down;

    @FXML
    private Text intimidation_txt;

    @FXML
    private Button intimidation_up;

    @FXML
    private Button leaderShip_down;

    @FXML
    private Button leaderShip_up;

    @FXML
    private Text leadership_txt;

    @FXML
    private Button lightBlades_down;

    @FXML
    private Text lightBlades_txt;

    @FXML
    private Button lightBlades_up;

    @FXML
    private Button lockpicking_down;

    @FXML
    private Text lockpicking_txt;

    @FXML
    private Button lockpicking_up;

    @FXML
    private Text luck_txt13;

    @FXML
    private Text luck_txt14;

    @FXML
    private Button magicResist_down;

    @FXML
    private Text magicResist_txt;

    @FXML
    private Button magicResist_up;

    @FXML
    private Button making__up;

    @FXML
    private Button making_down;

    @FXML
    private Text making_txt;

    @FXML
    private Button melee_down;

    @FXML
    private Text melee_txt;

    @FXML
    private Button melee_up;

    @FXML
    private Button monstrology__up;

    @FXML
    private Button monstrology_down;

    @FXML
    private Text monstrology_txt;

    @FXML
    private Button navigation_down;

    @FXML
    private Text navigation_txt;

    @FXML
    private Button navigation_up;

    @FXML
    private Button orientation_down;

    @FXML
    private Button orientation_up;

    @FXML
    private Text orinetation_txt;

    @FXML
    private Text perfomance_txt;

    @FXML
    private Button performance_down;

    @FXML
    private Button performance_up;

    @FXML
    private Button polearm__up;

    @FXML
    private Button polearm_down;

    @FXML
    private Text polearm_txt;

    @FXML
    private Button prestidigitation_down;

    @FXML
    private Text prestidigitation_txt;

    @FXML
    private Button prestidigitation_up;

    @FXML
    private Button rituals_down;

    @FXML
    private Text rituals_txt;

    @FXML
    private Button rituals_up;

    @FXML
    private Button save_button;

    @FXML
    private Button seduction_down;

    @FXML
    private Text seduction_txt;

    @FXML
    private Button seduction_up;

    @FXML
    private Button srv_down;

    @FXML
    private Button stealth_down;

    @FXML
    private Text stealth_txt;

    @FXML
    private Button stealth_up;

    @FXML
    private Button strenght_down;

    @FXML
    private Text strenght_txt;

    @FXML
    private Button strenght_up1;

    @FXML
    private Button struggle_down;

    @FXML
    private Text struggle_txt;

    @FXML
    private Button struggle_up;

    @FXML
    private Button stubbornness_up;

    @FXML
    private Button stubbornness_down;

    @FXML
    private Text stubbornness_txt;

    @FXML
    private Button surv_up;

    @FXML
    private Button appearance_up;

    @FXML
    private Text survival_txt;

    @FXML
    private Button swordsmanship_down;

    @FXML
    private Text swordsmanship_txt;

    @FXML
    private Button swordsmanship_up;

    @FXML
    private Button tactics_down;

    @FXML
    private Text tactics_txt;

    @FXML
    private Button tactics_up;

    @FXML
    private Button trade_down;

    @FXML
    private Text trade_txt;

    @FXML
    private Button trade_up;

    @FXML
    private Button tramKnowledge_down;

    @FXML
    private Text tramKnowledge_txt;

    @FXML
    private Button tramKnowledge_up;

    @FXML
    private Text understand_txt;

    @FXML
    private Button understand_down;
    @FXML
    private Button understand_up;
    @FXML
    private Button kt;

    @FXML
    private Text kt_txt;

    @FXML
    private Button kt_up;

    Humanoids h;
    private int points;
    @FXML
    private Text points4;
    @FXML
    private Text skillleft;

    private int maxPoints;
    int attention = 0;
    int survival = 0;
    int deduction = 0;
    int monstrology = 0;
    int orientation = 0;
    int education = 0;
    int knowlegeTransfer = 0;

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






    public CreateController4(Humanoids h) {
        this.h = h;
    }



    public void initialize() {

        points = h.refl + h.intel;
        maxPoints = points;
        setButtons();
        skillleft.setText(String.valueOf(points));
        if (h instanceof Witcher_character) {
            att_down.setVisible(false);
            att_up.setVisible(false);
            deduction_down.setVisible(false);
            deduction_up.setVisible(false);
            castingSpells_down.setVisible(false);
            castingSpells_up.setVisible(false);
            alchemy_down.setVisible(false);
            alchemy_up.setVisible(false);
            dodge_down.setVisible(false);
            dodge_up.setVisible(false);
            surv_up.setVisible(false);
            srv_down.setVisible(false);
            swordsmanship_down.setVisible(false);
            swordsmanship_up.setVisible(false);
            athletics_down.setVisible(false);
            athletics_up.setVisible(false);
            stealth_down.setVisible(false);
            stealth_up.setVisible(false);
            horseBackRiding_down.setVisible(false);
            horseBackRiding_up.setVisible(false);
        }




            }

            private void setButtons() {
                att_down.setOnAction(event -> {

                    if (attention >= 1 && points < 33) {
                        decreaseSkills(attention, false);
                        skillleft.setText(String.valueOf(points));
                        attention--;
                        att_txt.setText(String.valueOf(attention));
                    }
                });

                att_up.setOnAction(event -> {
                    if (attention < 6 && points > attention - 1) {
                        increaseSkills(attention, false);
                        skillleft.setText(String.valueOf(points));
                        attention++;
                        att_txt.setText(String.valueOf(attention));
                    }
                });
                srv_down.setOnAction(event -> {

                    if (survival >= 1 && points < 33) {
                        decreaseSkills(survival, false);
                        skillleft.setText(String.valueOf(points));
                        survival--;
                        survival_txt.setText(String.valueOf(survival));
                    }
                });

                surv_up.setOnAction(event -> {
                    if (survival < 6 && points > survival - 1) {
                        increaseSkills(survival, false);
                        skillleft.setText(String.valueOf(points));
                        survival++;
                        survival_txt.setText(String.valueOf(survival));
                    }
                });
                deduction_down.setOnAction(event -> {

                    if (deduction >= 1 && points < 33) {
                        decreaseSkills(deduction, false);
                        skillleft.setText(String.valueOf(points));
                        deduction--;
                        dudction_txt.setText(String.valueOf(deduction));
                    }
                });

                deduction_up.setOnAction(event -> {
                    if (deduction < 6 && points > deduction - 1) {
                        increaseSkills(deduction, false);
                        skillleft.setText(String.valueOf(points));
                        deduction++;
                        dudction_txt.setText(String.valueOf(deduction));
                    }
                });
                monstrology_down.setOnAction(event -> {

                        if (monstrology >= 1 && points < 33) {
                            decreaseSkills(monstrology, true);
                            skillleft.setText(String.valueOf(points));
                            monstrology--;
                            monstrology_txt.setText(String.valueOf(monstrology));
                        }
                    });

                monstrology__up.setOnAction(event -> {
                    if (monstrology < 6 && points > monstrology - 1) {
                        increaseSkills(monstrology, true);
                        skillleft.setText(String.valueOf(points));
                        monstrology++;
                        monstrology_txt.setText(String.valueOf(monstrology));
                    }
                });
                education_down.setOnAction(event -> {

                    if (education >= 1 && points < 33) {
                        decreaseSkills(education, false);
                        skillleft.setText(String.valueOf(points));
                        education--;
                        education_txt.setText(String.valueOf(education));
                    }
                });

                education_up.setOnAction(event -> {
                    if (education < 6 && points > education - 1) {
                        increaseSkills(education, false);
                        skillleft.setText(String.valueOf(points));
                        education++;
                        education_txt.setText(String.valueOf(education));
                    }
                });
                orientation_down.setOnAction(event -> {
                    if (orientation >= 1 && points < 33) {
                        decreaseSkills(orientation, false);
                        skillleft.setText(String.valueOf(points));
                        orientation--;
                        orinetation_txt.setText(String.valueOf(orientation));
                    }
                });

                orientation_up.setOnAction(event -> {
                    if (orientation < 6 && points > orientation - 1) {
                        increaseSkills(orientation, false);
                        skillleft.setText(String.valueOf(points));
                        orientation++;
                        orinetation_txt.setText(String.valueOf(orientation));
                    }
                });
                kt.setOnAction(event -> {

                    if (knowlegeTransfer >= 1 && points < 33) {
                        decreaseSkills(knowlegeTransfer, false);
                        skillleft.setText(String.valueOf(points));
                        knowlegeTransfer--;
                        kt_txt.setText(String.valueOf(knowlegeTransfer));
                    }
                });

                kt_up.setOnAction(event -> {
                    if (knowlegeTransfer < 6 && points > knowlegeTransfer - 1) {
                        increaseSkills(knowlegeTransfer, false);
                        skillleft.setText(String.valueOf(points));
                        knowlegeTransfer++;
                        kt_txt.setText(String.valueOf(knowlegeTransfer));
                    }
                });
                tactics_down.setOnAction(event -> {

                    if (tactics >= 1 && points < 33) {
                        decreaseSkills(tactics, true);
                        skillleft.setText(String.valueOf(points));
                        tactics--;
                        tactics_txt.setText(String.valueOf(tactics));
                    }
                });

                tactics_up.setOnAction(event -> {
                    if (tactics < 6 && points > tactics - 1) {
                        increaseSkills(tactics, true);
                        skillleft.setText(String.valueOf(points));
                        tactics++;
                        tactics_txt.setText(String.valueOf(tactics));
                    }
                });
                trade_down.setOnAction(event -> {

                    if (trade >= 1 && points < 33) {
                        decreaseSkills(trade, false);
                        skillleft.setText(String.valueOf(points));
                        trade--;
                        trade_txt.setText(String.valueOf(trade));
                    }
                });

                trade_up.setOnAction(event -> {
                    if (trade < 6 && points > trade - 1) {
                        increaseSkills(trade, false);
                        skillleft.setText(String.valueOf(points));
                        trade++;
                        trade_txt.setText(String.valueOf(trade));
                    }
                });
                ettiquete_down.setOnAction(event -> {

                    if (etiquette >= 1 && points < 33) {
                        decreaseSkills(etiquette, false);
                        skillleft.setText(String.valueOf(points));
                        etiquette--;
                        etiquette_txt.setText(String.valueOf(etiquette));
                    }
                });

                etiquette_up.setOnAction(event -> {
                    if (etiquette < 6 && points > attention - 1) {
                        increaseSkills(etiquette, false);
                        skillleft.setText(String.valueOf(points));
                        etiquette++;
                        etiquette_txt.setText(String.valueOf(etiquette));
                    }
                });
                elvish_down.setOnAction(event -> {

                    if (laguage_elfs >= 1 && points < 33) {
                        decreaseSkills(laguage_elfs, true);
                        skillleft.setText(String.valueOf(points));
                        laguage_elfs--;
                        elvish_txt.setText(String.valueOf(laguage_elfs));
                    }
                });

                elvish_up.setOnAction(event -> {
                    if (laguage_elfs < 6 && points > laguage_elfs - 1) {
                        increaseSkills(laguage_elfs, true);
                        skillleft.setText(String.valueOf(points));
                        laguage_elfs++;
                        elvish_txt.setText(String.valueOf(laguage_elfs));
                    }
                });
                dwarves_down.setOnAction(event -> {

                    if (language_dwarfs >= 1 && points < 33) {
                        decreaseSkills(language_dwarfs, true);
                        skillleft.setText(String.valueOf(points));
                        language_dwarfs--;
                        luck_txt13.setText(String.valueOf(language_dwarfs));
                    }
                });

                dwarves_up.setOnAction(event -> {
                    if (language_dwarfs < 6 && points > language_dwarfs - 1) {
                        increaseSkills(language_dwarfs, true);
                        skillleft.setText(String.valueOf(points));
                        language_dwarfs++;
                        luck_txt13.setText(String.valueOf(language_dwarfs));
                    }
                });
                humen_down.setOnAction(event -> {

                    if (language_humen >= 1 && points < 33) {
                        decreaseSkills(language_humen, true);
                        skillleft.setText(String.valueOf(points));
                        language_humen--;
                        human_txt.setText(String.valueOf(language_humen));
                    }
                });

                humen_up.setOnAction(event -> {
                    if (language_humen < 6 && points > language_humen - 1) {
                        increaseSkills(language_dwarfs, true);
                        skillleft.setText(String.valueOf(points));
                        language_dwarfs++;
                        human_txt.setText(String.valueOf(language_humen));
                    }
                });

                strenght_down.setOnAction(event -> {
                    if (strength >= 1 && points < 33) {
                        decreaseSkills(strength, false);
                        skillleft.setText(String.valueOf(points));
                        strength--;
                        strenght_txt.setText(String.valueOf(strength));
                    }
                });

                strenght_up1.setOnAction(event -> {
                    if (strength < 6 && points > strength - 1) {
                        increaseSkills(strength, false);
                        skillleft.setText(String.valueOf(points));
                        strength++;
                        strenght_txt.setText(String.valueOf(strength));
                    }
                });

// Код для ключевого слова "durability"
                durab_down.setOnAction(event -> {
                    if (durability >= 1 && points < 33) {
                        decreaseSkills(durability, false);
                        skillleft.setText(String.valueOf(points));
                        durability--;
                        durab_txt.setText(String.valueOf(durability));
                    }
                });

                durab_up.setOnAction(event -> {
                    if (durability < 6 && points > durability - 1) {
                        increaseSkills(durability, false);
                        skillleft.setText(String.valueOf(points));
                        durability++;
                        durab_txt.setText(String.valueOf(durability));
                    }
                });
                gambling_down.setOnAction(event -> {
                    if (gambling >= 1 && points < 33) {
                        decreaseSkills(gambling, false);
                        skillleft.setText(String.valueOf(points));
                        gambling--;
                        gambl_txt.setText(String.valueOf(gambling));
                    }
                });

                gambling_up.setOnAction(event -> {
                    if (gambling < 6 && points > gambling - 1) {
                        increaseSkills(gambling, false);
                        skillleft.setText(String.valueOf(points));
                        gambling++;
                        gambl_txt.setText(String.valueOf(gambling));
                    }
                });

// Код для ключевого слова "appearance"
                appearance_down.setOnAction(event -> {
                    if (appearance >= 1 && points < 33) {
                        decreaseSkills(appearance, false);
                        skillleft.setText(String.valueOf(points));
                        appearance--;
                        appearance_txt.setText(String.valueOf(appearance));
                    }
                });

                appearance_up.setOnAction(event -> {
                    if (appearance < 6 && points > appearance - 1) {
                        increaseSkills(appearance, false);
                        skillleft.setText(String.valueOf(points));
                        appearance++;
                        appearance_txt.setText(String.valueOf(appearance));
                    }
                });

// Код для ключевого слова "performance"
                performance_down.setOnAction(event -> {
                    if (performance >= 1 && points < 33) {
                        decreaseSkills(performance, false);
                        skillleft.setText(String.valueOf(points));
                        performance--;
                        perfomance_txt.setText(String.valueOf(performance));
                    }
                });

                performance_up.setOnAction(event -> {
                    if (performance < 6 && points > performance - 1) {
                        increaseSkills(performance, false);
                        skillleft.setText(String.valueOf(points));
                        performance++;
                        perfomance_txt.setText(String.valueOf(performance));
                    }
                });

// Код для ключевого слова "art"
                art_down.setOnAction(event -> {
                    if (art >= 1 && points < 33) {
                        decreaseSkills(art, false);
                        skillleft.setText(String.valueOf(points));
                        art--;
                        art_txt.setText(String.valueOf(art));
                    }
                });

                art__up.setOnAction(event -> {
                    if (art < 6 && points > art - 1) {
                        increaseSkills(art, false);
                        skillleft.setText(String.valueOf(points));
                        art++;
                        art_txt.setText(String.valueOf(art));
                    }
                });

// Код для ключевого слова "leaderShip"
                leaderShip_down.setOnAction(event -> {
                    if (leaderShip >= 1 && points < 33) {
                        decreaseSkills(leaderShip, false);
                        skillleft.setText(String.valueOf(points));
                        leaderShip--;
                        leadership_txt.setText(String.valueOf(leaderShip));
                    }
                });

                leaderShip_up.setOnAction(event -> {
                    if (leaderShip < 6 && points > leaderShip - 1) {
                        increaseSkills(leaderShip, false);
                        skillleft.setText(String.valueOf(points));
                        leaderShip++;
                        leadership_txt.setText(String.valueOf(leaderShip));
                    }
                });
                deception_down.setOnAction(event -> {
                    if (deception >= 1 && points < 33) {
                        decreaseSkills(deception, false);
                        skillleft.setText(String.valueOf(points));
                        deception--;
                        deception_txt.setText(String.valueOf(deception));
                    }
                });

                deception_up.setOnAction(event -> {
                    if (deception < 6 && points > deception - 1) {
                        increaseSkills(deception, false);
                        skillleft.setText(String.valueOf(points));
                        deception++;
                        deception_txt.setText(String.valueOf(deception));
                    }
                });

// Код для ключевого слова "understandingPeople"
                understand_down.setOnAction(event -> {
                    if (understandingPeople >= 1 && points < 33) {
                        decreaseSkills(understandingPeople, false);
                        skillleft.setText(String.valueOf(points));
                        understandingPeople--;
                        understand_txt.setText(String.valueOf(understandingPeople));
                    }
                });

                understand_up.setOnAction(event -> {
                    if (understandingPeople < 6 && points > understandingPeople - 1) {
                        increaseSkills(understandingPeople, false);
                        skillleft.setText(String.valueOf(points));
                        understandingPeople++;
                        understand_txt.setText(String.valueOf(understandingPeople));
                    }
                });

// Код для ключевого слова "seduction"
                seduction_down.setOnAction(event -> {
                    if (seduction >= 1 && points < 33) {
                        decreaseSkills(seduction, false);
                        skillleft.setText(String.valueOf(points));
                        seduction--;
                        seduction_txt.setText(String.valueOf(seduction));
                    }
                });

                seduction_up.setOnAction(event -> {
                    if (seduction < 6 && points > seduction - 1) {
                        increaseSkills(seduction, false);
                        skillleft.setText(String.valueOf(points));
                        seduction++;
                        seduction_txt.setText(String.valueOf(seduction));
                    }
                });

// Код для ключевого слова "belief"
                belief_down.setOnAction(event -> {
                    if (belief >= 1 && points < 33) {
                        decreaseSkills(belief, false);
                        skillleft.setText(String.valueOf(points));
                        belief--;
                        belief_txt1.setText(String.valueOf(belief));
                    }
                });

                belief_up.setOnAction(event -> {
                    if (belief < 6 && points > belief - 1) {
                        increaseSkills(belief, false);
                        skillleft.setText(String.valueOf(points));
                        belief++;
                        belief_txt1.setText(String.valueOf(belief));
                    }
                });

// Код для ключевого слова "charisma"
                charisma_down.setOnAction(event -> {
                    if (charisma >= 1 && points < 33) {
                        decreaseSkills(charisma, false);
                        skillleft.setText(String.valueOf(points));
                        charisma--;
                        charisma_txt.setText(String.valueOf(charisma));
                    }
                });

                etiquette_up1.setOnAction(event -> {
                    if (charisma < 6 && points > charisma - 1) {
                        increaseSkills(charisma, false);
                        skillleft.setText(String.valueOf(points));
                        charisma++;
                        charisma_txt.setText(String.valueOf(charisma));
                    }
                });
                melee_down.setOnAction(event -> {
                    if (melee >= 1 && points < 33) {
                        decreaseSkills(melee, false);
                        skillleft.setText(String.valueOf(points));
                        melee--;
                        melee_txt.setText(String.valueOf(melee));
                    }
                });

                melee_up.setOnAction(event -> {
                    if (melee < 6 && points > melee - 1) {
                        increaseSkills(melee, false);
                        skillleft.setText(String.valueOf(points));
                        melee++;
                        melee_txt.setText(String.valueOf(melee));
                    }
                });

// Код для ключевого слова "struggle"
                struggle_down.setOnAction(event -> {
                    if (struggle >= 1 && points < 33) {
                        decreaseSkills(struggle, false);
                        skillleft.setText(String.valueOf(points));
                        struggle--;
                        struggle_txt.setText(String.valueOf(struggle));
                    }
                });

                struggle_up.setOnAction(event -> {
                    if (struggle < 6 && points > struggle - 1) {
                        increaseSkills(struggle, false);
                        skillleft.setText(String.valueOf(points));
                        struggle++;
                        struggle_txt.setText(String.valueOf(struggle));
                    }
                });

// Код для ключевого слова "horseBackRiding"
                horseBackRiding_down.setOnAction(event -> {
                    if (horseBackRiding >= 1 && points < 33) {
                        decreaseSkills(horseBackRiding, false);
                        skillleft.setText(String.valueOf(points));
                        horseBackRiding--;
                        horseBackRiding_txt.setText(String.valueOf(horseBackRiding));
                    }
                });

                horseBackRiding_up.setOnAction(event -> {
                    if (horseBackRiding < 6 && points > horseBackRiding - 1) {
                        increaseSkills(horseBackRiding, false);
                        skillleft.setText(String.valueOf(points));
                        horseBackRiding++;
                        horseBackRiding_txt.setText(String.valueOf(horseBackRiding));
                    }
                });
                // Код для ключевого слова "polearm"
                polearm_down.setOnAction(event -> {
                    if (polearm >= 1 && points < 33) {
                        decreaseSkills(polearm, false);
                        skillleft.setText(String.valueOf(points));
                        polearm--;
                        polearm_txt.setText(String.valueOf(polearm));
                    }
                });

                polearm__up.setOnAction(event -> {
                    if (polearm < 6 && points > polearm - 1) {
                        increaseSkills(polearm, false);
                        skillleft.setText(String.valueOf(points));
                        polearm++;
                        polearm_txt.setText(String.valueOf(polearm));
                    }
                });

// Код для ключевого слова "lightBlades"
                lightBlades_down.setOnAction(event -> {
                    if (lightBlades >= 1 && points < 33) {
                        decreaseSkills(lightBlades, false);
                        skillleft.setText(String.valueOf(points));
                        lightBlades--;
                        lightBlades_txt.setText(String.valueOf(lightBlades));
                    }
                });

                lightBlades_up.setOnAction(event -> {
                    if (lightBlades < 6 && points > lightBlades - 1) {
                        increaseSkills(lightBlades, false);
                        skillleft.setText(String.valueOf(points));
                        lightBlades++;
                        lightBlades_txt.setText(String.valueOf(lightBlades));
                    }
                });

// Код для ключевого слова "swordsmanship"
                swordsmanship_down.setOnAction(event -> {
                    if (swordsmanship >= 1 && points < 33) {
                        decreaseSkills(swordsmanship, false);
                        skillleft.setText(String.valueOf(points));
                        swordsmanship--;
                        swordsmanship_txt.setText(String.valueOf(swordsmanship));
                    }
                });

                swordsmanship_up.setOnAction(event -> {
                    if (swordsmanship < 6 && points > swordsmanship - 1) {
                        increaseSkills(swordsmanship, false);
                        skillleft.setText(String.valueOf(points));
                        swordsmanship++;
                        swordsmanship_txt.setText(String.valueOf(swordsmanship));
                    }
                });
                // Код для ключевого слова "navigation"
                navigation_down.setOnAction(event -> {
                    if (navigation >= 1 && points < 33) {
                        decreaseSkills(navigation, false);
                        skillleft.setText(String.valueOf(points));
                        navigation--;
                        navigation_txt.setText(String.valueOf(navigation));
                    }
                });

                navigation_up.setOnAction(event -> {
                    if (navigation < 6 && points > navigation - 1) {
                        increaseSkills(navigation, false);
                        skillleft.setText(String.valueOf(points));
                        navigation++;
                        navigation_txt.setText(String.valueOf(navigation));
                    }
                });

// Код для ключевого слова "dodge"
                dodge_down.setOnAction(event -> {
                    if (dodge >= 1 && points < 33) {
                        decreaseSkills(dodge, false);
                        skillleft.setText(String.valueOf(points));
                        dodge--;
                        dodge_txt.setText(String.valueOf(dodge));
                    }
                });

                dodge_up.setOnAction(event -> {
                    if (dodge < 6 && points > dodge - 1) {
                        increaseSkills(dodge, false);
                        skillleft.setText(String.valueOf(points));
                        dodge++;
                        dodge_txt.setText(String.valueOf(dodge));
                    }
                });
                // Код для ключевого слова "athletics"
                athletics_down.setOnAction(event -> {
                    if (athletics >= 1 && points < 33) {
                        decreaseSkills(athletics, false);
                        skillleft.setText(String.valueOf(points));
                        athletics--;
                        athletics_txt.setText(String.valueOf(athletics));
                    }
                });

                athletics_up.setOnAction(event -> {
                    if (athletics < 6 && points > athletics - 1) {
                        increaseSkills(athletics, false);
                        skillleft.setText(String.valueOf(points));
                        athletics++;
                        athletics_txt.setText(String.valueOf(athletics));
                    }
                });

// Код для ключевого слова "prestidigitation"
                prestidigitation_down.setOnAction(event -> {
                    if (prestidigitation >= 1 && points < 33) {
                        decreaseSkills(prestidigitation, false);
                        skillleft.setText(String.valueOf(points));
                        prestidigitation--;
                        prestidigitation_txt.setText(String.valueOf(prestidigitation));
                    }
                });

                prestidigitation_up.setOnAction(event -> {
                    if (prestidigitation < 6 && points > prestidigitation - 1) {
                        increaseSkills(prestidigitation, false);
                        skillleft.setText(String.valueOf(points));
                        prestidigitation++;
                        prestidigitation_txt.setText(String.valueOf(prestidigitation));
                    }
                });

// Код для ключевого слова "stealth"
                stealth_down.setOnAction(event -> {
                    if (stealth >= 1 && points < 33) {
                        decreaseSkills(stealth, false);
                        skillleft.setText(String.valueOf(points));
                        stealth--;
                        stealth_txt.setText(String.valueOf(stealth));
                    }
                });

                stealth_up.setOnAction(event -> {
                    if (stealth < 6 && points > stealth - 1) {
                        increaseSkills(stealth, false);
                        skillleft.setText(String.valueOf(points));
                        stealth++;
                        stealth_txt.setText(String.valueOf(stealth));
                    }
                });
                // Код для ключевого слова "crossbow"
                crossbow_down.setOnAction(event -> {
                    if (crossbow >= 1 && points < 33) {
                        decreaseSkills(crossbow, false);
                        skillleft.setText(String.valueOf(points));
                        crossbow--;
                        crossbow_txt.setText(String.valueOf(crossbow));
                    }
                });

                crossbow__up.setOnAction(event -> {
                    if (crossbow < 6 && points > crossbow - 1) {
                        increaseSkills(crossbow, false);
                        skillleft.setText(String.valueOf(points));
                        crossbow++;
                        crossbow_txt.setText(String.valueOf(crossbow));
                    }
                });

// Код для ключевого слова "bow"
                bow_down.setOnAction(event -> {
                    if (bow >= 1 && points < 33) {
                        decreaseSkills(bow, false);
                        skillleft.setText(String.valueOf(points));
                        bow--;
                        bow_txt.setText(String.valueOf(bow));
                    }
                });

                bow_up.setOnAction(event -> {
                    if (bow < 6 && points > bow - 1) {
                        increaseSkills(bow, false);
                        skillleft.setText(String.valueOf(points));
                        bow++;
                        bow_txt.setText(String.valueOf(bow));
                    }
                });
                // Код для ключевого слова "alchemy"
                alchemy_down.setOnAction(event -> {
                    if (alchemy >= 1 && points < 33) {
                        decreaseSkills(alchemy, true);
                        skillleft.setText(String.valueOf(points));
                        alchemy--;
                        alchemy_txt.setText(String.valueOf(alchemy));
                    }
                });

                alchemy_up.setOnAction(event -> {
                    if (alchemy < 6 && points > alchemy - 1) {
                        increaseSkills(alchemy, true);
                        skillleft.setText(String.valueOf(points));
                        alchemy++;
                        alchemy_txt.setText(String.valueOf(alchemy));
                    }
                });

// Код для ключевого слова "lockpicking"
                lockpicking_down.setOnAction(event -> {
                    if (lockpicking >= 1 && points < 33) {
                        decreaseSkills(lockpicking, false);
                        skillleft.setText(String.valueOf(points));
                        lockpicking--;
                        lockpicking_txt.setText(String.valueOf(lockpicking));
                    }
                });

                lockpicking_up.setOnAction(event -> {
                    if (lockpicking < 6 && points > lockpicking - 1) {
                        increaseSkills(lockpicking, false);
                        skillleft.setText(String.valueOf(points));
                        lockpicking++;
                        lockpicking_txt.setText(String.valueOf(lockpicking));
                    }
                });

// Код для ключевого слова "tramKnowledge"
                tramKnowledge_down.setOnAction(event -> {
                    if (tramKnowledge >= 1 && points < 33) {
                        decreaseSkills(tramKnowledge, true);
                        skillleft.setText(String.valueOf(points));
                        tramKnowledge--;
                        tramKnowledge_txt.setText(String.valueOf(tramKnowledge));
                    }
                });

                tramKnowledge_up.setOnAction(event -> {
                    if (tramKnowledge < 6 && points > tramKnowledge - 1) {
                        increaseSkills(tramKnowledge, true);
                        skillleft.setText(String.valueOf(points));
                        tramKnowledge++;
                        tramKnowledge_txt.setText(String.valueOf(tramKnowledge));
                    }
                });
                // Код для ключевого слова "making"
                making_down.setOnAction(event -> {
                    if (making >= 1 && points < 33) {
                        decreaseSkills(making, true);
                        skillleft.setText(String.valueOf(points));
                        making--;
                        making_txt.setText(String.valueOf(making));
                    }
                });

                making__up.setOnAction(event -> {
                    if (making < 6 && points > making - 1) {
                        increaseSkills(making, true);
                        skillleft.setText(String.valueOf(points));
                        making++;
                        making_txt.setText(String.valueOf(making));
                    }
                });

// Код для ключевого слова "disguise"
                disguise_down.setOnAction(event -> {
                    if (disguise >= 1 && points < 33) {
                        decreaseSkills(disguise, false);
                        skillleft.setText(String.valueOf(points));
                        disguise--;
                        disguise_txt.setText(String.valueOf(disguise));
                    }
                });

                disguise_up.setOnAction(event -> {
                    if (disguise < 6 && points > disguise - 1) {
                        increaseSkills(disguise, false);
                        skillleft.setText(String.valueOf(points));
                        disguise++;
                        disguise_txt.setText(String.valueOf(disguise));
                    }
                });

// Код для ключевого слова "firstAid"
                firstAid_down.setOnAction(event -> {
                    if (firstAid >= 1 && points < 33) {
                        decreaseSkills(firstAid, false);
                        skillleft.setText(String.valueOf(points));
                        firstAid--;
                        firstAid_txt.setText(String.valueOf(firstAid));
                    }
                });

                firstAid_up.setOnAction(event -> {
                    if (firstAid < 6 && points > firstAid - 1) {
                        increaseSkills(firstAid, false);
                        skillleft.setText(String.valueOf(points));
                        firstAid++;
                        firstAid_txt.setText(String.valueOf(firstAid));
                    }
                });
                forgery_down.setOnAction(event -> {
                    if (forgery >= 1 && points < 33) {
                        decreaseSkills(forgery, false);
                        skillleft.setText(String.valueOf(points));
                        forgery--;
                        forgery_txt.setText(String.valueOf(forgery));
                    }
                });

                forgery_up.setOnAction(event -> {
                    if (forgery < 6 && points > forgery - 1) {
                        increaseSkills(forgery, false);
                        skillleft.setText(String.valueOf(points));
                        forgery++;
                        forgery_txt.setText(String.valueOf(forgery));
                    }
                });
                // Код для ключевого слова "intimidation"
                intimidation_down.setOnAction(event -> {
                    if (intimidation >= 1 && points < 33) {
                        decreaseSkills(intimidation, false);
                        skillleft.setText(String.valueOf(points));
                        intimidation--;
                        intimidation_txt.setText(String.valueOf(intimidation));
                    }
                });

                intimidation_up.setOnAction(event -> {
                    if (intimidation < 6 && points > intimidation - 1) {
                        increaseSkills(intimidation, false);
                        skillleft.setText(String.valueOf(points));
                        intimidation++;
                        intimidation_txt.setText(String.valueOf(intimidation));
                    }
                });

// Код для ключевого слова "corruption"
                corruption_down.setOnAction(event -> {
                    if (corruption >= 1 && points < 33) {
                        decreaseSkills(corruption, true);
                        skillleft.setText(String.valueOf(points));
                        corruption--;
                        corruption_txt.setText(String.valueOf(corruption));
                    }
                });

                corruption_up.setOnAction(event -> {
                    if (corruption < 6 && points > corruption - 1) {
                        increaseSkills(corruption, true);
                        skillleft.setText(String.valueOf(points));
                        corruption++;
                        corruption_txt.setText(String.valueOf(corruption));
                    }
                });

// Код для ключевого слова "rituals"
                rituals_down.setOnAction(event -> {
                    if (rituals >= 1 && points < 33) {
                        decreaseSkills(rituals, true);
                        skillleft.setText(String.valueOf(points));
                        rituals--;
                        rituals_txt.setText(String.valueOf(rituals));
                    }
                });

                rituals_up.setOnAction(event -> {
                    if (rituals < 6 && points > rituals - 1) {
                        increaseSkills(rituals, true);
                        skillleft.setText(String.valueOf(points));
                        rituals++;
                        rituals_txt.setText(String.valueOf(rituals));
                    }
                });
// Код для ключевого слова "stubbornness"
                stubbornness_down.setOnAction(event -> {
                    if (stubbornness >= 1 && points < 33) {
                        decreaseSkills(stubbornness, false);
                        skillleft.setText(String.valueOf(points));
                        stubbornness--;
                        stubbornness_txt.setText(String.valueOf(stubbornness));
                    }
                });

                stubbornness_up.setOnAction(event -> {
                    if (stubbornness < 6 && points > stubbornness - 1) {
                        increaseSkills(stubbornness, false);
                        skillleft.setText(String.valueOf(points));
                        stubbornness++;
                        stubbornness_txt.setText(String.valueOf(stubbornness));
                    }
                });

// Код для ключевого слова "magicResist"
                magicResist_down.setOnAction(event -> {
                    if (magicResist >= 1 && points < 33) {
                        decreaseSkills(magicResist, true);
                        skillleft.setText(String.valueOf(points));
                        magicResist--;
                        magicResist_txt.setText(String.valueOf(magicResist));
                    }
                });

                magicResist_up.setOnAction(event -> {
                    if (magicResist < 6 && points > magicResist - 1) {
                        increaseSkills(magicResist, true);
                        skillleft.setText(String.valueOf(points));
                        magicResist++;
                        magicResist_txt.setText(String.valueOf(magicResist));
                    }
                });

// Код для ключевого слова "castingSpells"
                castingSpells_down.setOnAction(event -> {
                    if (castingSpells >= 1 && points < 33) {
                        decreaseSkills(castingSpells, true);
                        skillleft.setText(String.valueOf(points));
                        castingSpells--;
                        castingSpells_txt.setText(String.valueOf(castingSpells));
                    }
                });

                castingSpells_up.setOnAction(event -> {
                    if (castingSpells < 6 && points > castingSpells - 1) {
                        increaseSkills(castingSpells, true);
                        skillleft.setText(String.valueOf(points));
                        castingSpells++;
                        castingSpells_txt.setText(String.valueOf(castingSpells));
                    }
                });
// Код для ключевого слова "bravery"
                bravery_down.setOnAction(event -> {
                    if (bravery >= 1 && points < 33) {
                        decreaseSkills(bravery, false);
                        skillleft.setText(String.valueOf(points));
                        bravery--;
                        bravery_txt.setText(String.valueOf(bravery));
                    }
                });

                bravery_up.setOnAction(event -> {
                    if (bravery < 6 && points > bravery - 1) {
                        increaseSkills(bravery, false);
                        skillleft.setText(String.valueOf(points));
                        bravery++;
                        bravery_txt.setText(String.valueOf(bravery));
                    }
                });
                save_button.setOnAction(event -> {
                    h.setWillSkills(intimidation,corruption,rituals,stubbornness,magicResist,castingSpells,bravery);
                    h.setCrtSkils(alchemy,lockpicking,tramKnowledge,making,disguise,firstAid,forgery);
                    h.setEmpSkills(gambling,appearance,performance,art,leaderShip,deception,understandingPeople,seduction,belief,charisma);
                    h.setAglSkills(athletics,prestidigitation,stealth,crossbow,bow);
                    h.setRflSkills(melee,struggle,horseBackRiding,polearm,lightBlades,swordsmanship,navigation,dodge);
                    h.setBtSkills(strength,durability);
                    h.setIntSkills(attention,survival,deduction,monstrology,orientation,education,tactics,trade,etiquette,language_humen,language_dwarfs,laguage_elfs);
//                    SaveCharacter saveCharacter = new SaveCharacter(h);
//                    Witcher_character c  = new Witcher_character(h);
//                    String name = new String(h.name + ".json");
//                    saveCharacter.save(h,name);
                    SaveCharacter s = new SaveCharacter();
                    s.save(h);
                    Load l = new Load();
                    Humanoids w = l.load();
                    System.out.println(w.will);


                });
                /*try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myObject.ser"))) {
                    oos.writeObject(h);
                    System.out.println("Object has been saved to myObject.ser");
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }

    private void increaseSkills(int skill,boolean hard) {
        if(!hard){
            if (skill == 0 && points >= 1) {
                points--;
            } else {
                int oldValue = skill;
                if (skill < 6) {
                    if (points - oldValue >= 0) {
                        points = points - oldValue;
                    }
                }
            }
        }else {
            if(skill == 0 && points >= 1 ){
                points = points-2;
            }else {
                int oldValue = skill;
                if (skill < 6) {
                    if (points - oldValue*2 >= 0) {
                        points = points - oldValue*2;
                    }
                }
            }
        }}

    private void decreaseSkills(int skill, boolean hard) {
        if(!hard){
            if (skill > 0 && points < maxPoints) {
                if (skill == 1) {
                    points++;
                } else {
                    int oldValue = skill - 1;
                    points = points + oldValue;
                }
            }
        }else {
            if (skill > 0 && points < maxPoints) {
                if (skill == 1) {
                    points = points + 2;
                } else {
                    int oldValue = skill - 1;
                    points = points + oldValue*2;
                }
            }
        }}

        }



