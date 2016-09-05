package Master;
/**
 * Controller for the Master Scene MasterBorderPane
 * contains methods used to set the MasterContentPane with a new Pane from the ContentPanes package
 */

import ContentPanes.JavaFX_Practice_01;
import javafx.scene.control.*;
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
    public void Homework01Click(){
        MasterContentPane= new StackPane();
        MasterContentPane.getChildren().add(new TableView<>());
        root.setCenter(MasterContentPane);
    }
    //not yet attempted
    public void ThreadPractice01Click(){
        MasterContentPane= new StackPane();
        TabPane pane = new TabPane();
        pane.setStyle("-fx-background-color: #999999");
        MasterContentPane.getChildren().add(pane);
        root.setCenter(MasterContentPane);
    }
    //first implementation
    public void Practice01Click() {
        MasterContentPane= new StackPane();
        BorderPane pane = new JavaFX_Practice_01();
        MasterContentPane.getChildren().add(pane);
        root.setCenter(MasterContentPane);
    }
}
