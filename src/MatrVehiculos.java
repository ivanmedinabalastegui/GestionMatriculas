import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MatrVehiculos {
    ArrayList<String> ListaMatr = new ArrayList<String>();
    public void Introduccion(){
        for(int i=0; i<2; i++) {
            System.out.println();
            Scanner leer = new Scanner(System.in);
            System.out.println("Teclee nºmatrícula: ");
            String matr = leer.nextLine();
            if (matr.toUpperCase().matches("^[0-9]{4} [A-Z]{3}$")) {
                ListaMatr.add(matr);
                System.out.println("Insertado en la lista");
            } else {
                i = 3;
                System.out.println("Matrícula inválida");
            }
        }
    }

    public void Generacion(){
        String Matricula = "";
        Random rnd = new Random();
        for (int i = 0; i < 7; i++)
        {
            if(i < 4)
            {
                Matricula += rnd.nextInt(10);
            }
            else
            {
                Matricula += (char)(rnd.nextInt(91) + 65);
            }
        }
        ListaMatr.add(Matricula);
        System.out.println("Nºmatrícula generado: " + Matricula);
        System.out.println("Insertado en la lista");
    }

    public void Incremento(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Posición del nºmatrícula a incrementar: ");
        int matr = leer.nextInt();
        String nummatri = ListaMatr.get(matr);
        String nummatriF = nummatri.substring(0,4);
        String nummatriF2 = nummatri.substring(5,7);
        int matrS = Integer.parseInt(nummatriF) + 1;
        String matrI = matrS + nummatriF2;
        System.out.print("Ahora en esa posición de la lista: " + matrI);
    }

    public void Decremento(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Nºmatrícula a decrementar: ");
        int matr = leer.nextInt();
        String nummatri = ListaMatr.get(matr);
        String nummatriF = nummatri.substring(0,4);
        String nummatriF2 = nummatri.substring(5,7);
        int matrR = Integer.parseInt(nummatriF) - 1;
        String matrI = matrR + nummatriF2;
        System.out.print("Ahora en esa posición de la lista: " + matrI);
    }

    public void Eliminar(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Nºmatrícula que va a dar de baja: ");
        String matrN = leer.nextLine();
        int numero = ListaMatr.indexOf(matrN);
        System.out.println("Eliminado de la lista");
        ListaMatr.remove(numero);
    }

    public void Vaciar(){
        ListaMatr.clear();
        System.out.println("La lista ha sido vaciada por completo");
    }

    public void Mostrar(){
        if(ListaMatr.size()==0){
            System.out.println("La lista está vacía");
        } else {
            System.out.println(ListaMatr);
        }
    }
}