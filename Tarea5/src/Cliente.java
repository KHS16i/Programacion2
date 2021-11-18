
public class Cliente {

    private String nombre;
    private int telefono;
    private String correo;
    private int id = 0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Cliente(String nombre, int telefono, String correo, int id) {
        super();
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.id = id;

    }
}
