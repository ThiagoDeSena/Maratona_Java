package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i=0;i< salario.length;i++){
            System.out.println(salario[i] +" ");
        }
    }

    public void imprimeMedia(){

        for (int i=0;i< salario.length;i++){
            media=media+salario[i];
        }
        media=media/3;
        System.out.println("Média do Salário "+ media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        for (int i=0;i< salario.length;i++){
            media=media+salario[i];
        }
        media=media/3;
        return media;
    }

}
