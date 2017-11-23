package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by jarumy on 23/11/2017.
 */
public class Controller implements Initializable {

    @FXML
    FlowPane ColaFpn;
    @FXML
    Button AgregarBtn,extraerBtn,TamañoBtn,LimpiarBtn,BuscarBtn;
    @FXML
    Label TextoLb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        this.AgregarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nuevoElemento(); //invocación del método
            }
        });

        this.extraerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ColaFpn.getChildren().remove(0);  //remueve el primer el elemento del la pantalla
                TextoLb.setText(c.extraer()); //invocación del método y muestra del mensaje que retorna
            }
        });

        this.TamañoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TextoLb.setText(c.tamaño());//invocación del método y muestra del mensaje que retorna
            }
        });
    }
}
