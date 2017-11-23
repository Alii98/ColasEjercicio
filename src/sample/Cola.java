package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Alicia Flores on 23/11/2017.
 */
public class Cola  {

    private Nodo frente; //para el inicial de la cola
    private int tamaño; //para el tamaño de la cola

    //constructor con valores iniciales
    public Cola(){
        this.frente= null;
        this.tamaño = 0;
    }
    //Método para insertar un nuevo elemento con el valor como parámetro
    public String insertar(int valor){
        Nodo nuevo = new Nodo(valor); //nueva instancia de la clase Nodo
        if(frente == null ){ //condición para saber si esta vacia
            frente = nuevo; //agregamos un nuevo
        }else{
            Nodo temp = frente; //si no se crea una cola temporal con los valores del nodo
            while (temp.getProx() != null){ //ciclo para recorrer los nodos
                temp = temp.getProx(); // obtiene el siguinete nodo
            }
            temp.setProx(nuevo); // se agrega al final de la cola
        }
        tamaño++; //el tamaño aumenta
        return "Valor insertado correctamente\n"; //regresa mensaje
    }

    //Método para extraer el elemento del frente
    public String extraer(){
        if(frente == null){ //condición para saber si la cola está vacía
            return "La cola esta vacia"; // regresa mensaje
        }else{
            int valorExtraer = frente.getValor(); //variable temporal
            frente = frente.getProx(); //cambiar el frente por el siguiente
            tamaño--; //reducción del tamaño
            return "Valor extraido: "+ valorExtraer +"\n";//devolver el valor extraido de la cola
        }
    }

    public String tamaño(){
        if(!vacia()){ //condición para saber si la cola no esta vacía
            return  "El tamaño de la cola es : " + tamaño + "\n"; // regresa mensaje con el tamaño
        }else{
            return "La cola está vacia\n"; // si no regresa mensaje de cola está vacía
        }
    }

}