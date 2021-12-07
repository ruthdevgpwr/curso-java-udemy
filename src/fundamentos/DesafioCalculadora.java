package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    // pegar do usuário
    //num1
    //num2
    //pedir para o usuário dizer qual é a operação que ele quer fazer (+ - / *)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Informe a operação: ");
        String op = scanner.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;


        System.out.printf(" %.2f %s %.2f = %.2f", num1, op, num2, resultado);
        scanner.close();
    }
}
