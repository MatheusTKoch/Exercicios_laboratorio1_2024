//Crie a classe Livro, com titulo, autor, preço e ano de criação, com os construtores e métodos necessários. Crie o método toString.
public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int dataCriacao;

    public Livro(String titulo, String autor, double preco, int dataCriacao) {
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

    public int getDataCriacao() {
        return dataCriacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Titulo do livro: " + getTitulo() + ", Autor: " + getAutor() + ", Preco: " + getPreco() + "R$, Data de Criacao: " + getDataCriacao();
    }
}
