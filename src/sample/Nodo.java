package sample;

/**
 * Created by Alicia Flores on 23/11/2017.
 */
public class Nodo {
    private int valor;//valor que se va guardar
    private Nodo prox;// puntero hacia el siguiente nodo

    //constructor, inicializa sin valor
    public Nodo (){
        this.valor = 0;
        this.prox  = null;
    }

    //constructor para darle valor al nodo
    public Nodo (int v){
        this.valor = v;
        this.prox= null;
    }

    //Métodos setters and getters de las variables
    public void setValor(int v) {

        valor = v;
    }
    public void setProx(Nodo prox)
    {
        this.prox = prox;
    }

    public int getValor()
    {
        return valor;
    }
    public Nodo getProx()
    {
        return prox;
    }
}
