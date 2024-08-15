package academy.devdojo.maratonajava.Basico.aula03_Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // <, >, <=, >=, ==, !=

        boolean isTenBiggerThanTwenty = 10 > 20;
        System.out.println(isTenBiggerThanTwenty);

        boolean isTenSmallerThanTwenty = 10 < 20;
        System.out.println(isTenSmallerThanTwenty);

        boolean isTenBiggerOrEqualThanTwenty = 10 >= 20;
        System.out.println(isTenBiggerOrEqualThanTwenty);

        boolean isTenSmallerOrEqualThanTwenty = 10 <= 20;
        System.out.println(isTenSmallerOrEqualThanTwenty);

        boolean isTenEqualTwenty = 10 == 20;
        System.out.println(isTenEqualTwenty);

        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println(isTenDifferentFromTwenty);
    }
}
