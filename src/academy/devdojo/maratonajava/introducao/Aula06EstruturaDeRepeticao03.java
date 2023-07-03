package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        double ValorCarro = 20000;

        for (int parcela=1;parcela<=ValorCarro;parcela++){
            double ValorParcela = ValorCarro/parcela;
            if(ValorParcela>=1000){
                System.out.println(parcela + " parcela de R$ " + ValorParcela );
            }else{
                System.out.println("Fim do programa!");
                break;
            }
        }


    }
}
