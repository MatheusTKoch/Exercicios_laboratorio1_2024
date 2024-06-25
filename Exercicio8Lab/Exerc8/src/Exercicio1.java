public class Exercicio1 {
    private Livro[] arrayLivros;
    public String titulo;

    public Exercicio1(Livro[] arrayLivros, String titulo) {
        this.arrayLivros =  arrayLivros;
        this.titulo = titulo;
    }

    public boolean verificaLivro(Livro[] arrLivro, String titulo) {
        for(i=0; i < arrLivro.length; i++) {
            if (arrLivro[i] == titulo) {
                return true;
            } 
        }
        return false;
    }
}