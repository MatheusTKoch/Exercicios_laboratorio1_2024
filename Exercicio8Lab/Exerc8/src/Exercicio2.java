public class Exercicio2 {
    private Livro[] arrLivro;
    private String tituloLivro;

    public Livro retornaLivro(Livro[] arrLivro, String tituloLivro) {
        for(i=0; i < arrLivro.length; i++) {
           if (arrLivro[i] == tituloLivro) {
            return arrLivro[i].toString();
           } 
        }
        return null;
    }
}