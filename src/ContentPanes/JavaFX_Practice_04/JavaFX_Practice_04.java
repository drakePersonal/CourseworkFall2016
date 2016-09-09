package ContentPanes.JavaFX_Practice_04;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;
/**
 * Created by user on 9/5/2016.
 */
public class JavaFX_Practice_04 extends Pane{

    static Pane pane;
    public JavaFX_Practice_04(){
        try {
            pane=FXMLLoader.load(getClass().getResource("Practice04_Split.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.getChildren().clear();
        this.getChildren().add(pane);
    }
}
