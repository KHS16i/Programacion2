public class VentasCredito extends VentasContado {
    private int idCredito;

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public int getIdCredito() {
        return idCredito;
    }

    @Override
    public void setMonto(int monto) {
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
    public void setHora(int hora) {
        super.setHora(hora);
    }
}
