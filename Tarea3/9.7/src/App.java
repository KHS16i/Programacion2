import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Generador random = new Generador();

        random.setNumero(Integer.parseInt(JOptionPane
                .showInputDialog("Digite un numero para utilizarlo como base para generar un nuevo numero random")));
        random.generadorRandom(random.getNumero());
        JOptionPane.showMessageDialog(null, random.numRandom);
    }
}
