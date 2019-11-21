package syk.sample.gcs.service3;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Service3 {
    //Field
    private Stage stage;

    //Constructor
    public Service3(){
        try {
            stage = new Stage(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            BorderPane pane = (BorderPane) FXMLLoader.load(getClass().getResource("Service3.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.setResizable(false);
        } catch (Exception e) {}
    }

    //Method
    public void show() {
        stage.show();
    }

    public void close() {
        stage.close();
    }
}
