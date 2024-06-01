import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas serao incluidas?: ");
        int i;
        int arrLength = scanner.nextInt();
        String[] arrayNotas = new String[arrLength + 1];
        for (i = 0; i < arrLength; i++) {
            System.out.println("Adicione a nota: ");
            String proxNota = scanner.next();
            arrayNotas[i] = proxNota;
        }
        System.out.println(arrayNotas);
    }
}
