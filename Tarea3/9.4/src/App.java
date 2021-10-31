import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Gestion gestion = new Gestion();
        JOptionPane.showMessageDialog(null, "Bienvenido a la Banca en Linea");
        gestion.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        gestion.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de cedula")));
        gestion.setNumCuenta(
                JOptionPane.showInputDialog("Digite el numero de cuenta al que quiere agregar o retirar dinero"));
        int x = 0;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite \n\n1- Depositar dinero a la cuenta.\n2- Retirar dinero de la cuenta\n3-Ver Estado de Cuenta\n4-Salir"));
            switch (x) {
            case (1):
                gestion.setDinero(Integer
                        .parseInt(JOptionPane.showInputDialog("Digite el monto en dolares que desea depositar")));
                gestion.agregaDinero(gestion.getDinero());
                break;

            case (2):
                gestion.setDinero(
                        Integer.parseInt(JOptionPane.showInputDialog("Digite el monto en dolares que desea retirar")));
                gestion.retirarDinero(gestion.getDinero());
                if (gestion.cuentaNegativa() == true) {
                    JOptionPane.showMessageDialog(null, "ADVERTENCIA:\nLa actual cuenta ahora se encuentra en numeros negativos");
                }
                break;
            case (3):
                JOptionPane.showMessageDialog(null,
                        "Estado de cuenta actual:\n\nNombre: " + gestion.getNombre() + "\nCedula: " + gestion.getId()
                                + "\nNumero de cuenta: " + gestion.getNumCuenta() + "\nSaldo: $"
                                + gestion.estadoCuenta());
                break;
            case (4):
                JOptionPane.showMessageDialog(null, "Gracias por preferirnos!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR\nUsted no digitó una opcion");
                break;
            }
        } while (x != 4);
    }
}
