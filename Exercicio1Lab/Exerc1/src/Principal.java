// Principal:

// Crie uma classe chamada Principal. Nela, coloque o método main.
// No main, crie 3 instâncias de Livro e 3 instâncias de Cliente. Todas as informações necessárias para a criação dos objetos devem ser solicitadas pelo Teclado.
// Imprima o preço por página de cada um dos livros criados.
// Imprima as informações de todos os objetos criados.

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações dos 3 livros:");
        Livro[] livros = new Livro[3];
        for (int i = 0; i < livros.length; i++) {
            System.out.println("\nLivro " + (i + 1));
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Ano de Publicação: ");
            int anoPublicacao = scanner.nextInt();
            System.out.print("Preço: R$");
            double preco = scanner.nextDouble();
            System.out.print("Número de Páginas: ");
            int numeroPaginas = scanner.nextInt();
            scanner.nextLine();
            livros[i] = new Livro(titulo, autor, anoPublicacao, preco, numeroPaginas);
        }

        System.out.println("\nDigite as informações dos 3 clientes:");
        Cliente[] clientes = new Cliente[3];
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("\nCliente " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            clientes[i] = new Cliente(nome, cpf, idade);
        }

        System.out.println("\nPreço por Página de cada Livro:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + ": R$" + livro.calcularPrecoPorPagina());
        }

        System.out.println("\nInformações dos Livros:");
        for (Livro livro : livros) {
            livro.imprimirInformacoes();
            System.out.println();
        }

        System.out.println("\nInformações dos Clientes:");
        for (Cliente cliente : clientes) {
            cliente.imprimeInformacoes();
            System.out.println();
        }

        scanner.close();
    }
}
