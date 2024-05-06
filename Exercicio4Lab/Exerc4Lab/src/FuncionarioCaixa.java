public class FuncionarioCaixa {
    private String nome;
    private String endereco;
    private String sexo;
    private double calculadora;

    public FuncionarioCaixa() {
        this.nome = "";
        this.endereco = "";
        this.sexo = "";
        this.calculadora = 0;
    }

    public FuncionarioCaixa(String nome, String endereco, String sexo, double calculadora) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public double getCalculadora() {
        return calculadora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCalculadora(double calculadora) {
        this.calculadora = calculadora;
    }

    

    public void imprimeInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Informações da Calculadora:");
        System.out.println(calculadora); 
    }
}