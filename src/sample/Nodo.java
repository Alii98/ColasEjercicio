package sample;

/**
 * Created by Alicia Flores on 23/11/2017.
 */
public class Nodo {
        private int valor;
        private sample.Nodo prox;

        public Nodo (){
            this.valor = 0;
            this.prox  = null;
        }

        public Nodo (int v){
            this.valor = v;
            this.prox= null;
        }

        public void setValor(int v) {

            valor = v;
        }
        public void setProx(sample.Nodo prox)
        {
            this.prox = prox;
        }

        public int getvalor()
        {
            return valor;
        }
        public sample.Nodo getProx()
        {
            return prox;
        }

    }

