package fundamentos;

import java.util.Locale;

public class PrimitivosVsObjeto {

    public static void main(String[] args) {

        String s = "texto";
        String s1 = s.toUpperCase();
        System.out.println(s1);

        //Wrappers são a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);

    }
}
