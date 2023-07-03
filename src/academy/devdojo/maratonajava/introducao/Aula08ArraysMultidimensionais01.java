package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        //31,28,31,30 dias
        int[][] dias = new int[4][4];

        for(int i=0;i< dias.length;i++){
            for (int j=0;j< dias[i].length;j++){
                dias [i][j] = i+j;
                System.out.print(dias[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
