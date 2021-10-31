import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        TiraDado dadoBackgammon = new TiraDado();
        TiraDado dadoMonopoly = new TiraDado();

        int x = 4;
        int op = 0;

        x = 4;
        op = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Bienvenido\nQue desea jugar?\n\n1-Backgammon\n2-Monopoly"));
        if (op == 1) {
            JOptionPane.showMessageDialog(null, "Juguemos al Backgammon!");
            do {
                x = JOptionPane.showConfirmDialog(null, "Desea tirar el Dado?");
                if (x == 0) {
                    JOptionPane.showMessageDialog(null, dadoBackgammon.getLado());
                    dadoBackgammon.tirar();
                }
            } while (x == 0);
        }
        if (op == 2) {
            JOptionPane.showMessageDialog(null, "Juguemos al Monopoly!");
            do {
                x = JOptionPane.showConfirmDialog(null, "Desea tirar el Dado?");
                if (x == 0) {
                    JOptionPane.showMessageDialog(null, dadoMonopoly.getLado());
                    dadoMonopoly.tirar();
                }
            } while (x == 0);
        }
    }
}
