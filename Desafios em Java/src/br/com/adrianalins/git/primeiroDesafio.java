/**
 * 
 */
package br.com.adrianalins.git;

import java.util.Scanner;

/**
 * @author Adriana
 * Meu primeiro desafio em Java
 * 
 *
 */
public class primeiroDesafio {
	
	public static void main(String[] args) {
		double mediaGeralTurma = 0, mediaPorDisciplina = 0, maiorMedia = 0, menorMedia = 0, somaMediaPorDisciplina = 0;
		double nota1, nota2, mediaCadaAluno, somaNotasAlunos;
		int quantidadeDisciplinas, numeroAlunos;
		int alunosReprovados, alunosAprovados, alunosFinal;
		String nomeTurma, nomeDisciplina;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome da turma: ");
		nomeTurma = sc.nextLine();
		System.out.println("Informe a quantidade total de alunos na turma: ");
		numeroAlunos = Integer.parseInt(sc.nextLine());
		System.out.println("Informe a quantidade de disciplinas: ");
		quantidadeDisciplinas = Integer.parseInt(sc.nextLine());

		somaMediaPorDisciplina = 0;

		for (int i = 1; i <= quantidadeDisciplinas; i++) {
			System.out.println("Informe o nome da " + i + " º disciplina: ");
			nomeDisciplina = sc.nextLine();

			somaNotasAlunos = 0;
			alunosAprovados = 0;
			alunosReprovados = 0;
			alunosFinal = 0;

			for (int j = 1; j <= numeroAlunos; j++) {
				System.out.println("Informe a primeira nota do aluno: ");
				nota1 = Double.parseDouble(sc.nextLine());
				System.out.println("Informe a segunda nota do aluno: ");
				nota2 = Double.parseDouble(sc.nextLine());

				// Calculando a média de cada aluno na disciplina
				mediaCadaAluno = (nota1 + nota2) / 2;

				System.out.println("A média do " + j + " º aluno é: " + mediaCadaAluno);

				if (j == 1) {
					maiorMedia = mediaCadaAluno;
					menorMedia = mediaCadaAluno;
				}

				// Calculando a maior e menor média de cada disciplina
				if (mediaCadaAluno > maiorMedia) {
					maiorMedia = mediaCadaAluno;
				}
				if (mediaCadaAluno < menorMedia) {
					menorMedia = mediaCadaAluno;
				}

				// Calculando a situação de cada aluno: aprovado, reprovado ou final
				if (mediaCadaAluno < 3) {
					System.out.println("Reprovado por média.");
					alunosReprovados = alunosReprovados + 1;
				} else if (mediaCadaAluno >= 3 && mediaCadaAluno < 7) {
					System.out.println("Aguardando final.");
					alunosFinal = alunosFinal + 1;
				} else if (mediaCadaAluno >= 7) {
					System.out.println("Aprovado por média.");
					alunosAprovados = alunosAprovados + 1;
				}

				somaNotasAlunos = somaNotasAlunos + mediaCadaAluno;

				mediaPorDisciplina = somaNotasAlunos / numeroAlunos;

			}
			somaMediaPorDisciplina = somaMediaPorDisciplina + mediaPorDisciplina;

			mediaGeralTurma = somaMediaPorDisciplina / quantidadeDisciplinas;
			
			//Calculando o resumo da disciplina
			System.out.println();
			System.out.println("###RESUMO DA DISCIPLINA###");
			System.out.println("DISCIPLINA: " + nomeDisciplina);
			System.out.println("QUANTIDADE DE ALUNO: " + numeroAlunos);
			System.out.println("MÉDIA GERAL DA DISCIPLINA: " + mediaPorDisciplina);
			System.out.println("MAIOR MÉDIA DA DISCIPLINA: " + maiorMedia);
			System.out.println("MENOR MÉDIA DA DISCIPLINA: " + menorMedia);
			System.out.println("QUANTIDADE DE ALUNOS REPROVADOS: " + alunosReprovados);
			System.out.println("QUANTIDADE DE ALUNOS APROVADOS: " + alunosAprovados);
			System.out.println("QUANTIDADE DE ALUNOS NA FINAL: " + alunosFinal);

		}
		
		//Calculando o resumo da turma 
		System.out.println();
		System.out.println("###RESUMO DA TURMA:###");
		System.out.println("TURMA: " + nomeTurma);
		System.out.println("QTD DE DISCIPLINAS: " + quantidadeDisciplinas);
		System.out.println("MÉDIA GERAL DA TURMA: " + mediaGeralTurma);

		sc.close();

	}


		

	}


