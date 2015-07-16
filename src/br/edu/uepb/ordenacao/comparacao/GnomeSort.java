package br.edu.uepb.ordenacao.comparacao;

/**
 * Adota um pivô que tenha anterior e compara com o próximo, se estão na ordem
 * correta o pivô é incrementado, se não, então faz o swap e decrementa o pivô.
 * Se não existir anterior ao pivô então anda para frente, ao invés de decrenentar.
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public class GnomeSort<T> implements Ordenacao<T> {

	@Override
	public <T extends Comparable<T>> T[] sort(T[] lista) {
		int pivo = 1, n = lista.length;
		T temp;
		while (pivo < n) {
			if (lista[pivo].compareTo(lista[pivo - 1]) > 0) {
				pivo++;
			} else {
				temp = lista[pivo];
				lista[pivo] = lista[pivo - 1];
				lista[pivo - 1] = temp;
				if (pivo > 1) {
					pivo--;
				} else {
					pivo++;
				}
			}
		}
		return lista;
	}
}
