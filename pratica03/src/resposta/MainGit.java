package resposta;

/**
 * Pr�tica 03 Fa�a uma classe chamada MainGit que contenha um algoritmo de
 * multiplica��o de todos os elementos de um vetor.
 **/
public class MainGit {
	public static void main(String[] args) {
		Integer[] vetor = new Integer[10];
		mult(vetor);
	}
	public static void mult(Integer vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor[i] * 5;
		}
	}
}
