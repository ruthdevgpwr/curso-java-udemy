package fundamentos.operadores;

public class DesafiosLogicos {

    public static void main(String[] args) {

        //TRabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;

        System.out.println("Comprou TV 50? " + comprouTv50);
        System.out.println("Comprou TV 32? " + comprouTV32);
    }
}
