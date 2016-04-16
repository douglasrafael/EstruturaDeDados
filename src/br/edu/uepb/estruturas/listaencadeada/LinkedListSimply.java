package br.edu.uepb.estruturas.listaencadeada;

import java.util.Arrays;

/**
 * Implementação de Lista Simplesmente Encadeada.
 * 
 * @author Douglas Rafael
 * @param <T> Tipo genérico
 */
public class LinkedListSimply<T> implements List<T> {
	private Node<T> inicio, fim;
	private int totalNos;
	
	/**
	 * Construtor
	 */
	public LinkedListSimply() {
		this.inicio = this.fim = null;
		this.totalNos = 0; 
	}

	@Override
	public void insert(T elem) {
		Node<T> novo = new Node<>();
		novo.setElem(elem);
		novo.setProx(inicio);
		inicio = novo;
		totalNos++;
	}

	@Override
	public void remove(T elem) {
		Node<T> anterior = null;
		Node aux = inicio; // Objeto para pecorrer a lista
		
		if(aux.getElem().equals(elem)) {
			inicio = inicio.getProx();
			totalNos--;
		} else {
			while (aux != null && aux.getElem().equals(elem) != true) {
				anterior = aux;
				aux = aux.getProx();
			}
			
			if(aux != null) {
				anterior.setProx(aux.getProx());
				totalNos--;
			}
		}
	}

	@Override
	public T search(T elem) {
		Node result = inicio;
		
		while(result != null) {
			if (elem.equals(result.getElem()))
				return (T) result.getElem();
			result = result.getProx();
		}
		
		return null;
	}

	@Override
	public boolean isEmprty() {
		return totalNos == 0 ? true : false;
	}

	@Override
	public int size() {
		return totalNos;
	}

	@Override
	public T[] toArray() {
		T[] result = (T[]) new Object[totalNos];
		Node aux = inicio;
		int count = 0;
		
		while(aux != null) {
			result[count] = (T) aux.getElem();
			aux = aux.getProx();
			count++;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(toArray());
	}
}
