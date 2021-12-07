package fundamentos.operadores;

public class Unarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // forma pós-fixada ->  + usada no dia a dia
        a++; // incrementa o valor da variavel - a = a + 1;
        a--; //decrementar -> a = a - 1;

        //forma pré-fixada // tem mais pressa - vou incrementar/decrementar antes da comparação
        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

    }
}
