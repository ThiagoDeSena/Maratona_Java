package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        double ValorCarro = 30000;

        for (int parcela= (int) ValorCarro;parcela>=1;parcela--){
           double valorParcela = ValorCarro/parcela;

           if(valorParcela < 1000){
               System.out.println("Dentro do if");
               continue;

           }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);
        }


    }
}
