package academy.devdojo.maratonajava.Basico.aula03_Operadores;

public class OperadoresAritméticos {
    public static void main(String[] args) {
        // +, -, /, *, %
        int num1 = 10;
        int num2 = 20;

        int resSoma = num1 + num2;
        int resSub = num1 - num2;
        double resDiv = num1 / (double) num2;             // a divisao de dois numeros inteiros == numero inteiro
        int resMult = num1 * num2;

        System.out.println("Usando os valores armazenados na variavel:");
        System.out.println(resSoma);
        System.out.println(resSub);
        System.out.println(resDiv);
        System.out.println(resMult);

        System.out.println("Fazendo a conta no println:");
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / (double) num2);
        System.out.println(num1 * num2);

        System.out.println("Usando os valores armazenados na variavel com concatenação:");
        System.out.println("O resultado da soma é " + resSoma);
        System.out.println(resSoma + " é o resultado da soma");

        System.out.println("Fazendo a conta no println com concatenação:");
        System.out.println("O resultado da soma é " + num1 + num2);                     //vai dar problema
        System.out.println(num1 + num2 + " é o resultado da soma");
        System.out.println(num1 + num2 + " é o resultado da soma." + num1 + num2);      /*tudo o que está depois da
                                                                                        string é concatenado*/

        //operador %

        int rest = 20 % 2;
        System.out.println(rest);

        int rest1 = 20 % 3;
        System.out.println(rest1);


    }
}
