import java.util.Scanner;

public class Piloto {
    static String BOLD ="\033[1m";
    static String UNDERLINE ="\033[4m";
    static String END ="\033[0m";
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        String argu1 = args[0];
        String argu2 = args[1];
        MatrVehiculos metodos = new MatrVehiculos();
        System.out.println("\t\t\t\t" +UNDERLINE +BOLD +"PROGRAMA MATRÍCULAS" +END);
        do {
            System.out.println();
            System.out.println("\t\t\t\t\t" + BOLD + "Menú de Opciones" + END);
            System.out.println("\t\t\t\t\t" + BOLD + "================" + END);
            System.out.println();
            System.out.println("1) Introducción de dos números de matrícula");
            System.out.println("2) Generación aleatoria de un número de matrícula");
            System.out.println("3) Incremento de un número de matrícula");
            System.out.println("4) Decremento de un número de matrícula");
            System.out.println("5) Eliminado de un número de matrícula");
            System.out.println("6) Vaciado de la lista completa de matrículas");
            System.out.println("7) Mostrar la lista de las matrículas");
            System.out.println("8) Salir");
            System.out.println("Opción:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    metodos.Introduccion();
                    break;
                case 2:
                    metodos.Generacion();
                    break;
                case 3:
                    metodos.Incremento();
                    break;
                case 4:
                    metodos.Decremento();
                    break;
                case 5:
                    metodos.Eliminar();
                    break;
                case 6:
                    metodos.Vaciar();
                    break;
                case 7:
                    metodos.Mostrar();
                    break;
                case 8:
                    System.out.println(BOLD + "Saliendo del programa" + END);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Número no válido");
            }
        } while (opcion < 3);
    }
}