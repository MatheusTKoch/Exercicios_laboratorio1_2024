// a) Crie a classe Aluno com os seguintes atributos:

// - nome 
// - matrícula
// - nota do grau A
// - nota do grau B

// b) Crie os métodos de acesso e um construtor que recebe parâmetros para inicializar todos os atributos da classe 

// c) Crie o método calculaMediaFinal(), que retorna a média final do aluno: (GrauA * 0,33) + (GrauB * 0,67)

// d) Crie o método imprimeInfo(), que imprime todas as informações do aluno de maneira organizada, incluindo a sua média final 

public class Aluno {
    private String nome;
    private int matricula;
    private double notaGA;
    private double notaGB;

    public Aluno(String nome, int matricula, double notaGA, double notaGB) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaGA = notaGA;
        this.notaGB = notaGB;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNotaGA() {
        return notaGA;
    }

    public double getNotaGB() {
        return notaGB;
    }

    public double calculaMediaFinal() {
        return (notaGA * 0.33) + (notaGB * 0.67);
    }

    public void setNotaGA(double notaGA) {
        this.notaGA = notaGA;
    }

    public void setNotaGB(double notaGB) {
        this.notaGB = notaGB;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimeInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("NotaGA: " + notaGA);
        System.out.println("NotaGB: " + notaGB);
        System.out.println("Media Final: " + calculaMediaFinal());
    }
}
