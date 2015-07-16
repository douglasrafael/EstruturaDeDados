package br.edu.uepb.estruturas.pilha;

/**
 * Interface representando uma pilha.
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public interface Stack<T> {
	/**
	 * Insere o elemento no topo da pilha.
	 * 
	 * @param elem Elemento a ser inserido
	 * @throws StackOverflowException Exceção disparada quando houver estouro de pilha 
	 */
	public void push(T elem) throws StackOverflowException;
	
	/**
	 * Remove e retorna o último elemento inserido (O elemento do topo).
	 * 
	 * @return Retorna o elemento removido
	 * @throws StackUnderflowException Exceção disparada quando houver estouro negativo de pilha
	 */
	public T pop() throws StackUnderflowException;
	
	/**
	 * Retorna o último elemento inserido. ou seja o que está no topo da pilha.
	 * @return O elemento do topo
	 */
	public T top();
	
	/**
	 * Verifica se a pilha está vazia.
	 * 
	 * @return true se estiver vazia ou false caso contrário
	 */
	public boolean isEmpty();
	
	/**
	 * Verifica se a pilha está cheia.
	 * 
	 * @return true se estiver cheia ou false caso contrário
	 */
	public boolean isFull();
	
	/**
	 * Retorna o total de elementos contidos na pilha.
	 * 
	 * @return Total de elementos na pilha
	 */
	public int size();
}
