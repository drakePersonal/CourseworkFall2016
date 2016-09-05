/**************************************************************************************************
 * The point of this project is to organize all the small apps and stuff into one larger program. *
 * Ideally this will serve as practice on a number of things not the least of which is git.       *
 * Anyway everyone keeps saying I need to set one up so here's a project for repo                 *
 * I will make sure not to commit anything until after any due dates                              *
 * created by User                                                                                *
 **************************************************************************************************/
package Master;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//main class pretty much starts up the app
//the basic plan is to use the root as a constant container for the app
//with a bar that has methods in the controller
//to switch the view of the MasterContentPane between different projects I work through
public class Main extends Application {
    public static Pane MasterContentPane;
    static BorderPane root;
    private static Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        window.setOnCloseRequest(e -> {
            e.consume();
            window.close();
        });
        window.setTitle("Master Control Program");
        MasterContentPane= new StackPane();

        root.setCenter(MasterContentPane);

        Scene masterScene = new Scene(root);
        window.setScene(masterScene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
