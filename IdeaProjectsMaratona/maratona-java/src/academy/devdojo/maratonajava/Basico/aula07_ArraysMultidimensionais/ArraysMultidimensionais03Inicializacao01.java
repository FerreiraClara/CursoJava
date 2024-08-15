package academy.devdojo.maratonajava.Basico.aula07_ArraysMultidimensionais;

public class ArraysMultidimensionais03Inicializacao01 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];

        arrayInt[0] = new int[] {1, 2};                   // não dá para definir direto porque não reconhece como array,
        arrayInt[1] = new int[] {1, 2, 3};               // ao tentar por arrayInt[0] = {1, 2}, por exemplo,
        arrayInt[2] = new int[] {1, 2, 3, 4, 5, 6};     // vai dar erro.

        for (int[] arrayBase : arrayInt ) {
            System.out.println("");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }


    }
}
