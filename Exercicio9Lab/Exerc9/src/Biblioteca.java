// Crie uma classe Biblioteca, que possui um array de Livro. Crie os métodos de acesso e o toString para esta classe. Nesta classe, ainda, faça o que se pede:
// no construtor, receba apenas o tamanho do array de Livro por parâmetro e inicialize o array com este tamanho. Não inclua livros no array, ele deve permanecer vazio no momento da criação da biblioteca
// crie o método insereLivro, que recebe um livro e insere na primeira posição disponível do array. Caso não seja possível inserir o livro no array, retorne false. Se o livro for inserido, retorne true.
// crie o método procuraLivroPorTitulo, que recebe uma String titulo e retorna um objeto do tipo livro, que é o livro com aquele título. O método retorna null caso não haja o livro solicitado na biblioteca.
// crie o método verificaDesconto, que recebe uma String titulo e retorna o valor do desconto do livro com o título solicitado caso o livro esteja na biblioteca ou retorna -1, caso contrário. Cuidado, nem todos os tipos de livro possuem desconto.
// crie o método imprimeEdicoes, que imprime as edições de todos os livros que possuem esta informação.
// crie o método imprimeLivroPorAno, que simplesmente imprime as informações dos livros em ordem decrescente de ano de criação.
// crie o método calculaMediaPreco, que retorna a média dos preços dos livros presentes no array.
// crie o método livroComMaiorTitulo, que retorna o livro com o maior título do array. Utilize o método length() da classe String, que retorna o tamanho do texto. Por exemplo: variavelString.length() retorna o tamanho (ou seja, a quantidade de caracteres) da variável variavelString.

import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {
    private Livro[] arrayLivro;
    private int indice;

    public Biblioteca(int tamanhoArray) {
        arrayLivro = new Livro[tamanhoArray];
    }

    public boolean insereLivro(Livro livro) {
        for (int i = 0; i < arrayLivro.length; i++) {
            if (arrayLivro[i] != null) {
                livro = arrayLivro[i];
                return true;
            }
        }
        return false;
    }
    
    public Livro procuraLivroPorTitulo(String titulo) {
        for (int i = 0; i < arrayLivro.length; i++) {
            if (arrayLivro[i].getTitulo() == titulo) {
                return arrayLivro[i];
            }
        }
        return null;
    }

    public Novo verificaDesconto(String titulo) {
        Novo livroComDesconto;
        for (int i = 0; i < arrayLivro.length; i++) {
            livroComDesconto = (Novo) arrayLivro[i];
            if (livroComDesconto.getValorDesconto() != 0) {
                return livroComDesconto;
            }
        }
        return null;
    }

    public Livro imprimeEdicoes() {
        Antigo livroComEdicao;
        for (int i = 0; i < arrayLivro.length; i++) {
            livroComEdicao = (Antigo) arrayLivro[i];
            if (livroComEdicao.getNumEdicao() != 0) {
                System.out.println("Edicao: " + livroComEdicao);
            }
            return livroComEdicao;
        }
        return null;
    }

    public Livro imprimeLivroPorAno() {
        Arrays.sort(arrayLivro, 0, indice, new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return Integer.compare(l2.getDataCriacao(), l1.getDataCriacao());
            }
        });
        for (Livro livro : arrayLivro) {
            if (livro != null) {
                System.out.println(livro);
            }
        }
        return null;
    }

    public double calculaMediaPreco() {
        double valorTotal = 0;
        int divisor = 0;
        for (int i = 0; i < arrayLivro.length; i++) {
            valorTotal += arrayLivro[i].getPreco();
            divisor++;
        }
        return valorTotal / divisor;
    }
}
