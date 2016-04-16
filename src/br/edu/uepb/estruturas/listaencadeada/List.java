package br.edu.uepb.estruturas.listaencadeada;

/**
 * Interface representando uma lista encadeada.
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public interface List<T> {
	
	/**
	 * Insere um elemento no início da fila.
	 * 
	 * @param elem Elemento a ser inserido
	 */
	public void insert(T elem);
	
	/**
	 * Remove elemento da lista.
	 * 
	 * @param elem Elemento a ser removido.
	 */
	public void remove(T elem);
	
	/**
	 * Busca por elemento na lista.
	 * 
	 * @param elem Elemento a ser buscado
	 * @return T Elemento encontrado
	 */
	public T search(T elem);
	
	/**
	 * Verifica se a fila está vazia.
	 * 
	 * @return true se estiver vazia ou false caso contrário
	 */
	public boolean isEmprty();
	
	/**
	 * Recupera o total de elemntos contidos na lista.
	 * 
	 * @return Tamanho da lista
	 */
	public int size();
	
	/**
	 * Retorna a lista encadeada em array.
	 * 
	 * @return T[] lista em array 
	 */
	public T[] toArray();
}
