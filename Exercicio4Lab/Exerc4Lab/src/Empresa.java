/**
Classe Empresa:
- Uma empresa tem um nome e dois funcionários do caixa;
- Crie três construtores: um que recebe todos os parâmetros para inicializar os atributos; outro que recebe apenas
o nome da empresa, inicializando os funcionários em null; outro que não recebe parâmetros, inicializando os
funcionários em null e o nome com algum valor padrão.
- Crie os métodos de acesso dos atributos desta classe (get e set);
- Crie um método “imprimeInfo”, que imprime as informações da classe. 
 */

public class Empresa {
    private String nome;
    private String funcionario1;
    private String funcionario2;

    public Empresa(String nome, String funcionario1, String funcionario2) {
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    public Empresa() {
        this.nome = "Teste";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncionario1() {
        return funcionario1;
    }

    public String getFuncionario2() {
        return funcionario2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario1(String funcionario1) {
        this.funcionario1 = funcionario1;
    }

    public void setFuncionario2(String funcionario2) {
        this.funcionario2 = funcionario2;
    }

    public void imprimeInfo() {
        System.out.println("Nome da Empresa" + nome);
        System.out.println("Funcionario1" + funcionario1);
        System.out.println("Funcionario2" + funcionario2);
    }


}