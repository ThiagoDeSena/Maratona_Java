package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numero = new int[3];
        int [] numero2 = {1,2,3,4,5};
        int [] numero3 = new int[]{5,4,3,2,1};

//        for(int i=numero3.length - 1;i>=0;i--){
//            System.out.println(numero3[i]);
//        }

        for(int num:numero3){
            System.out.println(numero3[num-1]);
        }
    }
}
