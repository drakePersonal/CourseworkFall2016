package ContentPanes;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Created by user on 9/5/2016.
 * dumb little mouse and click events
 * might be useful some day idk
 */
public class JavaFX_Practice_03 extends Pane {
    public static Text text;

    public JavaFX_Practice_03() {
        text = new Text(70, 70, "Drag me");
        text.setStyle("-fx-font-size: 70px");
        getChildren().add(text);
        setStyle("-fx-background-color: #f0ffff");
        text.setOnMouseDragged(e -> {
            text.setText("Wheeeee!!! try the D-pad");
            text.setX(e.getX());
            text.setY(e.getY());
        });
        text.setOnKeyPressed(e -> {
            try {
                switch (e.getCode()) {
                    case DOWN:
                        text.setY(text.getY() + 10);
                        text.setText("Whee? mash some characters");
                        break;
                    case UP:
                        text.setY(text.getY() - 10);
                        text.setText("Whee? mash some characters");
                        break;
                    case LEFT:
                        text.setX(text.getX() - 10);
                        text.setText("Whee? mash some characters");
                        break;
                    case RIGHT:
                        text.setX(text.getX() + 10);
                        text.setText("Whee? mash some characters");
                        break;
                    default:
                        if (Character.isLetterOrDigit(e.getText().charAt(0)))
                            text.setText(e.getText());
                        else break;
                }
            } catch (Exception ignored) {
            }
        });
    }
}
