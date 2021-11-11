import javax.swing.JOptionPane;

public class tomate extends Producto {
    public void identificar() {
        JOptionPane.showMessageDialog(null, "TOMATE");
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(cantidad);
    }

    @Override
    public void setSabor(String sabor) {
        super.setSabor(sabor);
    }

    @Override
    public void setUso(String uso) {
        super.setUso(uso);
    }

    public void ver() {
        JOptionPane.showMessageDialog(null, "TOMATE: \n\n Tipo: " + tipo + "\n" + "Cantidad: " + cantidad + "\n"
                + "Sabor: " + sabor + "\n" + "Uso: " + uso);
    }
}
