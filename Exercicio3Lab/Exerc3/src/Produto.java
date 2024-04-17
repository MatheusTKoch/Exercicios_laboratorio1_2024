// a. Crie uma classe chamada Cor, que possui 3 inteiros como atributos, sendo eles r, g e b. 

// b. Crie uma classe chamada Computador, que possui 4 atributos, sendo eles a marca, a velocidade, o ano de fabricação e um atributo que indica se o computador é novo.

// c. Crie uma classe chamada Lampada, que possui um atributo indicando se a lâmpada está ligada.

// d. Crie uma classe chamada Produto, que possui um nome, um valor, uma descrição (tipo String) e uma quantidade em estoque.

// e. Crie um construtor para cada uma das classes criadas.

// f. Crie os métodos de acesso de todos os atributos de todas as classes criadas.

public class Produto {
    private String nome;
    private int valor;
    private String descricao;
    private int quantEstoque;

    public Produto(String nome, int valor, String descricao, int quantEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantEstoque = quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuant() {
        return quantEstoque;
    }
}
