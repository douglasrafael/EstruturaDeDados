package br.edu.uepb.ordenacao.comparacao;

import java.util.Arrays;
import java.util.Random;

public class AppTest {
	private static final int TOTAL_ELEMENTOS = 10;
	private static final int TOTAL_RANGE = 1000;
	private static int[] data;

	public static void main(String[] args) {
		data = montaLista();

		// Lista Original
		System.out.println("LISTA ORIGINAL:\n" + Arrays.toString(data) + "\n");

		// Bubble Sort
		printArray(new BubbleSort().sort(data), "BUBBLE SORT");
		// Selection Sort
		printArray(new SelectionSort().sort(data), "SELECTION SORT");
		// Insertion Sort
		printArray(new InsertionSort().sort(data), "INSERTION SORT");
		// Gnome Sort
		printArray(new GnomeSort().sort(data), "GNOME SORT");
		;
	}

	/**
	 * Monta uma lista com números inteiros aleatórios
	 * 
	 * @return Lista de inteiros com os números gerados aleatoriamente
	 */
	public static int[] montaLista() {
		int[] numerosAleatorios = new int[TOTAL_ELEMENTOS];
		Random gerador = new Random();

		/**
		 * Monta uma lista de 20 elementos com números aleatórios entre 0-100
		 */
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = gerador.nextInt(TOTAL_RANGE);
		}

		return numerosAleatorios;
	}

	/**
	 * Imprime o array
	 * 
	 * @param array
	 *            O array a ser printado
	 */
	private static void printArray(int[] array, String algo) {
		System.out.println(algo + "\n" + Arrays.toString(array) + "\n");
	}
}
