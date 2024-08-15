package academy.devdojo.maratonajava.Basico.aula06_Arrays;

public class Arrays03NovaReferencia {
    public static void main(String[] args) {
        String [] name = new String[3];
        name[0] = "Clara";
        name[1] = "Rocha";
        name[2] = "Ferreira";

        String [] name2 = {"Mariana", "Rocha", "Ferreira"};

        for (int cont = 0; cont < name.length; cont++){
            System.out.println(name[cont]);
        }

        System.out.println("");

        for(int cont = 0; cont < name2.length; cont++){
            System.out.println(name2[cont]);
        }

        System.out.println("");

        name = new String[3];                       // ao fazer isso, perde os valores que estavam na memória!!

        for (int cont = 0; cont < name.length; cont++){
            System.out.println(name[cont]);
        }

    }
}
