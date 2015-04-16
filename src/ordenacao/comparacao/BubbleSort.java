package ordenacao.comparacao;

import java.util.Arrays;

public class BubbleSort extends Ordenacao {
	private int[] lista;

	public BubbleSort(int[] l) {
		lista = l;
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
	}

	@Override
	public String toString() {
		return Arrays.toString(lista);
	}
}
