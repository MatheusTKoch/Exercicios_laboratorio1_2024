//Crie a classe Livro, com titulo, autor, preço e ano de criação, com os construtores e métodos necessários. Crie o método toString.
public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private String dataCriacao;

    public Livro(String titulo, String autor, double preco, String dataCriacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.dataCriacao = dataCriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    
}
