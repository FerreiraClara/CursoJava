package academy.devdojo.maratonajava.Basico.aula04_EstruturasCondicionais;

public class ElseIf {
    public static void main(String[] args) {
        int playerAge = 6;
        String category = "";

        if (playerAge < 15) {
            category = "Categoria infantil";

        } else if (playerAge <=18) {
            category = "Categoria juvenil";

        } else if (playerAge > 18) {
            category = "Categoria adulto";
        }

        // category = playerAge < 15 ? "Categoria infantil" : playerAge <=18 ? "Categoria juvenil" : "Categoria adulto"

        System.out.println(category);
    }
}
