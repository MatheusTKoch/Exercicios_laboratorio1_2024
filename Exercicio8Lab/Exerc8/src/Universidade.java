public class Universidade {
    private String nome;
    private int numAlunos;

    public Universidade(String nome, int numAlunos) {
        this.nome = nome;
        this.numAlunos = numAlunos;
    }

    public String getNome() {
        return nome;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }
}
