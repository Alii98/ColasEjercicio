package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;


public class  Controller implements Initializable {
    Cola c = new Cola(); // instancia de la clase Cola
    String cads[]={"/images/1.jpg","/images/2.jpg","/images/3.jpg","/images/4.jpg",
            "/images/5.jpg","/images/6.jpg","/images/7.jpg","/images/8.jpg"
            ,"/images/9.jpg","/images/10.jpg","/images/11.jpg","/images/12.jpg",
            "/images/13.jpg","/images/14.jpg","/images/15.jpg"}; //arreglo con la ruta de las imagenes


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

    //Método para un nuevo elemento de pantalla
    public void nuevoElemento(){
        //mesnaje que solicita el valor
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el nuevo valor"));
        int ra=(int) (Math.random()*15); //numeros aleatorios para escoger la imagen aleatoriamente
        String url = cads [ra]; // se obtiene la ruta que tiene en la posición el arreglo
        Image Img = new Image(url); // nueva imagen con la dirección
        Label label = new Label(); //nueva instancia de label
        label.setText(String.valueOf(respuesta)); // se asigna el valor al label
        VBox vBox = new VBox(); //nueva instancia de vbox
        // añadimiento de los elemtos a la interfaz
        vBox.getChildren().add(label);
        vBox.getChildren().add(new ImageView(Img));
        ColaFpn.getChildren().add(vBox);
        TextoLb.setText(c.insertar(respuesta)); //invocación del método y muestra del mensaje que retorna
    }

}


