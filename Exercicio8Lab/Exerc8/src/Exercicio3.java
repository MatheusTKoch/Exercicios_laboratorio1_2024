public class Exercicio3 {
    private Universidade[] arrUniversidade;

    public Exercicio3(Universidade[] arrUniversidade) {
        this.arrUniversidade = arrUniversidade;
    }

    public String imprimeUniversidades(Universidade[] arrUniversidade) {
        for (int i = 0; i < arrUniversidade.length; i++) {
            return "Nome: " + arrUniversidade[i].getNome() + "Num. de Alunos: " + arrUniversidade[i].getNumAlunos();
        }
        return "Array vazia";
    }
}
