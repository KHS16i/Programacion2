import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int op, id = 0, idVenta = 0, idCredito = 0, cel, buscar, x;
        float monto;
        double montoCredito = 0;
        int fecha[] = new int[3];
        int hora[] = new int[4];
        int fecha2[] = new int[3];
        int hora2[] = new int[4];
        String nombre, correo, formaPago = "", muestraFecha = "", muestraHora = "", muestraFecha2 = "", muestraHora2 = "";
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<VentasContado> vContado = new ArrayList<VentasContado>();
        List<VentasCredito> vCredito = new ArrayList<VentasCredito>();

        Calendar calendario = Calendar.getInstance();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite que desea hacer\n\n1-Registrar cliente de credito\n2-Registar ventas de contado\n3-Registar ventas de credito\n4-Salir"));
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
                                    // Salir
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
                        // Salir
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                } while (op != 5);
                break;
            case 2:
                // Registrar Ventas de Contado
                id = 0;
                do {
                    op = 0;
                    op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite con el numero correspondiente que desea hacer:\n\n1-Ver las ventas hechas de contado\n2-Registrar una nueva venta\n3-Volver al menu principal"));
                    switch (op) {
                    case 1:
                        if (vContado.isEmpty() == false) {
                            System.out.println("\nVENTAS DE CONTADO\n\n");
                            vContado.stream()
                                    .forEach(vc -> System.out.println("ID: " + vc.getId() + "\nFecha: " + vc.fecha
                                            + "\nHora: " + vc.hora + "\nMonto: $" + vc.getMonto() + "\nForma de Pago: "
                                            + vc.getFormaPago() + "\n"));
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay registro de Ventas de Contado.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 2:
                        id = id + 1;
                        muestraFecha = "";
                        muestraHora = "";

                        fecha[0] = calendario.get(Calendar.DAY_OF_MONTH);
                        fecha[1] = calendario.get(Calendar.MONTH) + 1;
                        fecha[2] = calendario.get(Calendar.YEAR);

                        hora[0] = calendario.get(Calendar.HOUR);
                        hora[1] = calendario.get(Calendar.MINUTE);
                        hora[2] = calendario.get(Calendar.SECOND);
                        hora[3] = calendario.get(Calendar.AM_PM);

                        for (int i = 0; i < fecha.length; i++) {
                            muestraFecha = muestraFecha + fecha[i] + "/";
                        }

                        for (int i = 0; i < hora.length - 1; i++) {
                            muestraHora = muestraHora + hora[i] + ":";
                        }

                        if (hora[3] == 1) {
                            muestraHora = muestraHora + " p.m.";
                        } else {
                            muestraHora = muestraHora + " a.m.";
                        }

                        monto = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto de la venta."));
                        do {
                            x = 0;
                            x = Integer.parseInt(JOptionPane
                                    .showInputDialog("Seleccione el metodo de pago\n\n1-Contado\n2-Tarjeta"));

                            switch (x) {
                            case 1:
                                formaPago = "Contado";
                                break;
                            case 2:
                                formaPago = "Tarjeta";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Por favor seleccione 1 o 2", "ERROR",
                                        JOptionPane.WARNING_MESSAGE);
                                break;
                            }
                        } while (x != 1 && x != 2);

                        vContado.add(new VentasContado(id, muestraFecha, muestraHora, monto, formaPago));
                        break;
                    case 3:
                        // Salir
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                } while (op != 3);
                break;
            case 3:
                // Registrar Ventas de Credito
                do {
                    op = 0;
                    op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite con el numero correspondiente que desea hacer:\n\n1-Mostrar lista de clientes de crédito\n2-Ver las ventas de crédito de un cliente\n3-Ver todas las ventas de crédito\n4-Registrar venta de crédito\n5-Volver al menu principal"));
                    switch (op) {

                    case 1:
                        if (clientes.isEmpty() == false) {
                            System.out.println("Total de Clientes de Credito: ");
                            System.out.println();
                            clientes.stream()
                                    .forEach(cc -> System.out.println("Nombre : " + cc.getNombre() + "\nTelefono: "
                                            + cc.getTelefono() + "\nCorreo: " + cc.getCorreo()
                                            + "\nId de Cliente de Credito: " + cc.getId() + "\n"));
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay registro de clientes de credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 2:
                        buscar = Integer.parseInt(JOptionPane
                                .showInputDialog("Digite el numero de ID del cliente para mostrar sus ventas totales"));
                        buscar = buscar - 1;

                        if (buscar < 0 || buscar >= clientes.size()) {
                            JOptionPane.showMessageDialog(null, "No hay registro de clientes de credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Ventas Totales\n\nCliente: " + clientes.get(buscar).getNombre() + "\nVentas: "
                                            + clientes.get(buscar).getVentas());
                        }
                        break;

                    case 3:
                        if (vCredito.isEmpty() == false) {
                            System.out.println("\nVENTAS TOTALES DE CREDITO\n\n");
                            vCredito.stream().forEach(vcr -> System.out.println("ID de Credito: " + vcr.getIdCredito()
                                    + "\nID Venta: " + vcr.getId() + "\nMonto Credito: $" + vcr.getMontoCredito()
                                    + "\nFecha: " + vcr.fecha + "\nHora: " + vcr.hora + "\n"));
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay registro de Ventas de Credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 4:

                        if (clientes.isEmpty() == false) {
                            idCredito = Integer.parseInt(JOptionPane
                                    .showInputDialog("Digite el ID del cliente al que desea asociar la venta"));
                            montoCredito = Double.parseDouble(
                                    JOptionPane.showInputDialog("Digite el monto de la venta de credito."));
                            for (int i = 0; i > clientes.size(); i++) {
                                if (clientes.get(i).getId() == idCredito) {
                                    clientes.get(i).setVentas(montoCredito + montoCredito);
                                }
                            }
                            idVenta = idVenta + 1;

                        } else {
                            JOptionPane.showMessageDialog(null, "No hay registro de Clientes de Credito.", "Aviso!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        muestraFecha2 = "";
                        muestraHora2 = "";

                        fecha2[0] = calendario.get(Calendar.DAY_OF_MONTH);
                        fecha2[1] = calendario.get(Calendar.MONTH) + 1;
                        fecha2[2] = calendario.get(Calendar.YEAR);

                        hora2[0] = calendario.get(Calendar.HOUR);
                        hora2[1] = calendario.get(Calendar.MINUTE);
                        hora2[2] = calendario.get(Calendar.SECOND);
                        hora2[3] = calendario.get(Calendar.AM_PM);

                        for (int i = 0; i < fecha2.length; i++) {
                            muestraFecha2 = muestraFecha2 + fecha2[i] + "/";
                        }

                        for (int i = 0; i < hora2.length - 1; i++) {
                            muestraHora2 = muestraHora2 + hora2[i] + ":";
                        }

                        if (hora2[3] == 1) {
                            muestraHora2 = muestraHora2 + " p.m.";
                        } else {
                            muestraHora2 = muestraHora2 + " a.m.";
                        }

                        vCredito.add(new VentasCredito(idCredito, montoCredito, idVenta, muestraFecha2, muestraHora2));
                        break;
                    case 5:
                        // Salir
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                } while (op != 5);
                break;
            case 4:
                // Salir
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor digite una opcion", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            }
        } while (op != 4);
    }
}
