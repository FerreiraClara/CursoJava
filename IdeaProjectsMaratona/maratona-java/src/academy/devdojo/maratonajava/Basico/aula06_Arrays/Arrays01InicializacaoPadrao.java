package academy.devdojo.maratonajava.Basico.aula06_Arrays;

public class Arrays01InicializacaoPadrao {
    public static void main(String[] args) {
        // Inicialização padrão
        // byte, short, int, long, float e double -> 0
        // char -> '\u0000' ''
        // boolean -> false
        // String -> null

        int [] inteiro = new int[3];
        double [] doublee = new double[3];
        char [] charr = new char[3];
        boolean [] booleann = new boolean[3];
        String [] stringg = new String[3];

        System.out.println("Inteiros: ");
        System.out.println(inteiro[0]);
        System.out.println(inteiro[1]);
        System.out.println(inteiro[2]);

        System.out.println("Double: :");
        System.out.println(doublee[0]);
        System.out.println(doublee[1]);
        System.out.println(doublee[2]);

        System.out.println("Char: :");
        System.out.println(charr[0]);
        System.out.println(charr[1]);
        System.out.println(charr[2]);

        System.out.println("Boolean: ");
        System.out.println(booleann[0]);
        System.out.println(booleann[1]);
        System.out.println(booleann[2]);

        System.out.println("Strings: ");
        System.out.println(stringg[0]);
        System.out.println(stringg[1]);
        System.out.println(stringg[2]);
    }
}
