package exam03;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button btnOK;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btn1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*btnOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("btnOK를 처리합니다.");
            }
        });
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("btnCancel을 처리합니다.");
            }
        });*/

        btnOK.setOnAction(btnOKEventHandler);
        btnCancel.setOnAction(btnCancelEventHandler);
        btn1.setOnAction(btn1EventHandler);
    }

    //필드 선언
    private EventHandler<ActionEvent> btnOKEventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("btnOK를 처리합니다.");
        }
    };

    private EventHandler<ActionEvent> btnCancelEventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("btnCancel을 처리합니다.");
        }
    };
    private EventHandler<ActionEvent> btn1EventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("집으로!!!");
        }
    };
}
