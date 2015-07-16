package br.edu.uepb.ordenacao.comparacao;

/**
 * Percorre o array n vezes, a cada passagem faz flutuar para o topo o maior
 * elemento da sequência.
 * 
 * @author Douglas Rafael
 */
public class BubbleSort implements Ordenacao {

	@Override
	public int[] sort(int[] lista) {
		int aux = 0, n = lista.length;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (lista[j] > lista[j + 1]) {
					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
				}
			}
		}
		return lista;
	}
}