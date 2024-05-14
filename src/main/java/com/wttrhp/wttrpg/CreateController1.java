package com.wttrhp.wttrpg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateController1 {



    @FXML
    private TextField name_field;

    @FXML
    private Button next_button;

    @FXML
    private ComboBox<String> prof_selection;

    @FXML
    private ComboBox<String> race_selection;

    @FXML
    private ComboBox<String> sex_selection;

    private  Witcher_character w;
    String nameChar;
    String race;
    String sex;
    String prof;

    public void initialize() {


        ObservableList<String> sexValues  = FXCollections.observableArrayList("Мужчина", "Женщина");
        sex_selection.setItems(sexValues);
        ObservableList<String> raceValues  = FXCollections.observableArrayList("Ведьмак", "Человек","Эльф","Краснолюд","Маг");
        race_selection.setItems(raceValues);
        ObservableList<String> profValues  = FXCollections.observableArrayList("Ведьмак", "Воин","Лекарь","Маг","Преступник","Жрец","Ремесленник","Торговец");
        prof_selection.setItems(profValues);
        name_field.textProperty().addListener((observable, oldValue, newValue) -> {
            nameChar = newValue;
        });
        race_selection.setOnAction(event -> {
            String selectedValue = race_selection.getSelectionModel().getSelectedItem();
            race = selectedValue;
        });
        sex_selection.setOnAction(event -> {
            String selectedValue = sex_selection.getSelectionModel().getSelectedItem();
            sex = selectedValue;
        });


        prof_selection.setOnAction(e -> {
            if(prof_selection.getValue().equals("Ведьмак")) {
                String selectedValue = prof_selection.getSelectionModel().getSelectedItem();
                prof = selectedValue;
                w = new Witcher_character(nameChar,prof,sex,prof);

                setNextButton();
                ;

            }
        });

    }

    private void setNextButton() {
            next_button.setOnAction(event -> {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create_page2.fxml"));
                CreateController2 c2 = new CreateController2(w);
                fxmlLoader.setController(c2);


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


