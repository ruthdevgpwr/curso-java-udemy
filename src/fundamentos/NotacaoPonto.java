package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();

        System.out.println(s);

        String y = "Bom dia Y".replace("X", "Gui").toUpperCase();
        System.out.println(y);
    }
}
