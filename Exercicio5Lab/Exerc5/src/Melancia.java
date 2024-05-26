public class Melancia extends Fruta {
    private double precoAdicional;
    private boolean estaNaEpoca;

    public Melancia(String nome, double preco, double precoAdicional, boolean estaNaEpoca) {
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.estaNaEpoca = estaNaEpoca;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public boolean getEpocaFruta() {
        return estaNaEpoca;
    }

    
}
