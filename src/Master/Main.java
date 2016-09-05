package Master;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//asdfasdfasdfas
public class Main extends Application {
    static Pane MasterContentPane;
    static Scene MasterScene;
    static BorderPane root;
    static Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

        window.setTitle("Master Control Program");
        MasterContentPane= new StackPane();
        //MasterContentPane.getChildren().add(new TableView<>());
        root.setCenter(MasterContentPane);

        MasterScene = new Scene(root);
        window.setScene(MasterScene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
