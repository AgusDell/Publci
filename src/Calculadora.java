import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        float operador1, operador2, resultado;
        int operación;
        String respuesta;
        Scanner Calculadora = new Scanner(System.in);
        respuesta = "Si";
        System.out.println("Bienvenido a tu calculadora en consola.");

        while (respuesta.equalsIgnoreCase("Si")) {

            System.out.println("Por favor, ingrese un número según que operaración desee realizar:");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");

            try {
                operación = Calculadora.nextInt();
                switch (operación) {
                    case 1:
                        System.out.println("Seleccionó realizar la suma");
                        System.out.println("Ingrese dos números por favor, a razón de uno por vez:");
                        try {
                            operador1 = Calculadora.nextFloat();
                            operador2 = Calculadora.nextFloat();
                            resultado = operador1 + operador2;
                            System.out.println("El resultado de la suma es: " + resultado);
                        } catch (Exception e){
                            System.out.println("El ingreso del usuario posee un error.");
                            System.out.println("Por favor reingrese a la calculadora y elija una de las opciones dadas.");
                            Calculadora.nextLine();
                        }
                        break;
                    case 2:
                        System.out.println("Seleccionó realizar la resta");
                        System.out.println("Ingrese dos números por favor, a razón de uno por vez:");
                        try {
                            operador1 = Calculadora.nextFloat();
                            operador2 = Calculadora.nextFloat();
                            resultado = operador1 - operador2;
                            System.out.println("El resultado de la resta es: " + resultado);
                        } catch (Exception e){
                            System.out.println("El ingreso del usuario posee un error.");
                            System.out.println("Por favor reingrese a la calculadora y elija una de las opciones dadas.");
                            Calculadora.nextLine();
                        }
                        break;
                    case 3:
                        System.out.println("Seleccionó realizar la multiplicación");
                        System.out.println("Ingrese dos números por favor, a razón de uno por vez:");
                        try {
                            operador1 = Calculadora.nextFloat();
                            operador2 = Calculadora.nextFloat();
                            resultado = operador1 * operador2;
                            System.out.println("El resultado de la multiplicación es: " + resultado);
                        } catch (Exception e){
                            System.out.println("El ingreso del usuario posee un error.");
                            System.out.println("Por favor reingrese a la calculadora y elija una de las opciones dadas.");
                            Calculadora.nextLine();
                        }
                        break;
                    case 4:
                        System.out.println("Seleccionó realizar la división");
                        System.out.println("Ingrese dos números por favor, primero el dividendo y luego el divisor:");
                        try {
                            operador1 = Calculadora.nextFloat();
                            operador2 = Calculadora.nextFloat();
                            if (operador2 == 0) {
                                System.out.println("La división por cero no esta definida, por favor terminá el secundario y volvé a intentarlo");
                            } else {
                                resultado = operador1/operador2;
                                System.out.println("El resultado de la división es: " + resultado);
                            }
                        } catch (Exception e){
                            System.out.println("El ingreso del usuario no corresponde a una de las opciones posibles.");
                            System.out.println("Por favor reingrese a la calculadora y elija una de las opciones dadas.");
                            Calculadora.nextLine();
                        }
                        break;
                    default:
                        System.out.println("El ingreso del usuario no corresponde a una opción posible");
                        continue;
                }
                System.out.println("Desea usar nuevamente la calculadora? Si/No");
                Calculadora.nextLine();
                respuesta = Calculadora.nextLine();
            } catch (Exception e) {
                System.out.println("El ingreso del usuario no corresponde a una de las opciones posibles.");
                Calculadora.nextLine();
            }
        }
        Calculadora.close();
    }
}
