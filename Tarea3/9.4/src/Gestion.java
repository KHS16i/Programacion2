public class Gestion extends Cuenta {

    public void agregaDinero(int valor) {
        estadoCuenta = estadoCuenta + valor;
    }

    public void retirarDinero(int valor) {
        estadoCuenta = estadoCuenta - valor;
    }

    public int estadoCuenta() {
        return this.estadoCuenta;
    }

    public boolean cuentaNegativa() {
        if (estadoCuenta < 0) {
            return true;
        } else {
            return false;
        }
    }
}
