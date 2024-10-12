import java.util.Scanner;
class Maestro {
    // Atributos
    private String nombre;
    private String materia ;
    private int añosExperiencia;
    // Constructor
    public Maestro(String nombre, String  materia, int
    añosExperiencia) { 
    this.nombre = nombre;
    this.materia = materia;
    this.añosExperiencia= añosExperiencia;
    
    
    }
    // Métodos
    public void enseñar() {
    System.out.println(nombre+ "  " + "esta enseañndo " + materia);
    }
    public void evaluar() {
        System.out.println(nombre + "  " + "está evaluando exámenes de " + materia);
    }

    public void planificarClase() {
        System.out.println(nombre + "  " + "está planificando la clase de " + materia);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre del maestro: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa la materia que enseña: ");
        String materia = sc.nextLine();
        
        System.out.print("Ingresa los años de experiencia: ");
        int añosExperiencia = sc.nextInt();

        Maestro profesor = new Maestro(nombre, materia, añosExperiencia);

        profesor.enseñar();
        profesor.evaluar();
        profesor.planificarClase();
      
    }

}