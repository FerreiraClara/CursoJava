package academy.devdojo.maratonajava.Basico.aula05_LacosRepeticao.Exercicios;

//Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
// Condição valorPacela >=1000
public class Exercicio02 {
    public static void main(String[] args) {
        double carPrice = 60000;

        for (int installment = 1; installment <= carPrice; installment++){
            double installmentValue = carPrice / installment;

            if(installmentValue < 1000){
                break;
            }
            System.out.println("Parcela: " + installment + " R$ " + installmentValue);
        }
    }
}
