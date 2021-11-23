public class VentasContado {
    private int id;
    private float monto;
    private String formaPago;
    public String fecha;
    public String hora;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public VentasContado(int id, String fecha, String hora, float monto, String formaPago) {
        super();
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.monto = monto;
        this.formaPago = formaPago;
    }

	public VentasContado(int id2, String fecha2, String hora2) {
	}
}
