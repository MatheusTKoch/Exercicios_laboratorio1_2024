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

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

     public double subtrai(double num1, double num2) {
        return num1 - num2;
     }

     public double multiplica(double num1, double num2) {
        return num1 * num2;
     }

     public double divide(double num1, double num2) {
        return num1 / num2;
     }

     public int elevaAoQuadrado(int num) {
        return num * num;
     }

     public int elevaAoCubo(int num) {
        return num * num * num;
     }

     public void imprimeInfo() {
        System.out.println("Memoria" + memoria);
        System.out.println("Cor" + cor);
     }
}
