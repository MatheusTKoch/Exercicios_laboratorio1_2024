// e) Crie uma classe chamada PrincipalAluno. Nela, crie o método main. Neste método, faça o que se pede:

// - Crie 3 alunos, conforme a descrição abaixo:

// Nome	Matrícula	Nota do Grau A	Nota do Grau B
// Brandamente Brasil	1585258	5	9
// Radigunda Cercená	2254879	8	2
// Vitimado José Araújo	0085994	7	1


// - Imprima as informações de cada um dos 3 alunos

// - Altere a nota do Grau A de Radigunda para 9

// - Imprima apenas a média final de Radigunda

// - Imprima somente a matrícula de Vitimado

// - Altere a matrícula de Brandamente para 1585228

// - Altere a nota do GB de Radigunda por um valor lido pelo Teclado

import java.util.Scanner;


public class PrincipalAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Brandamente Brasil", 1585258, 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", 	2254879, 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", 85994, 7, 1);

        aluno1.imprimeInfo();
        aluno2.imprimeInfo();
        aluno3.imprimeInfo();

        aluno2.setNotaGA(9);
        
        aluno2.calculaMediaFinal();

        System.out.println("Matricula de Vitimado: " + aluno3.getMatricula());

        aluno1.setMatricula(1585228);

        System.out.println("Informe a nota de GB do aluno Radigunda: ");
        double notaGBRadingunda = scanner.nextDouble();
        aluno2.setNotaGB(notaGBRadingunda);

        scanner.close();
    }
}
