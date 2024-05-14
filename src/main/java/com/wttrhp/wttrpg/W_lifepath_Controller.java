package com.wttrhp.wttrpg;

import com.almasb.fxgl.core.collection.Array;
import eu.hansolo.tilesfx.addons.Switch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.Random;

public class W_lifepath_Controller {

    @FXML
    private ColumnConstraints ally;

    @FXML
    private ColumnConstraints benefit;

    @FXML
    private Button choice_butt;

    @FXML
    private GridPane conviction;

    @FXML
    private RowConstraints d1;



    @FXML
    private ColumnConstraints dangerous;

    @FXML
    private ColumnConstraints hunt;


    @FXML
    private Button roll1;

    @FXML
    private Button roll2;

    @FXML
    private Button roll3;

    @FXML
    private Button roll4;

    @FXML
    private Button roll5;

    @FXML
    private Button roll6;

    @FXML
    private Text t1;

    @FXML
    private Text t2;

    @FXML
    private Text t3;

    @FXML
    private Text t4;

    @FXML
    private Text t5;

    @FXML
    private Text t6;

    @FXML
    private ComboBox<String> l1;

    @FXML
    private ComboBox<String> l10;

    @FXML
    private ComboBox<String> l11;

    @FXML
    private ComboBox<String> l12;
    @FXML
    private ComboBox<String> k1;

    @FXML
    private ComboBox<String> l13;

    @FXML
    private ComboBox<String> l14;

    @FXML
    private ComboBox<String> l15;

    @FXML
    private ComboBox<String> l16;

    @FXML
    private ComboBox<String> l17;

    @FXML
    private ComboBox<String> l18;

    @FXML
    private ComboBox<String> l19;

    @FXML
    private ComboBox<String> l2;

    @FXML
    private ComboBox<String> l20;

    @FXML
    private ComboBox<String> l21;

    @FXML
    private ComboBox<String> l22;

    @FXML
    private ComboBox<String> l23;

    @FXML
    private ComboBox<String> l24;

    @FXML
    private ComboBox<String> l3;

    @FXML
    private ComboBox<String> l4;

    @FXML
    private ComboBox<String> l5;

    @FXML
    private ComboBox<String> l6;

    @FXML
    private ComboBox<String> l7;

    @FXML
    private ComboBox<String> l8;

    @FXML
    private ComboBox<String> l9;



    @FXML
    private ComboBox<String> w_age;

    @FXML
    private ComboBox<String> w_herb_test;

    @FXML
    private ComboBox<String> w_main_event;

    @FXML
    private ComboBox<String> w_now;

    @FXML
    private ComboBox<String> w_school;

    @FXML
    private ComboBox<String> w_trainings;


    private int herb_mod = 0;
    private int cur_age = 50;
    ComboBox<String>[] b;

