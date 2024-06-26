public class Exercicio2 {
    private Livro[] arrLivro;
    private String tituloLivro;

    public Livro retornaLivro(Livro[] arrLivro, String tituloLivro) {
        for(int i=0; i < arrLivro.length; i++) {
           if (arrLivro[i].getTitulo() == tituloLivro) {
            return arrLivro[i];
           } 
        }
        return null;
    }
}