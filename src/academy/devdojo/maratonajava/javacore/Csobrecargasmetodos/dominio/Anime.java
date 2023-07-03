package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     public String getTipo() {
         return tipo;
     }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void init(String nome, String tipo, int episodios){
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
    }

    public void init(String nome, String tipo, int episodios,String genero){
        this.init(nome,tipo,episodios);
        this.genero=genero;
    }
    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEpisodios());
        System.out.println(getGenero());

    }

}
