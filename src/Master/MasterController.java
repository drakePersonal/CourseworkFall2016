package Master;
/**
 * Controller for the Master Scene MasterBorderPane
 * contains methods used to set the MasterContentPane with a new Pane from the ContentPanes package
 */

import ContentPanes.HomeWork_01.HomeWork_01;
import ContentPanes.*;
import ContentPanes.JavaFX_Practice_04.MyClockPane;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MasterController extends Master.Main {

    public BorderPane MasterBorderPane;
    public VBox MasterTitleVBox;
    public Label MasterLabel;
    public Label MasterProjectChoiceLabel;
    public MenuBar MasterMenuBar;
    public Menu MasterMenu285;
    public Menu HomeworkMenu285;
    public MenuItem HomeworkMenu285Item1;
    public Menu PracticekMenu285;
    public MenuItem PracticeMenu285Item1;
    public Menu MasterMenu406;
    public Menu ThreadPracticeMenu406;
    public MenuItem ThreadPractice406Item1;


    //not yet implemented
    public void Homework01Click() {
        MasterContentPane = new StackPane();
        window.setTitle("Homework 01 ~ mysql table");
        MasterContentPane.getChildren().add(new HomeWork_01());
        root.setCenter(MasterContentPane);
    }

    //first implementation
    public void Practice01Click() {
        window.setTitle("Chapter 14 Program 4");
        MasterContentPane = new JavaFX_Practice_01();
        root.setCenter(MasterContentPane);
    }

    //2nd
    public void Practice02Click() {
        window.setTitle("Chapter 14 Program 9");
        MasterContentPane = new JavaFX_Practice_02();
        root.setCenter(MasterContentPane);
    }

    public static void closeProgram() {
        window.close();
    }

    public void Practice03Click() {
        window.setTitle("Practice ~Key/Click Events");
        MasterContentPane = new JavaFX_Practice_03();
        root.setCenter(MasterContentPane);
        JavaFX_Practice_03.text.requestFocus();
    }
    //this section isn't complete yet
    //the goal of this section is to create a pane in fxml that contains 4 other panes and set them
    //each to one of the sub panes
    public void Practice04Click() {
        window.setTitle("Practice ~Animation");
        MasterContentPane=new MyClockPane();
        root.setCenter(MasterContentPane);
    }
    public void ThreadPractice01Click() {
        window.setTitle("Practice ~ Threading (flasher)");
        MasterContentPane=new Thread_Practice_01();
        root.setCenter(MasterContentPane);
    }
    public void ThreadPractice02Click() {
        window.setTitle("Practice ~ Threading (flasher)");
        MasterContentPane=new Thread_Practice_02();
        root.setCenter(MasterContentPane);
    }

    public void Practice05Click(ActionEvent actionEvent) {
        window.setTitle("Practice ~ Threading (flasher)");
        MasterContentPane=new JavaFX_Practice_05();
        root.setCenter(MasterContentPane);
    }
}
