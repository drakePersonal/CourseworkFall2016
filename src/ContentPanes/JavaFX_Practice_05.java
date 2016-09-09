package ContentPanes;

import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;

/**
 * Created by user on 9/8/2016.
 * this is a dumb page that shows a big text area
 */
public class JavaFX_Practice_05 extends StackPane{
    TextArea box;

    public JavaFX_Practice_05() {
        setStyle("-fx-background-color: WHITE");
        box = new TextArea();
        box.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

            }
        });
        //box.setText("asdfasdfasdfasdfasdf");
        //box.setMinSize(10,100);
        //box.setMaxWidth(600);
        box.setText("eeeee");
        box.appendText("asdfasdfasdf");

        box.setWrapText(true);
        getChildren().add(box);

    }
}
