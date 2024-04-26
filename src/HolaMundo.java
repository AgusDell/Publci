import java.util.Scanner;
import java.util.Vector;

public class HolaMundo {
    public static void main(String[] args) {

        //Hola Mundo----------------------------------------------------------------------------------------
        System.out.println("Hola Mundo\n Hola otro mundo?");

        //Declaración de variables--------------------------------------------------------------------------
        long number;
        number = 2;
        System.out.println(number);
        String string = "Caracteres";
        System.out.println(string);

        //Operadores Aritméticos-----------------------------------------------------------------------------
        int N1, N2, N3;
        N1 = 120;
        N2 = 120;
        N3 = N1 + N2;
        System.out.println("El resultado de la suma de " + N1 + " y " + N2 + " es: " + N3);

        //Condicional If-------------------------------------------------------------------------------------

        if (N1 < N2) {
            System.out.println("El N1 es menor que el N2");
        } else if (N2 < N1) {
            System.out.println("La mama de Darth");
        } else {
            System.out.println("Oseadigamos");
        }

        // Condicional Switch--------------------------------------------------------------------------------

        int dia =  34;
        String nombredia;
        switch (dia) {
            case 1: nombredia = "Lunes";
                break;
            case 2: nombredia = "Martes";
                break;
            case 3: nombredia = "Miercoles";
                break;
            case 4: nombredia = "Jueves";
                break;
            case 5: nombredia = "Viernes";
                break;
            case 6: nombredia = "Sábado";
                break;
            case 7: nombredia = "Domingo";
                break;
            default: nombredia = "Pusiste mal el número capo";
            break;
        }
        System.out.println("El día es: " + nombredia);

        /*

        El programa recomienda esta sintaxis en lugar de la habitual.
        Ni re puta idea de porque pero se ve conciso.

        String nombredia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Pusiste mal el número capo";
        };
        */

        // Scanner-------------------------------------------------------------------------------------------

        int tipo_empleado;
        Scanner Nombre_del_escaner = new Scanner(System.in);
        tipo_empleado = Nombre_del_escaner.nextInt();

        // Estructuras Repetitivas---------------------------------------------------------------------------
        // While---------------------------------------------------------------------------------------------
        int contador = 0;
        while (contador <=10){
            System.out.println("Estoy en la vuelta N°: " + contador);
            contador += 1;
        }
        // For----------------------------------------------------------------------------------------------
        //Estructura repetitiva controlada por un contador


        for (int i=0; i<=10; i++) {
            System.out.println("Vamos por la vuelta: " + i);
        }

        /*Arrays: Vectores y Matrices--------------------------------------------------------------------------
        Los vectores son un tipo de array unidimensional, es decir, si bien pueden contener
        multiples variables bajo un mismo nombre será con solamente una progresión lineal númerica
        en filas o columnas. En cambio las matrices son multidimensionales, son más similares a un libro de excel
        con sus casillas.
         */
        //Vector-----------------------------------------------------------------------------------------------
        int[] vector = new int[10];
        vector[0] = 0;
        vector[1] = 1;
        for (int i=0; i<vector.length ; i++){
              if (i > 1) {
                  vector[i] = vector[i-1] + vector[i-2];
              }
              System.out.println("El valor del vector es:" + vector[i]);
        }
        //Matrices---------------------------------------------------------------------------------------------
        int[][] matriz  = new int[3][3];


        for (int f=0; f<=2; f++) {
            for (int c=0; c<=2; c++){
                System.out.println("Ingrese el valor que desea para la posición " + f + ";" + c);
                matriz[f][c] = Nombre_del_escaner.nextInt();
            }
        }
        for (int f1=0; f1<3; f1++) {
            for (int c1 = 0; c1 < 3; c1++) {
                System.out.println("La pocisión actual es " + f1 + ";" + c1 );
                System.out.println("y su valor es: " + matriz[f1][c1]);
            }
        }




    }
}
