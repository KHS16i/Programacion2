import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        tomate miTomate = new tomate();
        Cebolla miCebolla = new Cebolla();
        Manzana miManzana = new Manzana();

        miTomate.identificar();
        miTomate.tipo = JOptionPane.showInputDialog(null, "Digite tipo de Producto");
        miTomate.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad disponible del Producto"));
        miTomate.sabor = JOptionPane.showInputDialog(null, "Digite el sabor del Producto");
        miTomate.uso = JOptionPane.showInputDialog(null, "Digite el uso qu se le da al Producto");

        miCebolla.identificar();
        miCebolla.tipo = JOptionPane.showInputDialog(null, "Digite tipo de Producto");
        miCebolla.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad disponible del Producto"));
        miCebolla.sabor = JOptionPane.showInputDialog(null, "Digite el sabor del Producto");
        miCebolla.uso = JOptionPane.showInputDialog(null, "Digite el uso qu se le da al Producto");

        miManzana.identificar();
        miManzana.tipo = JOptionPane.showInputDialog(null, "Digite tipo de Producto");
        miManzana.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad disponible del Producto"));
        miManzana.sabor = JOptionPane.showInputDialog(null, "Digite el sabor del Producto");
        miManzana.uso = JOptionPane.showInputDialog(null, "Digite el uso qu se le da al Producto");

        miTomate.ver();
        miCebolla.ver();
        miManzana.ver();
    }   
}
