package br.edu.uepb.estruturas.fila;

import java.util.Arrays;

/**
 * Representa uma fila.
 * 
 * @author Douglas Rafael
 * @param <T> O tipo de dados
 */
public class QueueArray<T> implements Queue<T> {

	public static int capacidadeMax = 10;
	private int inicio;
	private int fim;
	private int totalElementos;
	private T[] data;
	
	/**
	 * Construtor que usa a capacidade default para a fila.
	 * 
	 */
	public QueueArray() {
		this(capacidadeMax);
	}
	
	/**
	 * Construtor que recebe a capacidade máxima como parametro.
	 * 
	 * @param capMax Capacidade máxima da fila
	 */
	@SuppressWarnings("unchecked")
	public QueueArray(int capMax) {
		capacidadeMax = capMax;
		inicio = fim = -1;
		totalElementos = 0;
		
		/**
		 * Cria um vetor de objeto com a capacidade recebida 
		 * como paramentro e faz o casting para um tipo generico
		 */
		data = (T[]) new Object[capacidadeMax];
	}

	@Override
	public void enqueue(T elem) throws QueueOverflowException {
		if(isFull()) {
			throw new QueueOverflowException();
		}
		
		// Quando a fila estar vazia
		if(isEmpty()) {
			inicio = 0;
		}
		fim += 1;
		totalElementos += 1;
		data[fim] = elem;
	}

	@Override
	public T dequeue() throws QueueUndeflowException {
		if(isEmpty()) {
			throw new QueueUndeflowException();
		}
			
		inicio += 1;
		totalElementos -= 1;
		return data[inicio];
	}

	@Override
	public T head() {
		if(!isEmpty()) {
			return data[inicio];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return totalElementos == 0 ? true : false;
	}

	@Override
	public boolean isFull() {
		return (totalElementos == capacidadeMax) ? true : false;
	}

	@Override
	public int size() {
		return totalElementos;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(data);
	}
}
