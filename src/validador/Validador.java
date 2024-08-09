package validador;

import java.util.Scanner;

public class Validador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=================================================== <[Entrada]> ==================================================");
        System.out.print("Intoduzca un numero: ");
        String num = scan.next();

        if (!num.matches("\\d+")) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
            return;
        }

        String cadenaInvertida = new StringBuilder(num).reverse().toString();
        int sumaTotal = 0;

        for (int i = 0; i < cadenaInvertida.length(); i++) {
            char digitoChar = cadenaInvertida.charAt(i);
            int digito = Character.getNumericValue(digitoChar);

            if (i % 2 == 1) {
                digito *= 2;
                if (digito > 9) {
                    digito = (digito / 10) + (digito % 10);
                }
            }

            sumaTotal += digito;
        }

        System.out.println("=================================================== <[Validacion]> ===============================================");
        if (sumaTotal % 10 == 0) {
            System.out.println("El número " + num + " es una tarjeta válida.");
        } else {
            System.out.println("El número " + num + " no es una tarjeta válida.");
        }
            System.out.println("==================================================================================================================");
    }
}
