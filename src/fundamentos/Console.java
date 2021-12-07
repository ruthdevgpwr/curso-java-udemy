package fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.printf("Megassena: %d %d %d %n", 1, 2, 3);
        System.out.printf("Salário: %.1f%n", 1234.5678);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Nome = " + nome);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println(idade);

        entrada.close();
    }
}
