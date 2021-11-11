
public class App {
    public static void main(String[] args) throws Exception {
        Curriculum miCurriculum = new Curriculum();
        CartaRecomendacion miCartaRecomendacion = new CartaRecomendacion();
        CartaRenuncia miCartaRenuncia = new CartaRenuncia();
        CartadePresentacion miCartaPresentacion = new CartadePresentacion();

        miCurriculum.imprimir();
        miCartaRecomendacion.imprimir();
        miCartaRenuncia.imprimir();
        miCartaPresentacion.imprimir();
    }
}
