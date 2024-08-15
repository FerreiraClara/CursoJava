package academy.devdojo.maratonajava.Basico.aula06_Arrays;

public class Arrays02ImpressaoFor {
    public static void main(String[] args) {
        String [] name = new String[3];

        for(int cont = 0; cont < name.length; cont++){
            System.out.println(name[cont]);
        }

        name[0] = "Clara";
        name[1] = "Rocha";
        name[2] = "Ferreira";

        for(int cont = 0; cont < name.length; cont++){
            System.out.println(name[cont]);
        }
    }
}
