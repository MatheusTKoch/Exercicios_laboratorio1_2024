// Crie uma classe Biblioteca, que possui um array de Livro. Crie os métodos de acesso e o toString para esta classe. Nesta classe, ainda, faça o que se pede:
// no construtor, receba apenas o tamanho do array de Livro por parâmetro e inicialize o array com este tamanho. Não inclua livros no array, ele deve permanecer vazio no momento da criação da biblioteca
// crie o método insereLivro, que recebe um livro e insere na primeira posição disponível do array. Caso não seja possível inserir o livro no array, retorne false. Se o livro for inserido, retorne true.
// crie o método procuraLivroPorTitulo, que recebe uma String titulo e retorna um objeto do tipo livro, que é o livro com aquele título. O método retorna null caso não haja o livro solicitado na biblioteca.
// crie o método verificaDesconto, que recebe uma String titulo e retorna o valor do desconto do livro com o título solicitado caso o livro esteja na biblioteca ou retorna -1, caso contrário. Cuidado, nem todos os tipos de livro possuem desconto.
// crie o método imprimeEdicoes, que imprime as edições de todos os livros que possuem esta informação.
// crie o método imprimeLivroPorAno, que simplesmente imprime as informações dos livros em ordem decrescente de ano de criação.
// crie o método calculaMediaPreco, que retorna a média dos preços dos livros presentes no array.
// crie o método livroComMaiorTitulo, que retorna o livro com o maior título do array. Utilize o método length() da classe String, que retorna o tamanho do texto. Por exemplo: variavelString.length() retorna o tamanho (ou seja, a quantidade de caracteres) da variável variavelString.

public class Biblioteca {
    private Livro[] arrayLivro;

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
    
}
