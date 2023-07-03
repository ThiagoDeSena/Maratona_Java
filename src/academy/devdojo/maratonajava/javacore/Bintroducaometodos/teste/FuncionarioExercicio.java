package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        double media;

        funcionario.setNome("Thiago");
        funcionario.setIdade(24);
        funcionario.setSalario(new double[]{4000,5000,6000});

        funcionario.imprime();
        System.out.println("Média "+funcionario.getMedia());

    }
}
