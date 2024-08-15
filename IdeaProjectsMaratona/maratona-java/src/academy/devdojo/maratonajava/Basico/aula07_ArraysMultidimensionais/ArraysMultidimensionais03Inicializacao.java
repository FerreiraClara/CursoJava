package academy.devdojo.maratonajava.Basico.aula07_ArraysMultidimensionais;

public class ArraysMultidimensionais03Inicializacao {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];

        /*
        for (int[] arrayBase : arrayInt ) {                  // o for dá erro porque só foi gerado os espaços
            for (int num : arrayBase) {                     // na memoria ( sem definir referencia
                System.out.println(num);                   // a nenhum array/valor)
            }
        }
        */

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrayBase : arrayInt ) {
            System.out.println("");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }


    }
}
