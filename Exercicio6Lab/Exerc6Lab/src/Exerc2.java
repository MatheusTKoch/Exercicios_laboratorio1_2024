import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos nomes serao informados?: ");
        int quantNome = scanner.nextInt();
        String[] arrayNomes = new String[quantNome + 1];
        for (int i = 0; i < quantNome; i++) {
            System.out.println("Informe o nome: ");
            String nome = scanner.next();
            arrayNomes[i] = nome;
        }
        System.out.println("Dados informados: ");
        for (String string : arrayNomes) {
            System.out.println(string);
        }
    }
}
