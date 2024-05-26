import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Banana caturraBanana = new Banana("Caturra", 5.9, "Madura");
        Melancia mediaMelancia = new Melancia("Melancia Media", 15, 8, false);
        Programador euProgramador = new Programador("Matheus", 25, "Javascript");
        Aluno euAluno = new Aluno("Matheus", 25, 8.5);
        boolean finalizar = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Inicial");
        System.out.println("Digite seu nome");
        String nomeP = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idadeP = scanner.nextInt();
        Pessoa p = new Pessoa(nomeP, idadeP);
        System.out.println("Digite 1 para programador ou 2 para aluno");
        if (scanner.hasNextInt()) {
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Digite sua linguagem de programacao favorita: ");
                String linguagem = scanner.next();
                Programador p1 = new Programador(p.getNome(), p.getIdade(), linguagem);
                System.out.println("Ola " + p1.getNome() + "!");
                System.out.print("Voce tem " + p1.getIdade() + " anos, e sua linguagem favorita: " + p1.getLinguagem());
                finalizar = true;
            } else if (opcao == 2) {
                System.out.println("Digite a nota recebida: ");
                double nota = scanner.nextDouble();
                Aluno a1 = new Aluno(p.getNome(), p.getIdade(), nota);
                System.out.println("Ola " + a1.getNome() + "!");
                System.out.print("Voce tem " + a1.getIdade() + " anos, e essa e sua nota: " + a1.getNota());
                finalizar = true;
            } else {
                System.out.println("Opcao Incorreta");
            }
        }
        if (finalizar == true) {
            scanner.close();
        }    
    }
}
