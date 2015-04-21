package ordenacao.comparacao;

/**
 * Encontra o menor elemento da lista e troca com o primeiro elemento. 
 * O processo é feito para o restante da lista, começando com a próxima posição.
 * 
 * @author Douglas Rafael
 *
 */
public class SelectionSort implements Ordenacao {

	@Override
	public int[] sort(int[] lista) {
		int n = lista.length;
		int temp = 0;
		int min = 0;

		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (lista[j] < min) {
					min = lista[j];
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
