public class Generador extends Dato {

    public int generadorRandom(int r) {
        r = ((r * 25173) + 13849) % 65536;
        numRandom = r;
        return numRandom;
    }
}
