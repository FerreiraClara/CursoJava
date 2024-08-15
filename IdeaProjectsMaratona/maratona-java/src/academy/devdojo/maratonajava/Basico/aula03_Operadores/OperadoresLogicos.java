package academy.devdojo.maratonajava.Basico.aula03_Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // && (and), || (or), !

        int age = 20;
        char sex = 'M';
        boolean isWomanBiggerThan30 = age > 30 && sex == 'F';
        boolean isWomanSmallerThan30 = age < 30 && sex == 'F';
        boolean isManBiggerThan30 = age > 30 && sex == 'M';
        boolean isManSmallerThan30 = age < 30 && sex == 'M';

        System.out.println("Mulher maior que 30 anos: " + isWomanBiggerThan30);
        System.out.println("Mulher menor que 30 anos: " + isWomanSmallerThan30);
        System.out.println("Homem maior que 30 anos: " + isManBiggerThan30);
        System.out.println("Homem menor que 30 anos: " + isManSmallerThan30);


        double checkingAccount = 300;
        double savings = 8000;
        double playstationValue = 5000;
        boolean isBuyPlaystation = checkingAccount >= playstationValue || savings >= playstationValue;

        System.out.println("É possível comprar o playstation: " + isBuyPlaystation);

    }
}
