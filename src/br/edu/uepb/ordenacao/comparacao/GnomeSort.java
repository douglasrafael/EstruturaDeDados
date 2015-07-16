package br.edu.uepb.ordenacao.comparacao;

/**
 * Adota um pivô que tenha anterior e compara com o próximo, se estão na ordem
 * correta o pivô é incrementado, se não, então faz o swap e decrementa o pivô.
 * Se não existir anterior ao pivô então anda para frente, ao invés de decrenentar.
 * 
 * @author Douglas Rafael
 *
 */
public class GnomeSort implements Ordenacao {

	@Override
	public int[] sort(int[] lista) {
		int pivo = 1, temp = 0, n = lista.length;
		while (pivo < n) {
			if (lista[pivo] >= lista[pivo - 1]) {
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
