import javax.swing.JOptionPane;

public class CartaRecomendacion extends Datos implements Imprimible {

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "CARTA DE RECOMENDACION\n\n" +
                "A quien corresponda:\n\nPor medio de la presente, extiendo mi recomendación personal a\n" + Nombre + ", con numero de cedula: " + cedula
                        + "\nquien a lo largo de los años\nque llevamos de conocernos, ha mostrado ser una persona\níntegra, responsable y trabajadora.\n\nPor todo lo anterior, le considero una gran persona digna de\nconfianza y con la aptitud y capacidad para afrontar cualquier\nresponsabilidad que se deje a su cargo. Asimismo, puedo asegurar\nque es una persona con una ética intachable.\n\nSin más por el momento, reitero mi más sincera recomendación\npara los fines que UAM considere pertinentes.\n\nAtentamente: Jherom Vega");
    }
}
