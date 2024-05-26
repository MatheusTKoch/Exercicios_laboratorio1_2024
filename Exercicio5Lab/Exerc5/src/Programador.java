public class Programador extends Pessoa {
    private String linguagemPreferida;

    public Programador(String nome, int idade, String linguagemPreferida) {
        super(nome, idade);
        this.linguagemPreferida = linguagemPreferida;
    }

    public String getLinguagem() {
        return linguagemPreferida;
    }

    public void setLinguagem(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }
}
