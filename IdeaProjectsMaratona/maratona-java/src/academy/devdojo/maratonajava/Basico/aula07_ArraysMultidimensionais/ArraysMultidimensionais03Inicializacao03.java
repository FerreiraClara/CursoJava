package academy.devdojo.maratonajava.Basico.aula07_ArraysMultidimensionais;

public class ArraysMultidimensionais03Inicializacao03 {
    public static void main(String[] args) {
        int [][] arrayInt = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}, {8, 5, 6, 9}};

        for (int[] arrayBase : arrayInt ) {
            System.out.println("");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        System.out.println("");
        System.out.println("Quantas posições tem o arrayInt: " + arrayInt.length);
        System.out.println("Quantas posições tem o arrayInt[0]: " + arrayInt[0].length);
        System.out.println("Quantas posições tem o arrayInt[1]: " + arrayInt[1].length);
        System.out.println("Quantas posições tem o arrayInt[2]: " + arrayInt[2].length);
        System.out.println("Quantas posições tem o arrayInt[3]: " + arrayInt[3].length);
    }
}
