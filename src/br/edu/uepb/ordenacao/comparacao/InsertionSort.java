package br.edu.uepb.ordenacao.comparacao;

/**
 * Percorre um vetor de elementos da esquerda para a direita e à medida 
 * que avança vai deixando os elementos mais à esquerda ordenados. 
 * O algoritmo de inserção funciona da mesma maneira com que muitas pessoas 
 * ordenam cartas em um jogo de baralho como o pôquer.1
 * 
 * @author Douglas Rafael
 * @param <T> tipo genérico
 *
 */
public class InsertionSort<T> implements Ordenacao<T> {

	@Override
	public <T extends Comparable<T>> T[] sort(T[] lista) {
		int i = 0; 
		T eleito;

		for (int j = 1; j < lista.length; j++) {
			eleito = lista[j];
			i = j - 1;
			while (i >= 0 && lista[i].compareTo(eleito) > 0) {
				lista[i + 1] = lista[i];
				i--;
			}
			lista[i + 1] = eleito;
		}
		return lista;
	}
}
