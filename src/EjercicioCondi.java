import java.util.Scanner;

public class EjercicioCondi {
    public static void main(String[] args){
        int tipo_empleado;

            System.out.println("Ingrese el tipo de empleado con un número:");
            System.out.println("1 - Repositor");
            System.out.println("2 - Cajero");
            System.out.println("3 - Supervisor");
        Scanner teclado = new Scanner(System.in);
        tipo_empleado = teclado.nextInt();

        switch (tipo_empleado) {
            case 1: System.out.println("El sueldo para esa categoría es: $17.479" );
                break;
            case 2: System.out.println("El sueldo para esta categoría es: $25.630,89");
                break;
            case 3: System.out.println("EL sueldo para esta categoría es: $31.648,578 ");
                break;
            default: System.out.println("El número ingresado no corresponde a una categoría definida");
        }
    }
}
