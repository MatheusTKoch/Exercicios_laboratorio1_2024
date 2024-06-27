public class Exercicio4 {
    private Universidade[] arrUniversidades;
    private int numAlunosInicial;

    public Exercicio4(Universidade[] arrUniversidades, int numAlunosInicial) {
        this.arrUniversidades = arrUniversidades;
        this.numAlunosInicial = 0;
    }

    public Universidade maisAlunos(Universidade[] arrUniversidades) {
        Universidade universidadeMaisAlunos = new Universidade(null, numAlunosInicial);
        for (int i = 0; i < arrUniversidades.length; i++) {
            if (arrUniversidades[i].getNumAlunos() > numAlunosInicial) {
                universidadeMaisAlunos = arrUniversidades[i];
                numAlunosInicial = arrUniversidades[i].getNumAlunos();
            }
        }
        return universidadeMaisAlunos;
    }
}
