package br.edu.uepb.ordenacao.comparacao;

/**
 * Encontra o menor elemento da lista e troca com o primeiro elemento. 
 * O processo é feito para o restante da lista, começando com a próxima posição.
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public class SelectionSort<T> implements Ordenacao<T> {

	@Override
	public <T extends Comparable<T>> T[] sort(T[] lista) {
		int n = lista.length;
		T temp;
		int min = 0;

		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (lista[j].compareTo(lista[min]) <= 0) {
					min = j;
				}
			}
			if (min != i) {
				temp = lista[i];
				lista[i] = lista[min];
				lista[min] = temp;
			}
		}
		return lista;
	}
}
