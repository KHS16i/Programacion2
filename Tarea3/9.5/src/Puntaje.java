public class Puntaje extends Puntos {

    public void inicaPuntuacion(){
        setPuntos(0);
    }

    public void agregaPunto(int valor) {
        puntos = puntos + valor;
    }

    public void quitaPunto(int valor) {
        puntos = puntos - valor;
    }

    public int puntosTotal(){
        return this.puntos;
    }
}
