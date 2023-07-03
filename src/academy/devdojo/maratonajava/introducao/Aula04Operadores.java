package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *
        double num1 = 40;
        int num2 = 25;
        double soma = num1/num2;

        System.out.println(" O valor é: " + soma );

        // %
        int resto = 20%3;
        System.out.println(resto);

        // < > <= >= == !=
        boolean teste = 10>15;
        boolean teste1 = 20<50;
        boolean teste2 = 10==15;
        boolean teste3 = 10==10;

        System.out.println(teste);
        System.out.println(teste1);
        System.out.println(teste2);
        System.out.println(teste3);
    }
}
