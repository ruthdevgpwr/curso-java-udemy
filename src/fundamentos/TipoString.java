package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá, pessoal ".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("dia"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Ruth";
        var sobrenome = "Dantas";
        var idade = 29;
        var salario = 123445.987;

        System.out.println("Nome: " + nome + "\nSobrenome: "
                            + sobrenome + "\nSalario: " + salario + "\n\n");

        //uma forma de não precisar ficar dando quebra de linha com \n e nem espaço:

        System.out.printf("A senhora %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
        //%.2f - dizer quantas casas decimais eu quero que tenha na String

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6, 8));
    }
}
