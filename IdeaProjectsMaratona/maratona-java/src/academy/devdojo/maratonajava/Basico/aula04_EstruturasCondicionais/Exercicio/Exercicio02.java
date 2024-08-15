package academy.devdojo.maratonajava.Basico.aula04_EstruturasCondicionais.Exercicio;

//Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
//Considerando 1 como domingo
public class Exercicio02 {
    public static void main(String[] args) {
        byte weekday = 10;
        String nameWeekday = "";

        switch (weekday){
            case 1 :
                nameWeekday = "Domingo";
                break;

            case 2 :
                nameWeekday = "Segunda";
                break;

            case 3 :
                nameWeekday = "Terça";
                break;

            case 4 :
                nameWeekday = "Quarta";
                break;

            case 5 :
                nameWeekday = "Quinta";
                break;

            case 6 :
                nameWeekday = "Sexta";
                break;

            case 7 :
                nameWeekday = "Sábado";
                break;

            default:
                nameWeekday = "Não há dia da semana correspondente";
                break;
        }

        if (weekday > 1 && weekday < 7){
            System.out.println("Hoje é " + nameWeekday + ". É um dia útil!");

        } else if (weekday == 1 || weekday == 7) {
            System.out.println("Hoje é " + nameWeekday + ". É final de semana!");

        }else {
            System.out.println(nameWeekday);

        }
    }
}
