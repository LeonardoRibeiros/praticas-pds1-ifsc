package resposta;

/**
 * Prática 03 Faça uma classe chamada MainGit que contenha um algoritmo de
 * multiplicação de todos os elementos de um vetor.
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
