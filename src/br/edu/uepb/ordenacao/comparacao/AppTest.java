package br.edu.uepb.ordenacao.comparacao;

import java.util.Arrays;
import java.util.Random;

/**
 * Classe para testar os algoritmos de ordenaçaõ por comparação.
 * 
 * @author Douglas Rafael
 */
public class AppTest {
	private static final int TOTAL_ELEMENTOS = 10;
	private static final int TOTAL_RANGE = 1000;
	private static Integer[] dataInteiro;
	private static String[] dataString;

	public static void main(String[] args) {
		dataInteiro = arrayInteiros();
		dataString = arrayStrings();
		// Lista Original
		System.out.println("DADOS INICIAIS:\n" + Arrays.toString(arrayInteiros()) + "\n" + Arrays.toString(arrayStrings()) + "\n");

		// Bubble Sort
		printArray(new BubbleSort().sort(dataInteiro), "BUBBLE SORT");
		printArray(new BubbleSort().sort(dataString), "BUBBLE SORT");
		
		// Selection Sort
		printArray(new SelectionSort().sort(dataInteiro), "SELECTION SORT");
		printArray(new SelectionSort().sort(dataString), "SELECTION SORT");
		// Insertion Sort
		printArray(new InsertionSort().sort(dataInteiro), "INSERTION SORT");
		printArray(new InsertionSort().sort(dataString), "INSERTION SORT");
		// Gnome Sort
		printArray(new GnomeSort().sort(dataInteiro), "GNOME SORT");
		printArray(new GnomeSort().sort(dataString), "GNOME SORT");
		;
	}

	/**
	 * Monta um Array com números inteiros aleatórios
	 * 
	 * @return Array de inteiros com os números gerados aleatoriamente
	 */
	private static Integer[] arrayInteiros() {
		Integer[] numerosAleatorios = new Integer[TOTAL_ELEMENTOS];
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
	 * Retorna array de strings com nomes
	 * 
	 * @return Array contendo os nomes
	 */
	private static String[] arrayStrings() {
		return new String[] { "Werdcen", "Nathlee", "Anchell", "Paultheod",
				"Sabri", "Gormaar", "Rensean", "Aforth", "Beochell", "Dradas",
				"Joanlas", "Canmuel","Soisum","Theodthas","Tysan","Orahne","Nasu", "Conthonydun","Brytdon", "Ea"};
	}

	/**
	 * Imprime o array
	 * @param <T> Tipo genérico
	 * 
	 * @param array O array a ser exibido
	 */
	private static <T> void printArray(T[] array, String algo) {
		System.out.println(algo + "\n" + Arrays.toString(array) + "\n");
	}
}
