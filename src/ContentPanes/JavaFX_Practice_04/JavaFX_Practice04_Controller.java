package ContentPanes.JavaFX_Practice_04;

import javafx.scene.layout.Pane;

/**
 * Created by user on 9/5/2016.
 */
public class JavaFX_Practice04_Controller {

    public static Pane JavaFX_Practice_04;
    public static Pane RisingPane;
    public static Pane PathTransitionPane;
    public static Pane FadeTransitionPane;
    public static Pane MyClockPane=new MyClockPane();

    static void setRisingPane() {
        RisingPane = new Pane();
    }

    static void setPathTransitionPane() {
        PathTransitionPane = new Pane();
    }

    static void setFadeTransitionPane() {
        FadeTransitionPane = new Pane();
    }

    static void setMyClockPane() {
        MyClockPane=new MyClockPane();
    }


}

