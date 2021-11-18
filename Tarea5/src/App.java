import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int op, id = 0;
        List<Cliente> clientes = new ArrayList<Cliente>();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite que desea hacer\n\n1-Registrar cliente de credito\n2-Registar cliente de contado\n3-Registar ventas de credito\n4-Salir"));
            switch (op) {
            case 1:
                do {
                    op = 0;
                    op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite con el numero correspondiente que desea hacer:\n\n1-Registro de nuevo cliente de crédito\n2-Ver todos los clientes de crédito registrados\n3-Modificar un cliente de crédito\n4-Eliminar un cliente de crédito\n5-Volver al menu principal"));
                    switch (op) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Digite el nombre");
                        int cel = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de telefono"));
                        String correo = JOptionPane.showInputDialog("Digite su correo");
                        id = id + 1;

                        clientes.add(new Cliente(nombre, cel, correo, id));
                        break;
                    case 2:
                        System.out.println("Total de Clientes de Credito: ");
                        System.out.println();
                        clientes.stream()
                                .forEach(c -> System.out.println(
                                        "Nombre : " + c.getNombre() + "\nTelefono: " + c.getTelefono() + "\nCorreo: "
                                                + c.getCorreo() + "\nId de Cliente de Credito: " + c.getId() + "\n"));

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;
                    }
                } while (op != 5);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;

            }
        } while (op != 4);
    }
}
