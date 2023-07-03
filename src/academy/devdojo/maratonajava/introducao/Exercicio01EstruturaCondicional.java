package academy.devdojo.maratonajava.introducao;

public class Exercicio01EstruturaCondicional {
    public static void main(String[] args){
        double salario=3500*12, taxa=0;

        if(salario<=37149){
            taxa = salario*0.0928;
        }else if(salario<=73031){
            taxa = salario*0.3693;
        }else{
            taxa = salario*0.495;
        }

        System.out.println("A taxa Netherlands paga é de: €"+ taxa);
    }
}
