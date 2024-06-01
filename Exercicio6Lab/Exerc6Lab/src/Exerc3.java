public class Exerc3 {
    public static int somaArray(int[] numeros) {
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] num = {1, 20, 40, 50};
        int resultado = somaArray(num);
        System.out.println("A soma dos numeros: " + resultado);
    }
}
