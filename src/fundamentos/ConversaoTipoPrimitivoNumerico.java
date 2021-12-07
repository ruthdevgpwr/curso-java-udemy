package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.2345678999; //explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        int f = 130; //explicita (CAST)
        byte g = (byte) f;
        System.out.println(g);

    }
}
