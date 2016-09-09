package ContentPanes;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * Created by user on 9/8/2016.
 */
public class Thread_Practice_01 extends StackPane {
    private String text = "";
    public Thread_Practice_01(){
        Label lblText = new Label();
        getChildren().add(lblText);

        new Thread(() -> {
            try{
                while (true){
                    if(lblText.getText().trim().length() ==0)
                        text = "Welcome";
                    else text ="";
                    Platform.runLater(() -> lblText.setText(text));
                    Thread.sleep(200);
                }
            }catch (InterruptedException ignored){

            }
        }).start();

    }
}
