package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];

        int [] teste = {1,2,3};

        arrayInt[0] = new int[2];
        arrayInt[1] = teste;
        arrayInt[2] = new  int[]{4,5,6,1};

        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4}};

        for (int[] arrayBase : arrayInt2){
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
            System.out.println("\n----- ");
        }
    }
}
