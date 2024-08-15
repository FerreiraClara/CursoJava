package academy.devdojo.maratonajava.Basico.aula05_LacosRepeticao.Exercicios;

// imprima todos os numeros pares de 1 a 50
public class Exercicio01 {
    public static void main(String[] args) {
        int cont = 0;

        for(cont = 0; cont <= 50; cont++) {

            if(cont % 2 == 0){
                System.out.println(cont);
            }
        }
    }
}
