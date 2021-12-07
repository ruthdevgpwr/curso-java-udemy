package fundamentos.operadores;

public class DesafiosAritmeticos {

    public static void main(String[] args) {

        //Math.pow(a, b) - elevar a a terceira potencia - pow de power de pot�ncia.

        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O resultado � " + resultado);
    }
}
