import javax.swing.JOptionPane;

public class Curriculum extends Datos implements Imprimible {
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"CURRICULUM VITAE\n\nNombre: " + Nombre + "\n" + "Numero de cedula: " + cedula
                + "\n" + "Edad: " + edad + "\n" + "Numero de telefono: " + numeroCel + "\n" + "Email: " + correo);
    }
}
