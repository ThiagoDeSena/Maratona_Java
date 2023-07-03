package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Venceslau";
        professor.idade = 42;
        professor.sexo = 'M';

        System.out.println(professor.nome + ", " +professor.idade + " anos, sexo = "+professor.sexo);
    }
}
