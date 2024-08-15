package academy.devdojo.maratonajava.Basico.aula05_LacosRepeticao;

public class DoWhileForm {
    public static void main(String[] args) {
        int cont = 0;

        do{
            System.out.println(cont);       // ou ++cont (não vai precisar da linha 9)
            cont++;
        } while (cont <= 10);
    }
}
