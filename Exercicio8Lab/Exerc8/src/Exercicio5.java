public class Exercicio5 {
    private Produto[] arrProdutos;
    private double precoInicial = 0;
    private Produto produtoBarato;

    private Produto produtoMaisBarato(Produto[] arrProdutos, Produto produtoBarato) {
        for (int i = 0; i < arrProdutos.length; i++) {
            if (arrProdutos[i].getPreco() > precoInicial) {
                produtoBarato = arrProdutos[i];
            }
        }
        return produtoBarato;
    }
}
