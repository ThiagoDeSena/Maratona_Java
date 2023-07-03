package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto","Tv",300,"ação");
        anime.imprime();
    }
}
