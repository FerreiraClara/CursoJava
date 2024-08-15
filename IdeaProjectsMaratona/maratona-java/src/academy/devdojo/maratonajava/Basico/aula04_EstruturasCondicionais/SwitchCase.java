package academy.devdojo.maratonajava.Basico.aula04_EstruturasCondicionais;

//imprima o dia da semana, considerando 1 como domingo.
public class SwitchCase {
    public static void main(String[] args) {
        byte weekday = 1;
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

        System.out.println(nameWeekday);


        char sex = 'g';

        switch (sex){
            case 'M':
                System.out.println("Homem");
                break;

            case 'F':
                System.out.println("Mulher");
                break;

            default:
                System.out.println("Caractere não identificado. Digite F para feminino ou M para masculino!");
                break;
        }

    }
}
