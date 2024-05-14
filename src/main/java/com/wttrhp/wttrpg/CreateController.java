package com.wttrhp.wttrpg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class CreateController {

    @FXML
    private Button agil_down;

    @FXML
    private Text agil_txt;

    @FXML
    private Button agil_up;

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
    private Button bt_up;

    @FXML
    private Button bt_down;

    @FXML
    private Text bt_txt;

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
    private Button craf_down;

    @FXML
    private Text craft_txt;

    @FXML
    private Button craft_up;

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
    private Button emp_down;

    @FXML
    private Text emp_txt;

    @FXML
    private Button emp_up;

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
    private Button int_down;

    @FXML
    private Text int_txt;

    @FXML
    private Button int_up;

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
    private Button luck_down;

    @FXML
    private Text luck_txt;

    @FXML
    private Text luck_txt13;

    @FXML
    private Text luck_txt14;

    @FXML
    private Button luck_up;

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
    private TextField name_field;

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
    private ComboBox<String> prof_selection;

    @FXML
    private ComboBox<String> race_selection;

    @FXML
    private Button refl_down;

    @FXML
    private Text refl_txt;

    @FXML
    private Button refl_up;

    @FXML
    private Button rituals_down;

    @FXML
    private Text rituals_txt;

    @FXML
    private Button rituals_up;

    @FXML
    private Button seduction_down;

    @FXML
    private Text seduction_txt;

    @FXML
    private Button seduction_up;

    @FXML
    private ComboBox<String> sex_selection;

    @FXML
    private Button speed_down;

    @FXML
    private Text speed_txt;

    @FXML
    private Button speed_up;

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
    private Button stubbornness__up;

    @FXML
    private Button stubbornness_down;

    @FXML
    private Text stubbornness_txt;

    @FXML
    private Button surv_up;

    @FXML
    private Button surv_up1;

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
    private Button understandingPeople_down;

    @FXML
    private Button will_down;

    @FXML
    private Text will_txt;

    @FXML
    private Button will_up;
    @FXML
    private Text points;
    @FXML
    private Label prof_skill1;

    @FXML
    private Label prof_skill10;

    @FXML
    private Label prof_skill11;

    @FXML
    private Label prof_skill2;

    @FXML
    private Label prof_skill3;

    @FXML
    private Label prof_skill4;

    @FXML
    private Label prof_skill5;

    @FXML
    private Label prof_skill6;

    @FXML
    private Label prof_skill7;

    @FXML
    private Label prof_skill8;

    @FXML
    private Label prof_skill9;
    @FXML
    private Text prof_txt1;
    @FXML
    private Text prof_txt2;

    @FXML
    private Text prof_txt3;
    @FXML
    private Text prof_txt4;
    @FXML
    private Text prof_txt5;
    @FXML
    private Text prof_txt6;
    @FXML
    private Text prof_txt7;
    @FXML
    private Text prof_txt8;

    @FXML
    private Text prof_txt9;
    @FXML
    private Text points1;

    @FXML
    private Text prof_txt10;

    @FXML
    private Text prof_txt11;
    @FXML
    private Button prof_up1;
    @FXML
    private Button prof_up2;
    @FXML
    private Button prof_up3;
    @FXML
    private Button prof_up4;
    @FXML
    private Button prof_up5;
    @FXML
    private Button prof_up6;
    @FXML
    private Button prof_up7;
    @FXML
    private Button prof_up8;
    @FXML
    private Button prof_up9;

    @FXML
    private Button prof_up10;

    @FXML
    private Button prof_up11;
    @FXML
    private Button prof_down10;

    @FXML
    private Button prof_down11;
    @FXML
    private Button prof_down9;
    @FXML
    private Button prof_down8;
    @FXML
    private Button prof_down7;
    @FXML
    private Button prof_down6;
    @FXML
    private Button prof_down5;
    @FXML
    private Button prof_down4;
    @FXML
    private Button prof_down3;
    @FXML
    private Button prof_down2;
    @FXML
    private Button prof_down1;
    @FXML
    private Button next_button;

    int points_value;
    int intel = 1;
    int refl = 1;
    int agil = 1;
    int bt = 1;
    int craft = 1;
    int emp = 1;
    int will = 1;
    int speed = 1;
    int luck = 1;
    int att = 1;
    int ded;
    int spell;
    int alch;
    int dodge;
    int sword;
    int atl;
    int stl;
    int hbr;
    int wt;
    int survival;
    int[] intArray;

    static int prof_skill_point_value;
    Witcher_character witcher;







    public void initialize() {
        points_value = 51;
        prof_skill_point_value = 33;
        points.setText(String.valueOf(points_value));


        String nameChar = name_field.getText();
        ObservableList<String> sexValues  = FXCollections.observableArrayList("Мужчина", "Женщина");
        sex_selection.setItems(sexValues);
        ObservableList<String> raceValues  = FXCollections.observableArrayList("Ведьмак", "Человек","Эльф","Краснолюд","Маг");
        race_selection.setItems(raceValues);
        ObservableList<String> profValues  = FXCollections.observableArrayList("Ведьмак", "Воин","Лекарь","Маг","Преступник","Жрец","Ремесленник","Торговец");
        prof_selection.setItems(profValues);




        prof_selection.setOnAction(e -> {
            if(prof_selection.getValue().equals("Ведьмак")) {
                witcher = new Witcher_character(nameChar,prof_selection.getValue(),sex_selection.getValue(),prof_selection.getValue());
                setWitcherlabels();
                setWitcherButtons();
                setNextButton();

            }
        });





        int_up.setOnAction(event -> {
            if(intel < 10 && points_value > 0){
            increaseParameter(intel,points_value);
            points.setText(String.valueOf(points_value));
            intel++;
            int_txt.setText(String.valueOf(intel));
                System.out.println(intel);}
        });
        int_down.setOnAction(event -> {
            if(intel >= 2){
            decreaseParameter(intel,points_value);
        points.setText(String.valueOf(points_value));
        intel--;
        int_txt.setText(String.valueOf(intel));
                System.out.println(intel);}

    });
        agil_up.setOnAction(event -> {
            if(agil < 10 && points_value > 0){
                increaseParameter(agil,points_value);
                points.setText(String.valueOf(points_value));
                agil++;
                agil_txt.setText(String.valueOf(agil));
                }
        });
        agil_down.setOnAction(event -> {
            if(agil >= 2){
                decreaseParameter(agil,points_value);
                points.setText(String.valueOf(points_value));
                agil--;
                agil_txt.setText(String.valueOf(agil));
                }

        });
        refl_up.setOnAction(event -> {
            if(refl < 10 && points_value > 0){
                increaseParameter(refl,points_value);
                points.setText(String.valueOf(points_value));
                refl++;
                refl_txt.setText(String.valueOf(refl));
            }
        });
        refl_down.setOnAction(event -> {
            if(refl >= 2){
                decreaseParameter(refl,points_value);
                points.setText(String.valueOf(points_value));
                refl--;
                refl_txt.setText(String.valueOf(refl));
            }

        });

        luck_up.setOnAction(event -> {
            if(luck < 10 && points_value > 0){
                increaseParameter(luck,points_value);
                points.setText(String.valueOf(points_value));
                luck++;
                luck_txt.setText(String.valueOf(luck));
            }
        });
        luck_down.setOnAction(event -> {
            if(luck >= 2 && points_value > 0){
                decreaseParameter(luck,points_value);
                points.setText(String.valueOf(points_value));
                luck--;
                luck_txt.setText(String.valueOf(luck));
            }

        });
        speed_up.setOnAction(event -> {
            if(speed < 10 && points_value > 0){
                increaseParameter(speed,points_value);
                points.setText(String.valueOf(points_value));
                speed++;
                speed_txt.setText(String.valueOf(speed));
            }
        });
        speed_down.setOnAction(event -> {
            if(speed >= 2){
                decreaseParameter(speed,points_value);
                points.setText(String.valueOf(points_value));
                speed--;
                speed_txt.setText(String.valueOf(speed));
            }

        });
        emp_up.setOnAction(event -> {
            if(emp < 10 && points_value > 0){
                increaseParameter(emp,points_value);
                points.setText(String.valueOf(points_value));
                emp++;
                emp_txt.setText(String.valueOf(emp));
            }
        });
        emp_down.setOnAction(event -> {
            if(emp >= 2){
                decreaseParameter(emp,points_value);
                points.setText(String.valueOf(points_value));
                emp--;
                emp_txt.setText(String.valueOf(emp));
            }

        });
        craft_up.setOnAction(event -> {
            if(craft < 10 && points_value > 0){
                increaseParameter(craft,points_value);
                points.setText(String.valueOf(points_value));
                craft++;
                craft_txt.setText(String.valueOf(craft));
            }
        });
        craf_down.setOnAction(event -> {
            if(craft >= 2){
                decreaseParameter(craft,points_value);
                points.setText(String.valueOf(points_value));
                craft--;
                craft_txt.setText(String.valueOf(craft));
            }
        });
        bt_up.setOnAction(event -> {
            if(bt < 10 && points_value > 0){
                increaseParameter(bt,points_value);
                points.setText(String.valueOf(points_value));
                bt++;
                bt_txt.setText(String.valueOf(bt));
            }
        });
        bt_down.setOnAction(event -> {
            if(bt >= 2){
                decreaseParameter(bt,points_value);
                points.setText(String.valueOf(points_value));
                bt--;
                bt_txt.setText(String.valueOf(bt));
            }
        });
        will_up.setOnAction(event -> {
            if(will < 10 && points_value > 0){
                increaseParameter(will,points_value);
                points.setText(String.valueOf(points_value));
                will++;
                will_txt.setText(String.valueOf(will));
            }
        });
        will_down.setOnAction(event -> {
            if(will >= 2){
                decreaseParameter(will,points_value);
                points.setText(String.valueOf(points_value));
                will--;
                will_txt.setText(String.valueOf(will));
            }
        });

    }

    private void setNextButton() {
        next_button.setOnAction(event-> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("skill_page.fxml"));
            Parent newRoot = null;
            try {
                newRoot = loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Scene sc = agil_up.getScene();
            Parent oldRoot = sc.getRoot();
            Scene scene = oldRoot.getScene();
            scene.setRoot(newRoot);
        });
    }
    public void setWitcher (Witcher_character witcher) {
        this.witcher = witcher;
    }

    private void increaseParameter(int parameter, int  points) {
            if(points>0 && parameter < 10){
                parameter++;
                points--;
            points_value = points;}

        }
        private  void decreaseParameter(int parameter, int points) {
            if(parameter > 1){
                parameter--;
                points++;
            } points_value = points;

        }
        private void setWitcherlabels () {
        prof_skill1.setText("Внимание");
        prof_skill2.setText("Дедукция");
        prof_skill3.setText("Сотворение заклинаний (2)");
        prof_skill4.setText("Алхимия(2)");
        prof_skill5.setText("Уклонение");
        prof_skill6.setText("Выживание");
        prof_skill7.setText("Мечи");
        prof_skill8.setText("Атлетика");
        prof_skill9.setText("Скрытность");
        prof_skill10.setText("Верховая езда");
        prof_skill11.setText("Подготовка ведьмака");
        }
    private void setWitcherButtons() {
        att = 1; ded = 1;spell = 1; alch = 1; dodge = 1;survival = 1; sword = 1; atl = 1; stl = 1; hbr = 1; wt = 1;

        prof_down1.setOnAction(event -> {
            if(att > 1 && prof_skill_point_value < 33){
                decreaseSkills(att,prof_skill_point_value);
        points1.setText(String.valueOf(prof_skill_point_value));

        att--; prof_txt1.setText(String.valueOf(att));}
        });
        prof_up1.setOnAction(event -> {
            if( att < 10 && prof_skill_point_value > att-1){
            increaseSkills(att,prof_skill_point_value);
            points1.setText(String.valueOf(prof_skill_point_value));
            att++; prof_txt1.setText(String.valueOf(att));}
        });
        prof_down2.setOnAction(event -> {
            if(ded > 1 && prof_skill_point_value < 33){
                decreaseSkills(ded,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                ded--; prof_txt2.setText(String.valueOf(ded));}
        });
        prof_up2.setOnAction(event -> {
            if( ded < 10 && prof_skill_point_value > ded-1){
                increaseSkills(ded,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                ded++; prof_txt2.setText(String.valueOf(ded));}
        });
        prof_down3.setOnAction(event -> {
            if(spell > 1 && prof_skill_point_value < 33){
                decreaseSkills(spell,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                spell--; prof_txt3.setText(String.valueOf(spell));}
        });
        prof_up3.setOnAction(event -> {
            if( spell < 10 && prof_skill_point_value > spell-1){
                increaseSkills(spell,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                spell++; prof_txt3.setText(String.valueOf(spell));}
        });
        prof_down4.setOnAction(event -> {
            if(alch > 1 && prof_skill_point_value < 33){
                decreaseSkills(alch,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                alch--; prof_txt4.setText(String.valueOf(alch));}
        });
        prof_up4.setOnAction(event -> {
            if( alch < 10 && prof_skill_point_value > alch-1){
                increaseSkills(alch,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                alch++; prof_txt4.setText(String.valueOf(alch));}
        });
        prof_down5.setOnAction(event -> {
            if(dodge > 1 && prof_skill_point_value < 33){
                decreaseSkills(dodge,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                dodge--; prof_txt5.setText(String.valueOf(dodge));}
        });
        prof_up5.setOnAction(event -> {
            if( dodge < 10 && prof_skill_point_value > dodge-1){
                increaseSkills(dodge,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                dodge++; prof_txt5.setText(String.valueOf(dodge));}
        });
        prof_down6.setOnAction(event -> {
            if(survival > 1 && prof_skill_point_value < 33){
                decreaseSkills(survival,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                survival--; prof_txt6.setText(String.valueOf(survival));}
        });
        prof_up6.setOnAction(event -> {
            if( survival < 10 && prof_skill_point_value > survival-1){
                increaseSkills(survival,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                survival++; prof_txt6.setText(String.valueOf(survival));}
        });
        prof_down7.setOnAction(event -> {
            if(sword > 1 && prof_skill_point_value < 33){
                decreaseSkills(sword,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                sword--; prof_txt7.setText(String.valueOf(sword));}
        });
        prof_up7.setOnAction(event -> {
            if( sword < 10 && prof_skill_point_value > sword-1){
                increaseSkills(sword,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                sword++; prof_txt7.setText(String.valueOf(sword));}
        });
        prof_down8.setOnAction(event -> {
            if(atl > 1 && prof_skill_point_value < 33){
                decreaseSkills(atl,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                atl--; prof_txt8.setText(String.valueOf(atl));}
        });
        prof_up8.setOnAction(event -> {
            if( atl < 10 && prof_skill_point_value > atl-1){
                increaseSkills(atl,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                atl++; prof_txt8.setText(String.valueOf(atl));}
        });
        prof_down9.setOnAction(event -> {
            if(stl > 1 && prof_skill_point_value < 33){
                decreaseSkills(stl,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                stl--; prof_txt9.setText(String.valueOf(stl));}
        });
        prof_up9.setOnAction(event -> {
            if( stl < 10 && prof_skill_point_value > stl-1){
                increaseSkills(stl,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                stl++; prof_txt9.setText(String.valueOf(stl));}
        });
        prof_down10.setOnAction(event -> {
            if(hbr > 1 && prof_skill_point_value < 33){
                decreaseSkills(hbr,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                hbr--; prof_txt10.setText(String.valueOf(hbr));}
        });
        prof_up10.setOnAction(event -> {
            if( hbr < 10 && prof_skill_point_value > hbr-1){
                increaseSkills(hbr,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                hbr++; prof_txt10.setText(String.valueOf(hbr));}
        });
        prof_down11.setOnAction(event -> {
            if(wt > 1 && prof_skill_point_value < 33){
                decreaseSkills(wt,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));
                wt--; prof_txt11.setText(String.valueOf(wt));}
        });
        prof_up11.setOnAction(event -> {
            if( wt < 10 && prof_skill_point_value > wt-1){
                increaseSkills(wt,prof_skill_point_value);
                points1.setText(String.valueOf(prof_skill_point_value));

                wt++; prof_txt11.setText(String.valueOf(wt));}
        });
    }




        private void increaseSkills(int skill, int points) {
            if(skill == 0 && points >= 1){ skill++;points--;}
            else {
                int oldValue = skill;
                if(skill < 10){
                    if(points - oldValue >= 0){
                        points = points - oldValue;
                        skill++;}

                }
            }  prof_skill_point_value = points;
            System.out.println(points);
        }
        private static void decreaseSkills(int skill,int points) {
            if(skill > 0 && points < 33){
                if(skill == 1) { skill--;points++;}
                else {
                    int oldValue = skill - 1;
                    points = points + oldValue;
                    skill--;
                }
            }prof_skill_point_value = points;
            System.out.println(points);

        }
        private  void skillUpBut(Button butt, int parameter,Text text) {
        butt.setOnAction(event -> {
            increaseSkills(parameter, points_value);
            points.setText(String.valueOf(points_value));
            System.out.println(parameter);
            if(parameter <= 10){ text.setText(String.valueOf(parameter));}
        });

        }
        private void parDownBut (Button butt,int parameter,Text text) {
        butt.setOnAction(event -> {
            decreaseParameter(parameter,points_value);
            points.setText(String.valueOf(points_value));
            if(parameter > 1) text.setText(String.valueOf(parameter));
        });
        }


        }










