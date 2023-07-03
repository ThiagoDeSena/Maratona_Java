package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args){
        int [] idade = new int[3];
        for(int i=0;i<3;i++){
            idade[i]=i+1;
        }

        for(int i=0;i<3;i++){
            System.out.println(idade[i]);
        }

    }
}
