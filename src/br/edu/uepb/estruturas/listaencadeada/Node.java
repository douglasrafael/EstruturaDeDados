package br.edu.uepb.estruturas.listaencadeada;

/**
 * Representa um Node da Lista Encadeada
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public class Node<T> {
	private T elem;
	private Node<T> prox;
	
	/**
	 * Recupera elemento.
	 * 
	 * @return T elemento recuperado
	 */
	public T getElem() {
		return elem;
	}
	
	/**
	 * Seta elemento
	 * 
	 * @param elem
	 */
	public void setElem(T elem) {
		this.elem = elem;
	}
	
	/**
	 * Recupera o prox elemento.
	 * 
	 * @return T elemento
	 */
	public Node<T> getProx() {
		return prox;
	}
	
	/**
	 * Seta o prox elemento.
	 * 
	 * @param prox
	 */
	public void setProx(Node<T> prox) {
		this.prox = prox;
	}
}
