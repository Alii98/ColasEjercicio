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


public class  Controller implements Initializable {
    Cola c = new Cola(); // instancia de la clase Cola

    @FXML
    FlowPane ColaFpn;
    @FXML
    Button AgregarBtn,extraerBtn,TamañoBtn,LimpiarBtn,BuscarBtn;
    @FXML
    Label TextoLb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Eventos del los botones
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
        this.BuscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TextoLb.setText(c.buscar()); //invocación del método y muestra del mensaje que retorna
            }
        });
        this.LimpiarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            }


        });

    }
}


