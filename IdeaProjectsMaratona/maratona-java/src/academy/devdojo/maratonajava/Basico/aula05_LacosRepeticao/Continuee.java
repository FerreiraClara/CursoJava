package academy.devdojo.maratonajava.Basico.aula05_LacosRepeticao;

public class Continuee {
    public static void main(String[] args) {
        double carPrice = 60000;

        for (int installment = (int) carPrice; installment >= 1; installment--){
            double installmentValue = carPrice / installment;

            if(installmentValue < 1000){
                continue;
            }
            System.out.println(installmentValue + "Parcela: " + installment + " R$ " + installmentValue);
        }
    }
}
