package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.nome = "Jeep";
        carro.modelo = "Reneguete";
        carro.ano = 2024;

        carro1.nome = "Fiat";
        carro1.modelo = "Estrada";
        carro1.ano = 2025;

        System.out.println(carro.nome+" modelo "+carro.modelo+" do ano "+carro.ano);
        System.out.println(carro1.nome+" modelo "+carro1.modelo+" do ano "+carro1.ano);

    }
}
