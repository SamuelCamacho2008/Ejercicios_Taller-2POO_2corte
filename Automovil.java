import java.util.Scanner;

public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private String placa = "ABC123";
    private boolean encendido;

    // Constructor
    public Automovil(String marca, String modelo, String color,String placa  ) {
        this.marca = marca;
        this.modelo = modelo;
        this.color= color;
        this.placa= placa;
        this.encendido = false;
    }

    // Método para encender el automóvil
    public void encender(String clave) {
        if (clave.equals("20120")) {
            this.encendido = true;
            System.out.println("El automóvil está encendido.");
            mostrarInfo();
        } else {
            System.out.println("Clave incorrecta. Llamando a la policía...");
        }
    }

    // Método para mostrar información del automóvil
    private void mostrarInfo() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Color: " + this.color + ", Placa:" + this.placa );
    }

   

    // Método para apagar el automóvil
    public void apagar() {
        this.encendido = false;
        System.out.println("El automóvil está apagado.");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Automovil auto = new Automovil("Toyota Supra", "2016", "blanco" , "ABC123" );
       

        System.out.print("Ingrese la clave para el auto: ");
        String clave = sc.nextLine();
        if (clave.equals("20120")) {
            System.out.println("Clave correcta.");
            
            // Elegir acción 
            System.out.println("Seleccione una opción para el auto1: 1. Encender 2. Apagar");
            int opcion1 = sc.nextInt();
            sc.nextLine(); 

            if (opcion1 == 1) {
                auto.encender(clave);
            } else if (opcion1 == 2) {
                auto.apagar();
            }
        } else {
            System.out.println("Clave incorrecta. Llamando a la policía...");
        }

    }

}
