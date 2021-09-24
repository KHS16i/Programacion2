import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Kevin";
        estudiante.apellido = "Hernandez";
        estudiante.nota = 100.00d;
        estudiante.setId(11568);
        //resolviendo encapsulamiento
        estudiante.edad = 27;
        estudiante.setId(1234);
        //como esta encapsulado solo se puede escribir en el una vez!
        estudiante.saludar();
        JOptionPane.showMessageDialog(null, estudiante.imprimir());

        Persona persona = new Persona();
        persona.setId(3);

        verIdPersona(persona);
        verIdPersona(estudiante);   
    }
//4to Pilar POLIMORFISMO
//Sirve para que un metodo reciba infomacion de la misma familia OJO primer debe de mandarse la clase principal y luego la clase extrendida (extends)
    static void verIdPersona(Persona persona){
        JOptionPane.showMessageDialog(null, persona.geId());
        //esto pata hacer que se invierta la linea de esperar una clase principal a una extendida.
        if(persona instanceof Estudiante){
            JOptionPane.showMessageDialog(null, ((Estudiante)persona).nota);
        }
    }
}
