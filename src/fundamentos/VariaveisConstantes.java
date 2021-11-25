package fundamentos;

public class VariaveisConstantes {

    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = Math.PI;

        double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area);
    }
}
