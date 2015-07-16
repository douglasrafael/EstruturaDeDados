package br.edu.uepb.estruturas.fila;

/**
 * Representa exceção do tipo overflow.
 * 
 * @author Douglas Rafael
 */
public class QueueOverflowException extends Exception {
	private static final long serialVersionUID = -1270253413173416359L;

	/**
	 * Construtor. Seta mensagem padrão para a super classe:
	 * "Fila cheia!"
	 * 
	 */
	public QueueOverflowException() {
		super("Fila cheia!");
	}
}
