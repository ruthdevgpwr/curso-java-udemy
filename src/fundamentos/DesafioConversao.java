package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro sal�rio: ");
        String valor1 = scanner.next().replace(",", ".");

        System.out.println("Informe o segundo sal�rio: ");
        String valor2 = scanner.next().replace(".", ".");

        System.out.println("Informe o terceiro sal�rio: ");
        String valor3 = scanner.next().replace(".", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A m�dia dos sal�rios � " + media);

        scanner.close();
    }
}
