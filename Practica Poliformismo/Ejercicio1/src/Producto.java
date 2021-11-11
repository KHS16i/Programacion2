public abstract class Producto {
    String tipo;
    int cantidad;
    String sabor;
    String uso;

    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

}
