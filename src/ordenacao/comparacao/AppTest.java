package ordenacao.comparacao;

import java.util.Random;

public class AppTest {
	private static int[] data;

	public AppTest() {
		data = montaLista();
	}

	public static void main(String[] args) {
		new AppTest();
		
		// BubbleSort
		System.out.println(new BubbleSort(data).toString());
	}

	/**
	 * Monta uma lista com números inteiros aleatórios
	 * 
	 * @return Lista de inteiros com os números gerados aleatoriamente
	 */
	public int[] montaLista() {
		int[] numerosAleatorios = new int[20];
		Random gerador = new Random();

		/**
		 * Monta uma lista de 20 elementos com números aleatórios entre 0-100
		 */
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = gerador.nextInt(1000);
		}

		return numerosAleatorios;
	}
}
