package academy.devdojo.maratonajava.Basico.aula07_ArraysMultidimensionais;

public class ArraysMultidimensionais02Foreach {
    public static void main(String[] args) {
        int [][] dias = new int [3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 29;
        dias[1][1] = 28;
        dias[1][2] = 27;

        dias[2][0] = 26;
        dias[2][1] = 25;
        dias[2][2] = 24;

        for (int[] arrBase : dias){
            for (int j : arrBase){
                System.out.println(j);
            }
        }
    }
}
