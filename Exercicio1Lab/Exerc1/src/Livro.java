// Livro:

// Crie uma classe Livro, que possui título, autor, ano de publicação, preço e quantidade de páginas. Crie um construtor para esta classe e os métodos de acesso de todos os atributos.  
// Na classe Livro, crie um método chamado calcularPrecoPorPagina, que retorna o valor de cada página do livro, levando em conta seu preço.
// Crie nesta classe, também, um método que imprime as informações de forma clara e organizada.

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int quantidadePaginas;

    public Livro(String titulo, String autor, int anoPublicacao, double preco, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPub() {
        return anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantPag() {
        return quantidadePaginas;
    }

    public double calcularPrecoPorPagina() {
        if (quantidadePaginas == 0) {
            return 0;
        }
        return preco / quantidadePaginas;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Número de Páginas: " + quantidadePaginas);
        System.out.println("Preço por Página: R$" + calcularPrecoPorPagina());
    }

}
