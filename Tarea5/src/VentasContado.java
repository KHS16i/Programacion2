public class VentasContado {
    private int id;
    private String fecha;
    private int hora;
    private int monto;
    private String formaPago;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

}
