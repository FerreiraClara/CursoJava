package academy.devdojo.maratonajava.Basico.aula02_TiposPrimitivos.exercicio;

public class Exercicio {
    public static void main(String[] args) {
        var name = "Clara Rocha";                       //String
        var address = "Rua Joaquim Carneiro Filho";      //String
        var salary = 2350.85;                           //Float ou Double
        var salaryReceiptDate = "25/12/2022";                        //String ou separar dia, mês e ano

        var day = 25;                                   //int
        var month = 5;                                 //int
        var year = 2022;                                //int

        //variavel de referencia
        var report = "Eu, " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de "
                + salary + ", na data " + salaryReceiptDate;    //String

        System.out.println(report);

        System.out.println("Eu, " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de "
                + salary + ", na data " + salaryReceiptDate);

        System.out.println("Eu, " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de "
                + salary + ", na data " + day + "/" + month + "/" + year);

    }
}
