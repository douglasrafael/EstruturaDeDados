package br.edu.uepb.ordenacao.comparacao;

/**
 * Interface para algoritmos de ordenação
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public interface Ordenacao<T> {
	/**
	 * Ordena a lista de acordo com a implmentação
	 * @param <T>
	 * 
	 * @param lista A ser ordenada
	 * @return A lista ordenada
	 */
	public <T extends Comparable<T>> T[] sort(T[] lista);

}
