public class Exercicio5 {
    private Produto[] arrProdutos;
    private static double precoInicial = 0;
    private Produto produtoBarato;

    private static Produto produtoMaisBarato(Produto[] arrProdutos, Produto produtoBarato) {
        for (int i = 0; i < arrProdutos.length; i++) {
            if (arrProdutos[i].getPreco() > precoInicial) {
                produtoBarato = arrProdutos[i];
            }
        }
        return produtoBarato;
    }

    public static void main(String[] args) {
        Produto teste1 = new Produto(20);
        Produto teste2 = new Produto(2);
        Produto teste3 = new Produto(10.4);
        Produto[] arrayProdutos = new Produto[] {teste1, teste2, teste3};
        Produto prodMaisBarato = new Produto(0);

        System.out.println(produtoMaisBarato(arrayProdutos, prodMaisBarato));
    }
}