    public void initialize() {
        ObservableList<String> ageValues  = FXCollections.observableArrayList("Младенчество (-2 к Испытанию травами)", "Раннее детство (нет модификаторов)","Позднее детство (+2 к Испытанию травами)");
        w_age.setItems(ageValues);
        ObservableList<String> schoolValues  = FXCollections.observableArrayList("Школа Волка (нет штрафов при сильной атаке)", "Школа Грифона (+2 к Энергии)","Школа Кота (невосприимчивость ко всем немагическим попыткам обольщения)","Школа Змеи (нет штрафов за парное оружие)","Школа Медведя (-2 к СД)","Школа Мантикоры (продвинутое владение щитом)");
        w_school.setItems(schoolValues);
        ObservableList<String> tValues  = FXCollections.observableArrayList("Травма на Мучильне (-1 к Скор)", "Украденное знание (+1 ведьмачий чертёж)","Завёл соперника (I враг-ведьмак)","Лёгкие мутации (+2 к Испытанию травами)","Негативные последствия магии (-1 к Энергии)","Лучший в классе (+1 к Владению мечом)","Плохая реакция на мутагены (-2 к Испытанию травами)","Завёл друга (1 друг-ведьмак)","Травма на маятнике (-1 к Реа)","Глубокое изучение (+1 к Подготовке ведьмака)");
        w_trainings.setItems(tValues);
        ObservableList<String> herbValues  = FXCollections.observableArrayList("Почти смертельно (дополнительно -1 к Эмп и -1 к Тел)", "Тяжёлые последствия (дополнительно -1 к Эмп)","Приемлемые мутации (без модификаторов)","Дополнительные мутации (дополнительно +1 к Эмп и +1 к Лвк)");
        w_herb_test.setItems(herbValues);
        ObservableList<String> eValues  = FXCollections.observableArrayList("Получил дитя по Праву Неожиданности", "Нападение разумного чудовища","Сражался плечом к плечу с рыцарем","Был схвачен магом для экспериментов","Работал на дворянина","Выход за пределы","Серьёзные отношения","Сражение за свою крепость","Дурная слава","Слава героя");
        w_main_event.setItems(eValues);
        ObservableList<String> nValues  = FXCollections.observableArrayList("Личный ведьмак", "В поисках работы","Отшельник","Нормальная жизнь","Опасный преступник");
        w_now.setItems(nValues);
        ObservableList<String> c = FXCollections.observableArrayList("Осторожное 10%", "Нормальное 25%","Среднее 50%","Рискованное 75%");

        b = new ComboBox[24];b[0] = l1;b[1] = l2;b[2] = l3;b[3] = l4;b[4] = l5;b[5] = l6;b[6] = l7;b[7] = l8;b[8] = l9;b[9] = l10;b[10] = l11;b[11] = l12;b[12] = l13;b[13] = l14;b[14] = l15;b[15] = l16;b[16] = l17;b[17] = l18;b[18] = l19;b[19] = l20;b[20] = l21;b[21] = l22;b[22] = l23;b[23] = l24;
        int n_decades = ((cur_age - 20) / 10) - 1;
        for(int i = 0; i <= n_decades;i++){
            b[i].setItems(c);
            b[i].setDisable(false);
        }
        choice_butt.setOnAction(event ->{
            for(int i = 0;i < b.length;i++){
                if(b[i].isDisabled() == false){
                    int d = b[i].getSelectionModel().getSelectedIndex();
                    int d_lvl = 0;
                    switch (d) {
                        case 0 : {d_lvl = 10;break;}
                        case 1 : {d_lvl = 25;break;}
                        case 2 : {d_lvl = 50;break;}
                        case 3 : {d_lvl = 75;break;}

                    }
                    roll_d(d_lvl,i);

                }
            }
        });



        roll1.setOnAction(event ->{
            int res = rolld10();
        if(res <= 2) {w_age.setValue(ageValues.get(0));
        }
        else if(res>=3 && res <= 8) w_age.setValue(ageValues.get(1));
        else w_age.setValue(ageValues.get(2));
        });
        roll2.setOnAction(event ->{
            int res = rolld6();
            if(res == 1) w_school.setValue(schoolValues.get(0));
            else if(res == 2) w_age.setValue(schoolValues.get(1));
            else if (res == 3) w_school.setValue(schoolValues.get(2));
            else if (res == 4) w_school.setValue(schoolValues.get(3));
            else if (res == 5) w_school.setValue(schoolValues.get(4));
            else if (res == 6) w_school.setValue(schoolValues.get(5));
        });
        roll3.setOnAction(event ->{
            int res = rolld10();
            if(res == 1) w_trainings.setValue(tValues.get(0));
            else if(res == 2) w_trainings.setValue(tValues.get(1));
            else if (res == 3) w_trainings.setValue(tValues.get(2));
            else if (res == 4) w_trainings.setValue(tValues.get(3));
            else if (res == 5) w_trainings.setValue(tValues.get(4));
            else if (res == 6) w_trainings.setValue(tValues.get(5));
            else if (res == 7) w_trainings.setValue(tValues.get(6));
            else if (res == 8) w_trainings.setValue(tValues.get(7));
            else if (res == 9) w_trainings.setValue(tValues.get(8));
            else if (res == 10)w_trainings.setValue(tValues.get(9));
        });
        roll4.setOnAction(event ->{
            int res = rolld10();
            if(res == 1 ) w_herb_test.setValue(herbValues.get(0));
            else if(res == 2 || res == 3) w_herb_test.setValue(herbValues.get(1));
            else if (res >= 4 && res <= 9) w_herb_test.setValue(herbValues.get(2));
            else if (res == 10) w_herb_test.setValue(herbValues.get(3));
        });
        roll5.setOnAction(event ->{
            int res = rolld10();
            if(res == 1) w_main_event.setValue(eValues.get(0));
            else if(res == 2) w_main_event.setValue(eValues.get(1));
            else if (res == 3) w_main_event.setValue(eValues.get(2));
            else if (res == 4) w_main_event.setValue(eValues.get(3));
            else if (res == 5) w_main_event.setValue(eValues.get(4));
            else if (res == 6) w_main_event.setValue(eValues.get(5));
            else if (res == 7) w_main_event.setValue(eValues.get(6));
            else if (res == 8) w_main_event.setValue(eValues.get(7));
            else if (res == 9) w_main_event.setValue(eValues.get(8));
            else if (res == 10)w_main_event.setValue(eValues.get(9));
        });
        roll6.setOnAction(event ->{
            int res = rolld10();
            if(res == 1 ) w_now.setValue(nValues.get(0));
            else if(res == 2) w_now.setValue(nValues.get(1));
            else if (res >= 3 && res <= 8) w_now.setValue(nValues.get(2));
            else if (res == 9) w_now.setValue(nValues.get(3));
            else if (res == 10) w_now.setValue(nValues.get(4));
        });
        w_age.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> updateText1(newValue.intValue()));
        w_school.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> updateText2(newValue.intValue()));
        w_trainings.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> updateText3(newValue.intValue()));
        w_herb_test.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> updateText4(newValue.intValue()));
        w_main_event.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> updateText5(newValue.intValue()));
        w_now.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> updateText6(newValue.intValue()));




    }
    private void roll_d(int d, int row){
        int val = new  Random().nextInt(100) + 1;
        if(val < d){
            switch (new Random().nextInt(3) + 1){
                case 1 : {
                    rollEvent(row);
                    break;
                }
                case 2 : {
                    rollWounds(row);
                    break;
                }
                case 3 : {
                    rollEnemies(row);
                    break;
                }

            } int issue = new  Random().nextInt(10) + 1;
            switch (d){
                case 10 : {
                    if(issue == 1) rollBenefit(row);
                    else if (issue == 2) rollAlly(row);
                    else if(issue == 3) rollHunt(row);
                    else { Label n = new Label("Ничего"); conviction.add(n,3,row);}
                        
                    }
                case 25 : {
                    if(issue == 1) rollBenefit(row);
                    else if (issue == 2) rollAlly(row);
                    else if(issue >= 3 && issue <= 5 ) rollHunt(row);
                    else { Label n = new Label("Ничего"); conviction.add(n,3,row);}
                } case 50 : {
                    if(issue == 1 || issue == 2) rollBenefit(row);
                    else if (issue >= 3 && issue <= 7) rollAlly(row);
                    else if(issue == 8 ) rollHunt(row);
                    else { Label n = new Label("Ничего"); conviction.add(n,3,row);}

        } case 75 : {
                    if(issue >= 1 && issue <= 5) rollBenefit(row);
                    else if (issue == 6 || issue == 7) rollAlly(row);
                    else if(issue == 8 || issue == 9 ) rollHunt(row);
                    else { Label n = new Label("Ничего"); conviction.add(n,3,row);}

                }
            }

    }}

    private void rollHunt(int row) {
    }

    private void rollAlly(int row) {
    }

    private void rollBenefit(int row) {
    }

    private void rollEnemies(int row) {
        String sex = null;
        String prof= null;
        String cause= null;
        String power= null;
        String end= null;

        switch (new Random().nextInt(2) + 1){
            case 1 : {sex = "Мужчина ";break;}
            case 2 : {sex = "Женщина ";break;}
        }
        switch (new Random().nextInt(5 ) + 1){
                case 1 : {prof = "Дворянин ";break;}
                case 2 : {prof = "Наёмник ";break;}
                case 3 : {prof = "Воин ";break;}
                case 4 : {prof = "Торговец ";break;}
                case 5 : {prof = "Преступник ";break;}
        }
        switch (new Random().nextInt(5 ) + 1){
            case 1 : {cause = "Он вас оклеветал ";break;}
            case 2 : {cause = "Вы помешали его плану ";break;}
            case 3 : {cause = "Он вас предал ";break;}
            case 4 : {cause = "Вы убили его родича ";break;}
            case 5 : {cause = "Он обманул вас ";break;}}
        switch (new Random().nextInt(5 ) + 1){
            case 1 : {power = "Социальное положение ";break;}
            case 2 : {power = "Знание ";break;}
            case 3 : {power = "Физическая сила ";break;}
            case 4 : {power = "Подручные ";break;}
            case 5 : {power = "Магия ";break;}



    }switch (new Random().nextInt(5 ) + 1){
            case 1 : {end = "Почти забыто ";break;}
            case 2 : {end = "Удар в спину ";break;}
            case 3 : {end = "Открытая вражда ";break;}
            case 4 : {end = "Травля в отместку ";break;}
            case 5 : {end = "Жажда крови ";break;}}
    String enemy = prof + sex + power + cause + end;conviction.add(new Label(enemy),2,row);}

    private void rollWounds(int row) {
        Label wound;
        String text = null;

        switch (new Random().nextInt(10) + 1){
            case 1: {text = "Плохо гнётся колено (-1 к Скор)"; break;}
            case 2: {text = "Повреждённый глаз -1 к зрительному Вниманию)";break;}
            case 3: {text = "Плохо гнётся рука (-1 к Ближнему бою этой рукой)";break;}
            case 4 : {text = "Повреждённые пальцы (нельзя сотворять знаки этой рукой)";break;}
            case 5 : {text = "Наконечник стрелы застрял в теле (-1 к Силе)";break;}
            case 6 : {text = "Одышка (-5 к Выносливости)";break;}
            case 7 : {text = "Огромный шрам (-2 к Харизме и Соблазнению)";break;}
            case 8 : {text = "Повреждённый нос (-2 к Выживанию в дикой природе при выслеживании по запаху)";break;}
            case 9 : {text = "Повреждение от яда (-5 ПЗ)";break;}
            case 10 : {text = "Полуглухой (-1 к слуховому Вниманию)";break;}
    }wound = new Label(text);conviction.add(wound,2,row);}

    private void rollEvent(int row) {
        Label event;
        String text = null;
        int bill = (new Random().nextInt(10) + 1) * 100;
        int inprisoned = new Random().nextInt(10) + 1;


        switch (new Random().nextInt(10) + 1){
            case 1: {text = "Долг - " + bill; break;}
            case 2: {text = "Разумное чудовище сбежало";break;}
            case 3: {text = "Зависимость";break;}
            case 4 : {text = "Заключение - " + inprisoned + " лет.";break;}
            case 5 : {text = "Ложное обвинение";break;}
            case 6 : {text = "Предательство";break;}
            case 7 : {text = "Убит друг или любимый";break;}
            case 8 : {text = "Вне закона в королевстве";break;}
            case 9 : {text = "Манипуляция";break;}
            case 10 : {text = "Проклятие";break;}



        }
        event = new Label(text);conviction.add(event,2,row);

    }


    private void updateText6(int i) {

        switch (i) {
            case 0:
                t6.setText("Вы подписали контракт с группой торговцев, знатным домом или важной персоной и стали личным ведьмаком. Вы работаете за скромную плату и охотитесь на кого скажут. Обычно на чудовищ...");
                break;
            case 1:
                t6.setText("Тяжёлая ведьмачья жизнь продолжается. Вы много странствуете, с грустью думая об отмирании профессии ведьмака и о редкости чудовищ. Вы постоянно в дороге, никогда не задерживаетесь на одном месте.");
                break;
            case 2:
                t6.setText("Вы перестали быть ведьмаком и отправились в дикие земли, чтобы жить как отшельник. Лишь теперь, когда чудовища стали возвращаться, вы решили вновь выбраться в мир.");
                break;
            case 3:
                t6.setText("Вы уже десятки лет пытаетесь оставить жизнь ведьмака. Это трудно, поскольку люди никогда не примут вас полностью, но вы кое-как ведёте практически нормальную жизнь. Желаем успехов!");
                break;
            case 4:
                t6.setText(" В итоге весь негатив и людская неблагодарность вас добили — вы решили, что поскольку чудовищ становится всё меньше, стоит переключиться на людей. Можете сами решить, чем вы промышляете ради выживания.");
                break;

    }}
    private void set_dbox(ComboBox<String> comboBox) {
        ObservableList<String> c = FXCollections.observableArrayList("Осторожное 10%", "Нормальное 25%","Среднее 50%","Рискованное 75%");
        comboBox.setItems(c);

    }

    private void updateText5(int i) {
        switch (i) {
            case 0:
                t5.setText("Во время своих путешествий вы воспользовались Правом Неожиданности и получили дитя. Это может быть мальчик — тогда вы отдали его в ведьмаки. Если это девочка,то её судьба в ваших руках.");
                break;
            case 1:
                t5.setText("В ходе охоты на чудовище ситуация обернулась против вас. Разумные чудовища вроде кладбищенских баб и катаканов могут быть очень опасны, и в итоге добычей чуть не стали вы сами.");
                break;
            case 2:
                t5.setText("Вы сражались вместе с благородным рыцарем. Возможно, вы оба этого не хотели. Возможно, это была случайность, но битва плечом к плечу с аристократом изменила ваш взгляд на рыцарей и на работу ведьмака.");
                break;
            case 3:
                t5.setText("Маги давно охотятся за секретами ведьмачьих мутаций. В какой-то момент вас захватил в плен маг — он ставил над вами эксперименты с целью раскрыть тайну мутаций.");
                break;
            case 4:
                t5.setText("Какое-то время вы служили дворянину. Платили хорошо, но вам было странно и неприятно скрывать большинство своих действий, чтобы не опозорить нанявшую вас семью, вытащив на свет божий их секреты.");
                break;
            case 5:
                t5.setText("Как-то раз вы отправились за пределы Континента — перешли Драконьи горы, Тир Тохаир, Синие горы или переплыли Великое море. Вы повидали дальние земли, неизвестные большинству.");
                break;
            case 6:
                t5.setText("Большинство ведьмаков стараются не ввязываться в серьёзные отношения. Однако вас это не остановило. Вы влюбились и даже подумывали осесть на одном месте. Вы до сих пор иногда об этом вспоминаете.");
                break;
            case 7:
                t5.setText("Вы отбивали осаду ведьмачьей крепости. Численное и силовое превосходство было не на вашей стороне, но вы всё равно остались. Вы пережили осаду, получив серьёзные ранения, но ваши товарищи умерли у вас на глазах.");
                break;
            case 8:
                t5.setText("Вы избавили город от чудовища, но люди испугались и ополчились на вас. Возможно, они даже пытались вас убить. Так или иначе, вы повидали, чем платят за добро.");
                break;
            case 9:
                t5.setText("Посёлок, который вы избавили от чудовища, встретил вас как героя. Вы не ожидали ни бесплатной выпивки, ни того, что женщины будут на вас с интересом поглядывать, но вы это получили. Больше вам не встречалось подобной доброты.");
                break;
    }}

    private void updateText4(int i) {
        int y = i + herb_mod;
        {if(y < 1) y = 0;
            else if (y == 2 || y == 3) y = 1;
        else if (y >= 4 && y <= 9) y = 2;
        else if (y >= 10) y = 3;}
        switch (y) {
            case 0:
                t4.setText("Испытание травами практически разрушило ваше тело. Вы пережили процесс, но ваши тело и разум навсегда повреждены.");
                break;
            case 1:
                t4.setText("Испытание травами у вас прошло тяжело, и ведьмаки, следившие за процессом, не были до конца уверены, что вы справитесь. Вы выжили, но разум ваш травмирован.");
                break;
            case 2:
                t4.setText("Испытание травами прошло успешно. Вы стали ведьмаком без тяжёлых последствий, если не считать воспоминания об ужасной боли.");
                break;
            case 3:
                t4.setText("Ваше тело очень хорошо отозвалось на Испытание травами, и вы получили дополнительные мутации. Вы успешно перенесли испытания, и вся испытанная боль того стоила.");
                break;
    }}

    private void updateText3(int i) {
        switch (i) {
            case 0:
                t3.setText("Вы получили травму, пробегая полосу препятствий вокруг школы. У вас сильно сломана нога, и даже после исцеления она гнётся чуть хуже.");
                break;
            case 1:
                t3.setText("Обучаясь в школе, вы прокрались в библиотеку крепости и скопировали один из секретных ведьмачьих чертежей, а копию взяли с собой.");
                break;
            case 2:
                t3.setText("В ходе обучения у вас возникло соперничество с другим будущим ведьмаком. Даже после мутаций он продолжает вас ненавидеть.");
                break;
            case 3:
                t3.setText("Вы хорошо приспособились к малым мутациям и действию мутагенных грибов, которыми вас кормили в начале обучения. Когда пришло время Испытания травами, вы были готовы"); herb_mod += 2;
                break;
            case 4:
                t3.setText("Неправильно сотворённый знак немного повредил ваше тело. Было ужасно больно, и даже после исцеления ваше значение Энергии снижено.");
                break;
            case 5:
                t3.setText("Вы были одним из лучших мечников среди сверстников, и с годами ваши навыки не притупились. Вы с лёгкостью выполняете сложные движения, пируэты и развороты.");
                break;
            case 6:
                t3.setText("У вас была аллергия на мутагенные грибы и химические составы, которые вам давали  в начале обучения. Когда пришло время Испытания травами, вам пришлось куда труднее."); herb_mod += 2;
                break;
            case 7:
                t3.setText("Во время обучения вы сдружились с другим будущим ведьмаком. Суровые испытания и опасности лишь закалили вашу дружбу.");
                break;
            case 8:
                t3.setText("Вы получили травму во время тренировки на маятнике. Вы упали со столбов и сломали несколько костей, ударившись о камни внизу. Даже после исцеления вы не столь гибки, как раньше.");
                break;
            case 9:
                t3.setText("Обучение владению мечом важно, но большую часть свободного времени вы проводили в библиотеках крепости, изучая книги о чудовищах и делая записи.");
                break;
    }}

    private void updateText1(int i) {
        if (i == 0) {
            t1.setText("Вас забрали в ведьмачью школу ещё младенцем, в возрасте от 1 до 2 лет. Вы не помните о жизни до ведьмачества, и вам не о чем вспоминать, когда приходит время Испытания травами."); herb_mod =- 2;
        } else if (i == 1) {
            t1.setText("Вас забрали в ведьмачью школу в возрасте от 4 до 6 лет. У вас есть воспоминания о нормальной жизни, что помогло при Испытании травами.");
        } else if (i == 2) {
            t1.setText("Вас забрали в ведьмачью школу довольно большим, в возрасте от 8 до 11 лет. Тренироваться вам было несколько труднее, зато воспоминания о нормальной жизнипомогли при прохождении Испытания травами."); herb_mod =+ 2;
        }
    }
    private void updateText2(int i) {
        switch (i) {
            case 0:
                t2.setText("Вы учились в Каэр Морхене в высоких Синих горах. Обучение было трудными и структурированным, основанным на очень сбалансированном подходе к ведьмачьей профессии. Вас научили бить сильно и быстро, чтобы как можно быстрее закончить охоту.");
                break;
            case 1:
                t2.setText("Вас обучали в Каэр И Серен на побережье у Драконьих гор. Ваше обучение было сосредоточено на сражении с несколькими противниками одновременно и на максимальном использовании ваших ограниченных магических способностей.");
                break;
            case 2:
                t2.setText("Вы обучались в караване Дин Марв — странствующем отряде ведьмаков, готовых работать на любого, кто заплатит, вне зависимости от задания. Мутации и обучение искалечили вашу психику, и вам постоянно приходится сдерживать свою жестокость и страсть к насилию.");
                break;
            case 3:
                t2.setText("Вы обучались в Гортур Гвед в глубоких пещерах хребта Тир Тохаир. В отличие от остальных ведьмаков, вас учили орудовать двумя клинками. Вы владеете способом убийства чудовищ, сравнимым с техникой наёмных убийц.");
                break;
            case 4:
                t2.setText("Вы проходили обучение на заснеженных вершинах гор Амелл, в Хэрн Кадух. Ваше тело способно выдерживать всевозможные повреждения, и вы можете быстро и ловко передвигаться в тяжёлой стальной броне.");
                break;
            case 5:
                t2.setText("Ведьмаки школы Мантикоры применяют в бою уникальные щиты, покрытые метеоритной сталью и инкрустированные серебром. Эти щиты ведьмаки используют для защиты себя и союзников, а также для того, чтобы атаковать ими монстров.");
                break;

            default:
                t2.setText("Выбран неизвестный индекс");
                break;
        }
    }

    private int rolld10(){
        return new Random().nextInt(10) + 1;
    }
    private int rolld6(){
        return new Random().nextInt(6) + 1;
    }

}
