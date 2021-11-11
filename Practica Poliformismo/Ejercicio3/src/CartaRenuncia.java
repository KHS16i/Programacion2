import javax.swing.JOptionPane;

public class CartaRenuncia extends Datos implements Imprimible {

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "CARTA DE RENUNCIA\n\n" +
                "Por medio del presente instrumento, comunico a mi empleador/a,\nla voluntad de terminar el contrato de trabajo vigente, por\naplicación del número 2 del artículo 159 del Código del\n\nTrabajo, esto es, renuncia voluntaria del trabajador.\n\nNombre: "
                        + Nombre + "\nNumero de Cedula: " + cedula);
    }
}
