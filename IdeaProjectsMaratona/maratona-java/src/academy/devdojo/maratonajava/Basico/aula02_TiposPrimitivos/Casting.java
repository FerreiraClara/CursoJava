package academy.devdojo.maratonajava.Basico.aula02_TiposPrimitivos;

public class Casting {
    public static void main(String[] args) {
        int age = (int) 10000000000L;
        float salaryFloat = (float) 2500.0;
        long bigNumber = (long) 250.50;

        System.out.println(age);                /* o long forçado no int não coube, então cortou os bits até caber e resultou nesse número
                                                "nada a ver" */
        System.out.println(salaryFloat);        // o double forçado no float coube
        System.out.println(bigNumber);          // cortou a parte decimal
    }
}
