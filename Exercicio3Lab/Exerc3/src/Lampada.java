// a. Crie uma classe chamada Cor, que possui 3 inteiros como atributos, sendo eles r, g e b. 

// b. Crie uma classe chamada Computador, que possui 4 atributos, sendo eles a marca, a velocidade, o ano de fabricação e um atributo que indica se o computador é novo.

// c. Crie uma classe chamada Lampada, que possui um atributo indicando se a lâmpada está ligada.

// d. Crie uma classe chamada Produto, que possui um nome, um valor, uma descrição (tipo String) e uma quantidade em estoque.

// e. Crie um construtor para cada uma das classes criadas.

// f. Crie os métodos de acesso de todos os atributos de todas as classes criadas.

public class Lampada {
    private boolean ligada;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean getLigada() {
        return ligada;
    }
}
