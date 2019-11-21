package exam04;


import exam04.service1.Service1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button btnService1;
    @FXML
    private Button btnService2;
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

        btnService1.setOnAction(btnService1EventHandler);
        btnService2.setOnAction(btnService2EventHandler);
        btn1.setOnAction(btn1EventHandler);
    }

    //필드 선언
    private EventHandler<ActionEvent> btnService1EventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("btnService1을 처리합니다.");
            Service1 service1 = new Service1();
            service1.show();

        }
    };

    private EventHandler<ActionEvent> btnService2EventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("btnService2를 처리합니다.");
        }
    };
    private EventHandler<ActionEvent> btn1EventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("집으로!!!");
        }
    };
}
