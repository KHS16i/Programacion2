import javax.swing.JOptionPane;

public class CartadePresentacion extends Datos implements Imprimible {

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "CARTA DE PRESENTACION\n\n" +
                "Al departamento de RRHH de la empresa UAM:\n\nConsidero que las prácticas en su empresa podrían resultar muy provechosas para mi desarrollo\ny especialización tanto personal como profesional. Además, creo que yo podría aportarles la\npasión y el entusiasmo por el trabajo bien hecho, responsabilidad, habilidades y conocimientos.\n\nMe gustaría poder ampliar mi perfil como candidato en una entrevista personal. Por este motivo,\nestaré disponible al teléfono ("
                        + numeroCel + ") o por correo electrónico al (" + correo + ") .");
    }
}
