package br.edu.uepb.ordenacao.comparacao;

/**
 * Percorre um vetor de elementos da esquerda para a direita e à medida 
 * que avança vai deixando os elementos mais à esquerda ordenados. 
 * O algoritmo de inserção funciona da mesma maneira com que muitas pessoas 
 * ordenam cartas em um jogo de baralho como o pôquer.1
 * 
 * @author FS Developer
 *
 */
public class InsertionSort implements Ordenacao {

	@Override
	public int[] sort(int[] lista) {
		int i = 0, eleito = 0;

		for (int j = 1; j < lista.length; j++) {
			eleito = lista[j];
			i = j - 1;
			while (i >= 0 && lista[i] > eleito) {
				lista[i + 1] = lista[i];
				i--;
			}
			lista[i + 1] = eleito;
		}
		return lista;
	}
}
