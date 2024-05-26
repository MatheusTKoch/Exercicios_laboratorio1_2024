import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Banana caturraBanana = new Banana("Caturra", 5.9, "Madura");
        Melancia mediaMelancia = new Melancia("Melancia Media", 15, 8, false);
        Programador euProgramador = new Programador("Matheus", 25, "Javascript");
        Aluno euAluno = new Aluno("Matheus", 25, 8.5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Inicial");
        System.out.println("Digite seu nome");
        String nomeP = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idadeP = scanner.nextInt();
        Pessoa p = new Pessoa(nomeP, idadeP);
        System.out.println("Digite 1 para programador ou 2 para aluno");
        while (scanner.hasNextInt()) {
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Dgite sua linguagem de programacao favorita: ");
            } else if (opcao == 2) {
                System.out.println("Digite a nota recebida: ");
            } else {
                System.out.println("Opcao Incorreta");
            }
        }
        
        scanner.close();
    }
}
