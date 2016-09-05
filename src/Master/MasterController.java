package Master;

import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
public class MasterController extends Main{
    public void Homework01Click(){
        MasterContentPane= new StackPane();
        MasterContentPane.getChildren().add(new TableView<>());
        root.setCenter(Main.MasterContentPane);
    }
    public void ThreadPractice01Click(){
        MasterContentPane= new StackPane();
        TabPane tabPane = new TabPane();
        tabPane.setStyle("-fx-background-color: #08a4ff");
        MasterContentPane.getChildren().add(tabPane);
        root.setCenter(Main.MasterContentPane);
    }
}
