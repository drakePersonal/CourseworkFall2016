package ContentPanes;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Created by user on 9/5/2016.
 */
public class JavaFX_Practice_01 {
    //any of the classes in this directory should have some public pane available to slap on the MasterContentPane
    public BorderPane pane;

    public JavaFX_Practice_01(){
        try {
            initializePane();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Label[] labels;
    private Font font;
    private HBox labelPane;


    private void initializePane() {
        font = new Font("Times New Roman", 15);
        labels = new Label[5];
        pane = new BorderPane();

        colorChanger();

        Button colorChangerButton = new Button("Click Me");
        colorChangerButton.setOnAction(e -> colorChanger());

        HBox buttonPane = new HBox(10);
        buttonPane.setAlignment(Pos.BASELINE_CENTER);
        buttonPane.getChildren().addAll(colorChangerButton);

        pane.setBottom(buttonPane);
        pane.setCenter(labelPane);
        pane.setStyle("#Master");//Color.WHITE);
    }

    private void colorChanger() {
        labelPane = new HBox(10);
        labelPane.setAlignment(Pos.CENTER);
        for (Label label : labels) {
            label = new Label("JavaFX");
            label.setFont(font);
            label.setTextFill(Color.color(Math.random(), Math.random(), Math.random()));
            label.setRotate(90);
            labelPane.getChildren().add(label);
            labelPane.setAlignment(Pos.CENTER);
        }
        pane.setCenter(labelPane);
    }
}
