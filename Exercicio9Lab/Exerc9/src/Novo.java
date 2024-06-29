//Crie a classe Novo, que é um tipo de livro e possui um valor de desconto. Crie os construtores e métodos necessários. Crie o método toString.
public class Novo extends Livro {
    private double valorDesconto;

    public Novo(String titulo, String autor, double preco, String dataCriacao, double valorDesconto) {
        super(titulo, autor, preco, dataCriacao);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto() {
        this.valorDesconto = valorDesconto;
    }

    public String toString() {
        return toString() + "Valor do desconto: " + getValorDesconto() + "R$";
    }
}
