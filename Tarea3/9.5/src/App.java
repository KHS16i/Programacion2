import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Puntaje puntaje = new Puntaje();
        int x = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido al juego!");
        JOptionPane.showMessageDialog(null, "El jugador inicia con un total de \n" + puntaje.puntosTotal() + " puntos.");
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite \n\n1- Ganó.\n2- Perdió\n3-Reiniciar puntuacion\n4-Ver Total de puntos\n5-Salir"));
            switch (x) {
            case (1):
                puntaje.setPunto(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de puntos ganados")));
                puntaje.agregaPunto(puntaje.getPunto());
                JOptionPane.showMessageDialog(null, "El jugador tiene un total de \n" + puntaje.puntosTotal() + " puntos.");
                break;
            case (2):
                puntaje.setPunto(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de puntos perdidos")));
                puntaje.quitaPunto(puntaje.getPunto());
                JOptionPane.showMessageDialog(null, "El jugador tiene un total de \n" + puntaje.puntosTotal() + " puntos.");
                break;
            case (3):
                puntaje.inicaPuntuacion();
                JOptionPane.showMessageDialog(null, "La puntuacion se reinició con " + puntaje.getPuntos() + " puntos.");
                break;
            case (4):
                JOptionPane.showMessageDialog(null, "Total de puntos\n" + puntaje.puntosTotal());
                break;
            case (5):
                JOptionPane.showMessageDialog(null, "Gracias por usar este software!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR\nUsted no digitó una opcion");
                break;
            }

        } while (x != 5);
    }
}
