//Crie uma classe chamada Churro, com os atributos sabor e preço. Crie 3 construtores (como preferir), métodos de acesso e o método toString.

public class Churro {
    private String sabor;
    private double preco;

    public Churro(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public Churro(String sabor) {
        this.sabor = sabor;
        this.preco = 7.5; 
    }

    public Churro() {
        this.sabor = "Calabresa";
        this.preco = 9;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Sabor do churros: " + getSabor() + ", Preco: " + getPreco() + "R$";
    }
}
