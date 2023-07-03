package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        //char = '\u0000'
        //boolean = false
        //String = null

        String[] nome = new String[3];
        nome[0] = "Thiago";
        nome[1] = "Kyler";
        nome[2] = "Jhones";

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
    }
}
