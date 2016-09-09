package ContentPanes;


import Master.MasterController;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
/**
 * Created by user on 9/5/2016.
 * this guy creates 4 circles 4 buttons and 16 arcs
 * attached a timeline style animation to reset the
 * pane quickly to make it look like the arcs are spinning fanblades
 */
public class JavaFX_Practice_02 extends BorderPane {

    private StackPane[] stackPanes;
    private GridPane gridPane;
    private static int gridX = 0, gridY = 0;
    private boolean reversi;
    private static int[] angles;
    private int speed=5;

    public JavaFX_Practice_02() {
        angles = new int[]{0, 90, 180, 270};

        stackPanes = new StackPane[4];
        colorChanger();

        Button colorChangerButton = new Button("Reversi");
        colorChangerButton.setOnAction(e -> reversi = !reversi);
        Button fasterButton = new Button("Faster!");
        fasterButton.setOnAction(e -> {
            if(speed<10)speed++;
        });
        Button slowerButton = new Button("Slower...");
        slowerButton.setOnAction(e -> {
            if(speed>1)speed--;
        });
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e -> MasterController.closeProgram());

        HBox buttonPane = new HBox(10);
        buttonPane.setAlignment(Pos.BASELINE_CENTER);
        buttonPane.getChildren().addAll(colorChangerButton, fasterButton,slowerButton,exitButton);
        buttonPane.setPadding(new Insets(0,0,10,0));
        setBottom(buttonPane);
        setCenter(gridPane);


        Timeline tl = new Timeline();
        tl.setCycleCount(Animation.INDEFINITE);
        KeyFrame moveBall = new KeyFrame(Duration.seconds(.0200), event -> colorChanger());
        tl.getKeyFrames().add(moveBall);
        tl.play();
    }
    private void colorChanger() {
        gridPane = new GridPane();

        gridPane.setStyle("-fx-background-color: #000000;");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(100);
        gridPane.setVgap(50);
        Circle circle;
        for (StackPane stackPane : stackPanes) {
            stackPane = new StackPane();

            circle = new Circle();
            circle.setRadius(80);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);

            stackPane.getChildren().add(circle);

            Pane arcPane = new Pane();
            for (int angle : angles) {
                Arc arc = new Arc(80, 80, 70, 70, angle, 45);
                arc.setType(ArcType.ROUND);
                arc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                arcPane.getChildren().add(arc);
            }

            stackPane.getChildren().add(arcPane);

            if (gridY == 0) {
                gridY++;
            } else {
                if (gridX == 0) {
                    gridX++;
                    gridY--;
                } else {
                    gridX--;
                    gridY--;
                }
            }
            gridPane.add(stackPane, gridX, gridY);
        }
        setCenter(gridPane);
        for (int i = 0; i < 4; i++) {
            if (reversi) {
                angles[i]+=speed;
            } else angles[i]-=speed;
        }
    }
}


















