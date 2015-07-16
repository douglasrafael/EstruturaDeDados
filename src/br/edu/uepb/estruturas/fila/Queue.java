package br.edu.uepb.estruturas.fila;

/**
 * Interfece representando uma fila.
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public interface Queue<T> {
	/**
	 * Insere um elemento no fim da fila. 
	 * 
	 * @param elem Elemento a ser inserido
	 * @throws QueueOverflowException Exceção disparada quando houver estouro da fila
	 */
	public void enqueue(T elem) throws QueueOverflowException;
	
	/**
	 * Remove um elemento da cabeça (início) da fila.
	 * 
	 * @return O elemento removido
	 * @throws QueueUndeflowException Exceção disparada quando houver estouro negativo da fila
	 */
	public T dequeue() throws QueueUndeflowException;
	
	/**
	 * Retorna o elemento que está na cabeça (início) da fila.
	 * 
	 * @return O elemento
	 */
	public T head();
	
	/**
	 * Verifica se a fila está vazia.
	 * 
	 * @return true se estiver vazia ou false caso contrário
	 */
	public boolean isEmpty();
	
	/**
	 * Verifica se a fila está cheia.
	 * 
	 * @return true se estiver cheia ou false caso contrário
	 */
	public boolean isFull();
	
	/**
	 * Retorna o total de elementos contidos na fila.
	 * 
	 * @return Total de elementos na fila
	 */
	public int size();
}
