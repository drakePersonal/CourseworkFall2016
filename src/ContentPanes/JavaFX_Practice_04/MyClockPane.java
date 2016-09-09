package ContentPanes.JavaFX_Practice_04;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by user on 9/5/2016.
 */
public class MyClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    private double w = 250, h = 250;

    public MyClockPane() {
        setCurrentTime();
    }

    public MyClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();
    }

    private void paintClock() {
        double clockRadius = Math.min(w, h) * .8 * .5;
        double centerX = w / 2;
        double centerY = h / 2;
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text[] polarTexts = {
                new Text(centerX - 5, centerY - clockRadius + 12, "12"),
                new Text(centerX - clockRadius + 3, centerY + 5, "9"),
                new Text(centerX + clockRadius - 12, centerY + 5, "3"),
                new Text(centerX - 3, centerY + clockRadius - 6, "6")
        };

        double sLength = clockRadius * .8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY + sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        double mLength = clockRadius * .65;
        double xMinute = centerX + mLength * Math.sin(second * (2 * Math.PI / 60));
        double yMinute = centerY + mLength * Math.cos(second * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, xMinute, yMinute);
        mLine.setStroke(Color.BLUE);

        double hLength = clockRadius * .5;
        double xHour = centerX + hLength * Math.sin(second * (2 * Math.PI / 60));
        double yHour = centerY + hLength * Math.cos(second * (2 * Math.PI / 60));
        Line hLine = new Line(centerX, centerY, xHour, yHour);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle, sLine, hLine, mLine);
        getChildren().addAll(polarTexts);
    }

    private void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
        paintClock();
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        paintClock();
    }

}
