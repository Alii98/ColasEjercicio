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


    //Método para insertar un nuevo elemento con el valor como parámetro
    public boolean vacia(){
        return (frente == null); //regresa si esta vacía o no
    }

    //Método para buscar por valor en la cola
    public String buscar(){
        String resultado; //variable para guardar el resultado de la busqueda
        boolean encontrado =false; // variable para saber si se encontro el valor
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor el valor a buscar"));
        int posicion=1; // posición inicail en 1
        if(!vacia()){ // condición para saber si la cola esta vacía
            Nodo temp= frente; //creación de una cola temporal
            while(temp != null){ // ciclo para recorrer los nodos de la cola
                if(valor == temp.getValor()){ //condición para comparar los valores con el valor buscado
                    resultado = "El valor :"+ temp.getValor()+ " se encuentra en la posición : " + posicion + "\n"; // mensaje de encaontrado y la posición
                    encontrado =true; // se cambia la variable a verdadera
                    return resultado; // regresa el mensaje
                }
                temp = temp.getProx(); //obtine el siguiente valor
                posicion++; //la posicón aumenta
            }
            if(!encontrado){ //si no se encontro devuelve el mensaje
                resultado = "Valor no encontrado en la cola" ;
                return resultado;
            }
        }else { // si la cola está vacía regresa el mensaje
            resultado = "La cola está vacía.\n";
            return resultado;
        }
        return "";
    }


}
