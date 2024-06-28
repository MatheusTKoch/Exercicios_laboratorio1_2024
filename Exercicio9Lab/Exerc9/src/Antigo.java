//Crie a classe Antigo, que é um tipo de livro e possui um número de edição. Crie os construtores e métodos necessários. Crie o método toString.
public class Antigo extends Livro {
    private int numeroEdicao;

    public Antigo(String titulo, String autor, double preco, String dataCriacao, int numeroEdicao) {
        super(titulo, autor, preco, dataCriacao);
        this.numeroEdicao = numeroEdicao;
    }

    public int getNumEdicao() {
        return numeroEdicao;
    }

    public void setNumEdicao() {
        this.numeroEdicao = numeroEdicao;
    }
}
