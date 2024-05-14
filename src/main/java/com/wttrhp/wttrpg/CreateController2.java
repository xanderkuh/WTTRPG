package com.wttrhp.wttrpg;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateController2 {

    @FXML
    private Button agil_down = new Button();

    @FXML
    private Text agil_txt;

    @FXML
    private Button agil_up = new Button();

    @FXML
    private Button back_button = new Button();

    @FXML
    private Button bt_down= new Button();

    @FXML
    private Text bt_txt;

    @FXML
    private Button bt_up = new Button();

    @FXML
    private Button craf_down = new Button();

    @FXML
    private Text craft_txt;

    @FXML
    private Button craft_up = new Button();

    @FXML
    private Button emp_down = new Button();

    @FXML
    private Text emp_txt;

    @FXML
    private Button emp_up = new Button();

    @FXML
    private Button int_down = new Button();

    @FXML
    private Text int_txt;

    @FXML
    private Button int_up = new Button();

    @FXML
    private Button luck_down = new Button();

    @FXML
    private Text luck_txt;

    @FXML
    private Button luck_up = new Button();

    @FXML
    private Button next_button = new Button();

    @FXML
    private Text points;

    @FXML
    private Button refl_down = new Button() ;

    @FXML
    private Text refl_txt;

    @FXML
    private Button refl_up = new Button();

    @FXML
    private Button speed_down = new Button();

    @FXML
    private Text speed_txt;

    @FXML
    private Button speed_up = new Button();

    @FXML
    private Button will_down = new Button();

    @FXML
    private Text will_txt;

    @FXML
    private Button will_up ;
    Humanoids h;
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





    public CreateController2(Humanoids h){this.h = h;}






    public void initialize() {
        h.intel = 1;
        h.agility = 1;
        h.bt = 1;
        h.refl = 1;
        h.will = 1;
        h.speed = 1;
        h.crt = 1;
        h.luck = 1;
        h.emp = 1;
        int_up.setOnAction(event -> {
            if(h.intel < 10 && points_value > 0){
                increaseParameter(h.intel,points_value);
                points.setText(String.valueOf(points_value));
                h.intel++;
                int_txt.setText(String.valueOf(h.intel));
                }
        });
        int_down.setOnAction(event -> {
            if(h.intel >= 2){
                decreaseParameter(h.intel,points_value);
                points.setText(String.valueOf(points_value));
                h.intel--;
                int_txt.setText(String.valueOf(h.intel));
                }

        });
        agil_up.setOnAction(event -> {
            if(h.agility < 10 && points_value > 0){
                increaseParameter(h.agility,points_value);
                points.setText(String.valueOf(points_value));
                h.agility++;
                agil_txt.setText(String.valueOf(h.agility));
            }
        });
        agil_down.setOnAction(event -> {
            if(h.agility >= 2){
                decreaseParameter(h.agility,points_value);
                points.setText(String.valueOf(points_value));
                h.agility--;
                agil_txt.setText(String.valueOf(h.agility));
            }

        });
        refl_up.setOnAction(event -> {
            if(h.refl < 10 && points_value > 0){
                increaseParameter(h.refl,points_value);
                points.setText(String.valueOf(points_value));
                h.refl++;
                refl_txt.setText(String.valueOf(h.refl));
                }
        });
        refl_down.setOnAction(event -> {
            if(h.refl >= 2){
                decreaseParameter(h.refl,points_value);
                points.setText(String.valueOf(points_value));
                h.refl--;
                refl_txt.setText(String.valueOf(h.refl));

            }

        });

        luck_up.setOnAction(event -> {
            if(h.luck < 10 && points_value > 0){
                increaseParameter(h.luck,points_value);
                points.setText(String.valueOf(points_value));
                h.luck++;
                luck_txt.setText(String.valueOf(h.luck));
            }
        });
        luck_down.setOnAction(event -> {
            if(h.luck >= 2 && points_value > 0){
                decreaseParameter(h.luck,points_value);
                points.setText(String.valueOf(points_value));
                h.luck--;
                luck_txt.setText(String.valueOf(h.luck));
            }

        });
        speed_up.setOnAction(event -> {
            if(h.speed < 10 && points_value > 0){
                increaseParameter(h.speed,points_value);
                points.setText(String.valueOf(points_value));
                h.speed++;
                speed_txt.setText(String.valueOf(h.speed));
            }
        });
        speed_down.setOnAction(event -> {
            if(h.speed >= 2){
                decreaseParameter(h.speed,points_value);
                points.setText(String.valueOf(points_value));
                h.speed--;
                speed_txt.setText(String.valueOf(h.speed));
            }

        });
        emp_up.setOnAction(event -> {
            if(h.emp < 10 && points_value > 0){
                increaseParameter(h.emp,points_value);
                points.setText(String.valueOf(points_value));
                h.emp++;
                emp_txt.setText(String.valueOf(h.emp));
            }
        });
        emp_down.setOnAction(event -> {
            if(h.emp >= 2){
                decreaseParameter(h.emp,points_value);
                points.setText(String.valueOf(points_value));
                h.emp--;
                emp_txt.setText(String.valueOf(h.emp));
            }

        });
        craft_up.setOnAction(event -> {
            if(h.crt < 10 && points_value > 0){
                increaseParameter(h.crt,points_value);
                points.setText(String.valueOf(points_value));
                h.crt++;
                craft_txt.setText(String.valueOf(h.crt));
            }
        });
        craf_down.setOnAction(event -> {
            if(h.crt >= 2){
                decreaseParameter(h.crt,points_value);
                points.setText(String.valueOf(points_value));
                h.crt--;
                craft_txt.setText(String.valueOf(h.crt));
            }
        });
        bt_up.setOnAction(event -> {
            if(h.bt < 10 && points_value > 0){
                increaseParameter(h.bt,points_value);
                points.setText(String.valueOf(points_value));
                h.bt++;
                bt_txt.setText(String.valueOf(h.bt));
            }
        });
        bt_down.setOnAction(event -> {
            if(h.bt >= 2){
                decreaseParameter(h.bt,points_value);
                points.setText(String.valueOf(points_value));
                h.bt--;
                bt_txt.setText(String.valueOf(h.bt));
            }
        });
        will_up.setOnAction(event -> {
            if(h.will < 10 && points_value > 0){
                increaseParameter(h.will,points_value);
                points.setText(String.valueOf(points_value));
                h.will++;
                will_txt.setText(String.valueOf(h.will));
            }
        });
        will_down.setOnAction(event -> {
            if(h.will >= 2){
                decreaseParameter(h.will,points_value);
                points.setText(String.valueOf(points_value));
                h.will--;
                will_txt.setText(String.valueOf(h.will));
            }
        });
        if(h instanceof Witcher_character) {
            agil = 2;
            agil_txt.setText(String.valueOf(agil));
            refl = 2;
            refl_txt.setText(String.valueOf(refl));
            points_value = 46;
            points.setText(String.valueOf(points_value));
            agil_up.setOnAction(event -> {
                if(h.agility < 11 && points_value > 0){
                    increaseParameter(h.agility,points_value);
                    points.setText(String.valueOf(points_value));
                    h.agility++;
                    agil_txt.setText(String.valueOf(h.agility));
                }
            });
            agil_down.setOnAction(event -> {
                if(h.agility >= 3){
                    decreaseParameter(h.agility,points_value);
                    points.setText(String.valueOf(points_value));
                    h.agility--;
                    agil_txt.setText(String.valueOf(h.agility));
                }

            });
            refl_up.setOnAction(event -> {
                if(h.refl < 11 && points_value > 0){
                    increaseParameter(h.refl,points_value);
                    points.setText(String.valueOf(points_value));
                    h.refl++;
                    refl_txt.setText(String.valueOf(h.refl));
                }
            });
            refl_down.setOnAction(event -> {
                if(h.refl >= 3){
                    decreaseParameter(h.refl,points_value);
                    points.setText(String.valueOf(points_value));
                    h.refl--;
                    refl_txt.setText(String.valueOf(h.refl));
                }

            });

        setNextButton();}


    }
    private void increaseParameter(int parameter, int  points) {

            parameter++;
            points--;
            points_value = points;}


    private  void decreaseParameter(int parameter, int points) {

            parameter--;
            points++;
         points_value = points;}
    private void setParValues() {
        emp_txt.setText(String.valueOf(emp));
        int_txt.setText(String.valueOf(intel));
        refl_txt.setText(String.valueOf(refl));
        bt_txt.setText(String.valueOf(bt));
        speed_txt.setText(String.valueOf(speed));
        agil_txt.setText(String.valueOf(agil));
        luck_txt.setText(String.valueOf(luck));
        will_txt.setText(String.valueOf(will));
        craft_txt.setText(String.valueOf(craft));
    }




    private void setNextButton() {

        h.setPar(intel,refl,agil,bt,craft,emp,will,speed,luck);
            next_button.setOnAction(event -> {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create_page3.fxml"));
                CreateController3 c3 = new CreateController3(h);
                fxmlLoader.setController(c3);


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
