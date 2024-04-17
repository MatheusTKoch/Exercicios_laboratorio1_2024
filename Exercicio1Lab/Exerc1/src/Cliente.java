// Cliente:

// Crie uma classe Cliente, que possui nome, idade, sexo, email e senha. Crie um construtor e os métodos de acesso dos atributos.
// Na classe cliente, crie um método chamado imprimeInformacoes, que imprime as informações do cliente de forma legível e organizada.
public class Cliente {
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private char senha;

    public Cliente(String nome, int idade, String sexo, String email, char senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public Cliente(String nome2, String cpf, int idade2) {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    
    public String getEmail() {
        return email;
    }

    public char getSenha() {
        return senha;
    }

    public void imprimeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
    }
}
