package academy.devdojo.maratonajava.Basico.aula07_ArraysMultidimensionais;

public class ArraysMultidimensionais03Inicializacao02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];
        int [] array1 = {1, 2};
        int [] array2 = {1, 2, 3};
        int [] array3 = {1, 2, 3, 4, 5, 6};

        arrayInt[0] = array1;
        arrayInt[1] = array2;
        arrayInt[2] = array3;

        for (int[] arrayBase : arrayInt ) {
            System.out.println("");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
