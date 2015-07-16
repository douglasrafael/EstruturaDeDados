package br.edu.uepb.estruturas.pilha;

import java.util.Arrays;

/**
 * Implementação de Pilha com array.
 * 
 * @author Douglas Rafael
 * @param <T> O tipo de dados
 */
public class StackArray<T> implements Stack<T> {
	public static int capacidadeMax = 10;
	private int topo = -1;
	private T[] data;

	/**
	 * Construtor que usa a capacidade default para a pilha.
	 * 
	 */
	public StackArray() {
		this(capacidadeMax);
	}

	/**
	 * Construtor que recebe a capacidade máxima como parametro.
	 * 
	 * @param capMax Capacidade máxima da pilha
	 */
	@SuppressWarnings("unchecked")
	public StackArray(int capMax) {
		capacidadeMax = capMax;
		
		/**
		 * Cria um vetor de objeto com a capacidade recebida 
		 * como paramentro e faz o casting para um tipo generico
		 */
		data = (T[]) new Object[capMax];
	}

	@Override
	public void push(T elem) throws StackOverflowException {
		if(isFull()) {
			throw new StackOverflowException();
		}
		topo += 1;
		data[topo] = elem;
	}

	@Override
	public T pop() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		
		T elem = data[topo];
		data[topo] = null;
		topo -= 1;
		return elem;
	}

	@Override
	public T top() {
		return data[topo];
	}

	@Override
	public boolean isEmpty() {
		return topo < 0 ? true : false;
	}

	@Override
	public boolean isFull() {
		return (topo + 1) == capacidadeMax ? true : false;
	}
	
	@Override
	public int size() {
		return topo + 1;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(data);
	}
}
