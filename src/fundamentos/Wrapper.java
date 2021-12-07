package fundamentos;

public class Wrapper {

    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;
        Double d = 1234.56;


        System.out.println((byte) b);
        System.out.println(s.toString().getClass().getSimpleName());
        System.out.println(s.getClass().getSimpleName());
    }
}
