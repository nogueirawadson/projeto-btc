package main.java.list.Pesquisa;

public class Livro {
    //Atributos

    private String titulo;

    private String autor;

    private int anoPublicacao;

    public Livro( String titulo, String autor, int anoPublicacao) {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return "Livro{" +
                "anoPublicacao=" + anoPublicacao +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
