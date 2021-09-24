import javax.swing.JOptionPane;
//1er Pilar ABSTRABCION
//Es la creacion de clases
public class Persona {

    private int id = 0;
    //2do Pilar ENCAPSULAMIENTO
    //Sirve para hacer privados metodos o atributos y los mismo SOLO podran ser modificados usando metodos set y get 
    String nombre = "";
    String apellido = "";
    short edad = 0;

    //para hacer que solo se escriba en la variable una vez!
    void setId(int valor){
        if(id <= 0){
            id = valor;
        }
    }

    public int geId(){
        return id;
    }

    void saludar(){
        JOptionPane.showMessageDialog(null,mensaje());
    }
    //se utiliza para proteger que ningun miembro que este fuera de la carpeta actual tenga acceso a nuetros metodos o atributos
    protected String imprimir(){
        return "Soy " + nombre;
    }

    //metodo privado
    private String mensaje(){
        return "Hola me llamo " + nombre +" y mi Id es: "+id;
    }
}
