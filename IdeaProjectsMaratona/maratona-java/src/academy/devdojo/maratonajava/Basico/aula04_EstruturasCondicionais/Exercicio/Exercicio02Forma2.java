package academy.devdojo.maratonajava.Basico.aula04_EstruturasCondicionais.Exercicio;

//Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
//Considerando 1 como domingo
public class Exercicio02Forma2 {
    public static void main(String[] args) {
        byte weekday = 6;

        switch (weekday){
            case 1 :
            case 7 :

                System.out.println("É final de semana!");
                break;

            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :

                System.out.println("É um dia útil!");
                break;

            default:
                System.out.println("Não há dia da semana correspondente");
                break;
        }
    }
}
