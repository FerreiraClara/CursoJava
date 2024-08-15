package academy.devdojo.maratonajava.Basico.aula02_TiposPrimitivos;

public class TiposPrimitivos {
    /**atalho psvm*/
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long bigNumber = 100000;           // pode por L no final ou não
        double salaryDouble = 2000.0;     // por padrão, é D. Logo, não é obrigatório por D no final ( 2000.0D)
        float salaryFloat = 2000.0F;    // obrigatório colocar o F
        byte ageByte = 127;              // de -128 a 127
        short ageShort = 32000;
        char character = 'F';
        char characterASC = 65;
        char characterUnicode = '\u0043';
        boolean trustful = true;
        boolean untrue = false;

        System.out.println(age);
        System.out.println("A idade é " + age + " anos");

        System.out.println(trustful);
        System.out.println(untrue);

        System.out.println(character);
        System.out.println(characterASC);
        System.out.println(characterUnicode);



    }
}
