public class VentasCredito extends VentasContado {

    private int idCredito;
    private double montoCredito;

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setMontoCredito(double montoCredito) {
        this.montoCredito = montoCredito;
    }

    public double getMontoCredito() {
        return montoCredito;
    }

    @Override
    public void setMonto(float monto) {
        super.setMonto(monto);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setFecha(String fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void setHora(String hora) {
        super.setHora(hora);
    }

    public VentasCredito(int idCredito, double montoCredito, int id, String fecha, String hora) {
        super(id, fecha, hora);
        this.idCredito = idCredito;
        this.montoCredito = montoCredito;
    }
}
