import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas serao incluidas?: ");
        int i;
        double somaTotal = 0;
        int arrLength = scanner.nextInt();
        double[] arrayNotas = new double[arrLength + 1];
        for (i = 0; i < arrLength; i++) {
            System.out.println("Adicione a nota: ");
            double proxNota = scanner.nextDouble();
            arrayNotas[i] = proxNota;
            somaTotal = somaTotal + proxNota;
        }
        System.out.println("A media aritmetica das notas: " + somaTotal/arrLength);
        
    }
}
