import java.util.Scanner;

public class NavegandoCommits {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(
				"Para calcularmos a média das notas dos alunos é preciso saber, primeiramente, quantos alunos estão na turma:");
		int qtdeAlunos = leitor.nextInt();
		int i = 0;
		double mediaAlunos = 0;
		while (i < qtdeAlunos) {
			System.out.println("Digite a nota do " + (i + 1) + "º aluno:");
			double notaAluno = leitor.nextDouble();
			mediaAlunos = mediaAlunos + notaAluno;
			i++;
		}
		mediaAlunos = mediaAlunos / qtdeAlunos;
		System.out.println("A média de notas dos alunos dessa turma é " + mediaAlunos);
		leitor.close();
	}

}
