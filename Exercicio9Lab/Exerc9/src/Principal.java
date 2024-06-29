// Crie a classe Principal, que possui o método main. No main, faça o que se pede:

// Crie uma biblioteca com capacidade de livros entre 1 e 200, utilizando Math.random() para o sorteio. Lembrando: (int)(Math.random() * X + 1) sorteia um valor entre 1 e X.
// Sorteie um valor entre 1 e 300 e armazene em uma variável chamada quant
// Tente inserir quant livros na biblioteca. Para isto, realize um sorteio entre 1 e 2. Caso o valor sorteado seja 1, insira um livro Novo. Caso o valor sorteado seja 2, insira um livro Antigo. A cada inserção, informe uma mensagem de sucesso ou insucesso. As informações necessárias para criação dos objetos devem ser obtidas de alguma forma aleatória.
// Solicite ao usuário (pelo teclado) que informe o título de um livro para procurar na biblioteca. Caso o livro exista, imprima as informações do livro. Caso contrário, imprima uma mensagem de erro.
// Solicite ao usuário (pelo teclado) que informe o título de um livro para verificar o desconto. Caso o livro exista e possua desconto, imprima as informações do livro. Caso contrário, imprima uma mensagem de erro.
// Imprima a edição dos livros do tipo Antigo da biblioteca.
// Imprima as informações dos livros em ordem decrescente de ano de criação.
// Imprima a média dos preços dos livros presentes na biblioteca.
// Imprima as informações do livro com o maior título na biblioteca. 

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Biblioteca bibliotecaUni = new Biblioteca((int)(Math.random() * 200 + 1));
        int valorAleatorio = (int)(Math.random() * 300 + 1);
        int randomValue = random.nextInt(2) + 1;
        if (randomValue == 1) {
            System.out.println("Insira o valor do desconto");
            double desconto = scanner.nextDouble();
        } else if (randomValue == 2) {
            System.out.println("Informe o numero da edicao: ");
            int edicao = scanner.nextInt();
        }
        System.out.println("Informe o titulo do livro: ");
        String titulo = scanner.nextLine();
        System.out.println("Informe o autor do livro: ");
        String autor = scanner.nextLine();
        
    }
}
