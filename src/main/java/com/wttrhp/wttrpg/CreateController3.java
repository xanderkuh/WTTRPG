package com.wttrhp.wttrpg;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateController3 {


    @FXML
    private Button back_button;

    @FXML
    private Button next_button;

    @FXML
    private Text points1;

    @FXML
    private Button prof_down1;

    @FXML
    private Button prof_down10;

    @FXML
    private Button prof_down11;

    @FXML
    private Button prof_down2;

    @FXML
    private Button prof_down3;

    @FXML
    private Button prof_down4;

    @FXML
    private Button prof_down5;

    @FXML
    private Button prof_down6;

    @FXML
    private Button prof_down7;

    @FXML
    private Button prof_down8;

    @FXML
    private Button prof_down9;

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
    private Text prof_txt10;

    @FXML
    private Text prof_txt11;

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
    private Button prof_up1;

    @FXML
    private Button prof_up10;

    @FXML
    private Button prof_up11;

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
    Humanoids h;
    private int prof_skill_point_value;
    private int ps1;
    private int ps1min;
    private boolean ps1hard;
    private int ps2;
    private int ps2min;
    private boolean ps2hard;
    private int ps3;
    private int ps3min;
    private boolean ps3hard;
    private int ps4;
    private int ps4min;
    private boolean ps4hard;
    private int ps5;
    private int ps5min;
    private boolean ps5hard;
    private int ps6;
    private int ps6min;
    private boolean ps6hard;
    private int ps7;
    private int ps7min;
    private boolean ps7hard;
    private int ps8;
    private int ps8min;
    private boolean ps8hard;
    private int ps9;
    private int ps9min;
    private boolean ps9hard;
    private int ps10;
    private int ps10min;
    private boolean ps10hard;
    private int ps11;
    private int ps11min;
    private boolean ps11hard;


    public void initialize() {
        if(h instanceof Witcher_character){
            setWitcherlabels();
            setSkillbuttons();
            setNextButton();
            prof_skill_point_value = 33;
            ps1 = 1;ps1min = 1;
            if(h.attention > 0){ps1 = h.attention;ps1min = ps1;prof_skill_point_value++;}
            ps2 = 1;ps2min = 1;
            if(h.deduction> 0){ps2 = h.deduction;ps2min = ps2;prof_skill_point_value++;}
            ps3 = 1;ps3min = 1; ps3hard = true;
            if(h.castingSpells> 0){ps3 = h.castingSpells;ps3min = ps3;prof_skill_point_value++;}
            ps4 = 1;ps4min = 1; ps4hard = true;
            if(h.alchemy> 0){ps4 = h.alchemy;ps4min = ps4;prof_skill_point_value++;}
            ps5 = 1;ps5min = 1;
            if(h.dodge> 0){ps5 = h.dodge;ps5min = ps5;prof_skill_point_value++;}
            ps6 = 1;ps6min = 1;
            if(h.survival> 0){ps6 = h.survival;ps6min = ps6;prof_skill_point_value++;}
            ps7 = 1;ps7min = 1;
            if(h.swordsmanship> 0){ps7 = h.swordsmanship;ps7min = ps7;prof_skill_point_value++;}
            ps8 = 1;ps8min = 1;
            if(h.athletics> 0){ps8 = h.athletics;ps8min = ps8;prof_skill_point_value++;}
            ps9 = 1;ps9min = 1;
            if(h.stealth> 0){ps9 = h.stealth;ps9min = ps9;}
            ps10 = 1;ps10min = 1;
            if(h.horseBackRiding> 0){ps10 = h.horseBackRiding;ps10min = ps10;prof_skill_point_value++;}
            ps11 = 1;ps11min = 1;
            if(h.mSkill> 0){ps11 = h.mSkill;ps11min = ps11;prof_skill_point_value++;}

        }




    }

    public CreateController3(Humanoids h) {
        this.h = h;
    }


    private void increaseSkills(int skill,boolean hard) {
        if(!hard){
        if (skill == 0 && prof_skill_point_value >= 1) {
            prof_skill_point_value--;
        } else {
            int oldValue = skill;
            if (skill < 6) {
                if (prof_skill_point_value - oldValue >= 0) {
                    prof_skill_point_value = prof_skill_point_value - oldValue;
                }
            }
        }
    }else {
            if(skill == 0 && prof_skill_point_value >= 1 ){
                prof_skill_point_value = prof_skill_point_value-2;
            }else {
                int oldValue = skill;
                if (skill < 6) {
                    if (prof_skill_point_value - oldValue*2 >= 0) {
                        prof_skill_point_value = prof_skill_point_value - oldValue*2;
                    }
            }
        }
    }}

    private void decreaseSkills(int skill, boolean hard) {
        if(!hard){
        if (skill > 0 && prof_skill_point_value < 33) {
            if (skill == 1) {
                prof_skill_point_value++;
            } else {
                int oldValue = skill - 1;
                prof_skill_point_value = prof_skill_point_value + oldValue;
            }
        }
    }else {
            if (skill > 0 && prof_skill_point_value < 33) {
                if (skill == 1) {
                    prof_skill_point_value = prof_skill_point_value + 2;
                } else {
                    int oldValue = skill - 1;
                    prof_skill_point_value = prof_skill_point_value + oldValue*2;
                }
        }
    }}
    private void setSkillbuttons() {
        prof_down1.setOnAction(event -> {
        if(ps1 > ps1min) {
            if (ps1 >= 2 && prof_skill_point_value < 33) {
                decreaseSkills(ps1, ps1hard);
                points1.setText(String.valueOf(prof_skill_point_value));
                ps1--;
                prof_txt1.setText(String.valueOf(ps1));
            }
        }});
        prof_up1.setOnAction(event -> {
            if (ps1 < 6 && prof_skill_point_value > ps1 - 1) {
                increaseSkills(ps1, ps2hard);
                points1.setText(String.valueOf(prof_skill_point_value));
                ps1++;
                prof_txt1.setText(String.valueOf(ps1));
            }
        });
        prof_down2.setOnAction(event -> {
            if(ps2 > ps2min) {
                if (ps2 >= 2 && prof_skill_point_value < 33) {
                    decreaseSkills(ps2, ps2hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps2--;
                    prof_txt2.setText(String.valueOf(ps2));
                }
            }});
        prof_up2.setOnAction(event -> {
            if (ps2 < 6 && prof_skill_point_value > ps2 - 1) {
                increaseSkills(ps2, ps2hard);
                points1.setText(String.valueOf(prof_skill_point_value));
                ps2++;
                prof_txt2.setText(String.valueOf(ps2));
            }
        });
        prof_down3.setOnAction(event -> {
            if(ps3 > ps3min) {
                if (ps3 >= 2 && prof_skill_point_value < 33) {
                    decreaseSkills(ps3, ps3hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps3--;
                    prof_txt3.setText(String.valueOf(ps3));
                }
            }});
        prof_up3.setOnAction(event -> {

                if (ps3 < 6 && prof_skill_point_value > ps3 - 1) {
                    increaseSkills(ps3, ps3hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps3++;
                    prof_txt3.setText(String.valueOf(ps3));
                }
            });
        prof_down4.setOnAction(event -> {
            if (ps4 >= 2 && prof_skill_point_value < 33) {
                decreaseSkills(ps4, ps4hard);
                points1.setText(String.valueOf(prof_skill_point_value));
                ps4--;
                prof_txt4.setText(String.valueOf(ps4));
            }
        });
        prof_up4.setOnAction(event -> {
                if (ps4 < 6 && prof_skill_point_value > ps4 - 1) {
                    increaseSkills(ps4, ps4hard);
                    points1.setText(String.valueOf(prof_skill_point_value));

                    ps4++;
                    prof_txt4.setText(String.valueOf(ps4));
                }
            });
        prof_down5.setOnAction(event -> {
            if(ps5 > ps5min) {
                if (ps5 >= 2 && prof_skill_point_value < 33) {
                    decreaseSkills(ps5, ps5hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps5--;
                    prof_txt5.setText(String.valueOf(ps5));
                }
            }});
        prof_up5.setOnAction(event -> {
                if (ps5 < 6 && prof_skill_point_value > ps5 - 1) {
                    increaseSkills(ps5, ps5hard);
                    points1.setText(String.valueOf(prof_skill_point_value));


                    ps5++;
                    prof_txt5.setText(String.valueOf(ps5));
                }
            });
        prof_down6.setOnAction(event -> {
            if(ps6 > ps6min) {
                if (ps6 > 1 && prof_skill_point_value < 33) {
                    decreaseSkills(ps6, ps6hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps6--;
                    prof_txt6.setText(String.valueOf(ps6));
                }
            }});
        prof_up6.setOnAction(event -> {
            if(ps5> ps5min) {
                if (ps6 < 6 && prof_skill_point_value > ps6 - 1) {
                    increaseSkills(ps6, ps6hard);
                    points1.setText(String.valueOf(prof_skill_point_value));

                    ps6++;
                    prof_txt6.setText(String.valueOf(ps6));
                }
            }});
        prof_down7.setOnAction(event -> {
            if(ps7 > ps7min) {
                if (ps7 > 1 && prof_skill_point_value < 33) {
                    decreaseSkills(ps7, ps7hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps7--;
                    prof_txt7.setText(String.valueOf(ps7));
                }
            }});
        prof_up7.setOnAction(event -> {
                if (ps7 < 6 && prof_skill_point_value > ps7 - 1) {
                    increaseSkills(ps7, ps7hard);
                    points1.setText(String.valueOf(prof_skill_point_value));

                    ps7++;
                    prof_txt7.setText(String.valueOf(ps7));
                }
            });
        prof_down8.setOnAction(event -> {
            if(ps8 > ps8min) {
                if (ps8 > 1 && prof_skill_point_value < 33) {
                    decreaseSkills(ps8, ps8hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps8--;
                    prof_txt8.setText(String.valueOf(ps8));
                }
            }});
        prof_up8.setOnAction(event -> {

                if (ps8 < 6 && prof_skill_point_value > ps8 - 1) {
                    increaseSkills(ps8, ps8hard);
                    points1.setText(String.valueOf(prof_skill_point_value));

                    ps8++;
                    prof_txt8.setText(String.valueOf(ps8));
                }
            });
        prof_down9.setOnAction(event -> {
            if(ps9 > ps9min) {
                if (ps9 > 1 && prof_skill_point_value < 33) {
                    decreaseSkills(ps9, ps9hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps9--;
                    prof_txt9.setText(String.valueOf(ps9));
                }
            }});
        prof_up9.setOnAction(event -> {
                if (ps9 < 6 && prof_skill_point_value > ps9 - 1) {
                    increaseSkills(ps9, ps9hard);
                    points1.setText(String.valueOf(prof_skill_point_value));

                    ps9++;
                    prof_txt9.setText(String.valueOf(ps9));
                }
            });
        prof_down10.setOnAction(event -> {
            if(ps10 > ps10min) {
                if (ps10 > 1 && prof_skill_point_value < 33) {
                    decreaseSkills(ps10, ps9hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps10--;
                    prof_txt10.setText(String.valueOf(ps10));
                }
            }});
        prof_up10.setOnAction(event -> {
                if (ps10 < 6 && prof_skill_point_value > ps10 - 1) {
                    increaseSkills(ps10, ps10hard);
                    points1.setText(String.valueOf(prof_skill_point_value));

                    ps10++;
                    prof_txt10.setText(String.valueOf(ps10));
                }
            });
        prof_down11.setOnAction(event -> {
            if(ps11 > ps11min) {
                if (ps11 > 1 && prof_skill_point_value < 33) {
                    decreaseSkills(ps11, ps11hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps11--;
                    prof_txt11.setText(String.valueOf(ps11));
                }
            }});
        prof_up11.setOnAction(event -> {
                if (ps11 < 6 && prof_skill_point_value > ps11 - 1) {
                    increaseSkills(ps11, ps11hard);
                    points1.setText(String.valueOf(prof_skill_point_value));
                    ps11++;
                    prof_txt11.setText(String.valueOf(ps11));
                }
            });}

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
    private void setNextButton() {
            h.setProfSkills(ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9,ps10,ps11);
            next_button.setOnAction(event -> {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create_page4.fxml"));
                CreateController4 c4 = new CreateController4(h);
                fxmlLoader.setController(c4);


                try {
                    Parent root = fxmlLoader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        }
    }
