public class TiraDado extends Dado {

    public void tirar() {
        setLado((int) (Math.random() * 6 + 1));
    }
}
