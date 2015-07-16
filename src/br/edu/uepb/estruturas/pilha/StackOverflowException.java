package br.edu.uepb.estruturas.pilha;

/**
 * Representa a exceção do tipo overflow.
 * 
 * @author Douglas Rafael
 */
public class StackOverflowException extends Exception {

	private static final long serialVersionUID = 1013132484521845458L;

	/**
	 * Construtor. Seta mensagem padrão para a super classe:
	 * "Estouro de Pilha!"
	 * 
	 */
	public StackOverflowException() {
		super("Estouro de Pilha!");
	}
}
