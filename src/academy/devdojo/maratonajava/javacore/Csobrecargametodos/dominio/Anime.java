package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
//    Sobrecarga é: método com o mesmo nome e quantidade ou tipo de parâmetros diferentes.

    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;

    public void init(String nome, String tipo, int epsodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }

    public void init(String nome, String tipo, int epsodios, String genero) {
        this.init(nome, tipo, epsodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
