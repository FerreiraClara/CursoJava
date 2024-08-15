package academy.devdojo.maratonajava.Basico.aula04_EstruturasCondicionais.Exercicio;

/*Dado um determinado salário, calcule o valor a ser pago de acordo com as informações a seguir:
* De 0 a 34.712 -> taxa de 9.70%
* De 34.713 a 68.507 -> taxa de 37.35%
* De 68.508 para cima -> taxa de 49.50%
*/

public class Exercicio01 {
    public static void main(String[] args) {
        double AnnualSalary = 70000;
        double rate = 0;
        double amountBePay = 0;

        if (AnnualSalary <= 34712) {
            rate = 0.097;
            amountBePay = AnnualSalary * rate;

        } else if (AnnualSalary >= 34713 && AnnualSalary <= 68507) {
            rate = 0.3735;
            amountBePay = AnnualSalary * rate;

        } else if (AnnualSalary >= 68508) {
            rate = 0.495;
            amountBePay = AnnualSalary * rate;

        }

        System.out.println("O valor a ser pago é: " + amountBePay);

    }
}
