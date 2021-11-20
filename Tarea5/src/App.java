import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int op, id = 0, cel, buscar;
        String nombre, correo;
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
                        nombre = JOptionPane.showInputDialog("Digite el nombre");
                        cel = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de telefono"));
                        correo = JOptionPane.showInputDialog("Digite su correo");
                        id = id + 1;

                        clientes.add(new Cliente(nombre, cel, correo, id));
                        break;
                    case 2:
                        if (clientes.isEmpty() == false) {
                            System.out.println("Total de Clientes de Credito: ");
                            System.out.println();
                            clientes.stream()
                                    .forEach(c -> System.out.println("Nombre : " + c.getNombre() + "\nTelefono: "
                                            + c.getTelefono() + "\nCorreo: " + c.getCorreo()
                                            + "\nId de Cliente de Credito: " + c.getId() + "\n"));
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay registro de clientes de credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 3:
                        buscar = Integer
                                .parseInt(JOptionPane.showInputDialog("Digite el ID del cliente que desea editar"));
                        buscar = buscar - 1;
                        if (buscar < 0 || buscar >= clientes.size()) {
                            JOptionPane.showMessageDialog(null, "No hay registro de clientes de credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            do {
                                op = 0;
                                op = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Digite que desea editar: \n\n1-Nombre\n2-Numero telefonico\n3-Correo Electronico\n4-Volver al menu anterior"));

                                switch (op) {
                                case 1:
                                    nombre = JOptionPane.showInputDialog("Digite el nombre");
                                    clientes.get(buscar).setNombre(nombre);
                                    break;
                                case 2:
                                    cel = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de telefono"));
                                    clientes.get(buscar).setTelefono(cel);
                                    break;
                                case 3:
                                    correo = JOptionPane.showInputDialog("Digite su correo");
                                    clientes.get(buscar).setCorreo(correo);
                                    break;
                                case 4:
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR",
                                            JOptionPane.ERROR_MESSAGE);
                                    break;
                                }

                            } while (op != 4);
                        }
                        break;
                    case 4:
                        buscar = Integer
                                .parseInt(JOptionPane.showInputDialog("Digite el ID del cliente que desea eliminar"));
                        buscar = buscar - 1;
                        if (buscar < 0 || buscar >= clientes.size()) {
                            JOptionPane.showMessageDialog(null, "No hay registro de clientes de credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El cliente " + clientes.get(buscar).getNombre() + " con el numero de ID "
                                            + clientes.get(buscar).getId() + " ha sido eliminado.",
                                    "Eliminar cliente", JOptionPane.OK_CANCEL_OPTION);
                            clientes.remove(buscar);
                        }

                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;

            }
        } while (op != 4);
    }
}
