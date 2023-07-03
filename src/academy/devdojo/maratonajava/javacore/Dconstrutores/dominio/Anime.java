package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios,String genero){
        this();
        this.nome = nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero=genero;
    }

    public Anime(String nome, String tipo, int episodios,String genero,String estudio){
        this(nome, tipo,episodios,genero);
        this.nome = nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero=genero;
        this.estudio=estudio;
    }

    public Anime(){
        System.out.println("Dentro do Construtor");
    }

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


    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEpisodios());
        System.out.println(getGenero());

    }

}
