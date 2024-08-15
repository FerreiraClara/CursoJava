package academy.devdojo.maratonajava.Basico.aula06_Arrays;

import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Arrays04NovaFormaDeInicializarEImprimir {
    public static void main(String[] args) {
        //nova forma de inicializar os arrays e imprimi-los

        int [] oldForm = new int[3];
        int [] newForm = {25, 30, 15};
        int [] newForm2 = new int[]{50, 60};
        String [] newFormString = new String[]{"Clara", "Gilda"};


        System.out.println("OldForm: ");
        for (int cont = 0; cont < oldForm.length; cont++){
            System.out.println(oldForm[cont]);
        }

        System.out.println("NewForm: ");
        for (int cont : newForm){                   // FOREACH (nova forma de escrever o for / imprimir)
            System.out.println(cont);
        }

        System.out.println("NewForm2: ");
        for (int cont : newForm2){
            System.out.println(cont);
        }

        System.out.println("NewFormString: ");
        for (String cont : newFormString) {
            System.out.println(cont);
        }

    }
}
