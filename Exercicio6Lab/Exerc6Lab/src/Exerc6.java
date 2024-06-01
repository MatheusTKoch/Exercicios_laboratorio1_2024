public class Exerc6 {
    public static String retornaDouble(double[] array) {
        double maiorValor = array[0];
        double menorValor = array[0];
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            if (maiorValor < array[i]) {
                maiorValor = array[i];
            } else if (menorValor > array[i]) {
                menorValor = array[i];
            }
            soma = soma + array[i];
        }
        return "Maior Valor: " + maiorValor + ", Menor Valor: " + menorValor + " Soma: " + soma;
    }

    public static void main(String[] args) {
        double[] array = {4.5, 24.3, 24.5};
        String resultado = retornaDouble(array);
        System.out.println(resultado);
    }
}
