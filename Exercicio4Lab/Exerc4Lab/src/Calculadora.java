public class Calculadora {
    /**
     * Calculadora que recebe memoria e cor para realizar operacoes;
     * @param args
     * @throws Exception
     */
    private double memoria;
    private String cor;

    /**
     * Metodo construtor
     * @param cor
     */
    public Calculadora(String cor) {
        this.cor = cor;
        this.memoria = 0;
    }

    /**
     * Metodo para retornar a cor
     * @return
     */
    public String getCor() {
        return cor;
    }

    /**
     * Metodo para settar a cor
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Metodo para retornar a memoria
     * @return
     */
    public double getMemoria() {
        return memoria;
    }

    /**
     * Metodo para settar a memoria
     * @param memoria
     */
    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    /**
     * Metodo para somar valores e salvar soma na memoria
     * @param num1
     * @param num2
     */
    public void somaNumeros(double num1, double num2) {
        double soma;
        soma = num1 + num2;
        memoria = soma;
    }
    
}
