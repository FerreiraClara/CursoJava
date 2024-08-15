package academy.devdojo.maratonajava.Basico.aula05_LacosRepeticao;

//imprima os 25 primeiros numeros de um dado valor. Por exemplo, 50.
public class Breakk {
    public static void main(String[] args) {
        double maxValue = 2000;

        for (int i = 0; i <= maxValue; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
