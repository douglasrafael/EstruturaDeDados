package br.edu.uepb.estruturas.fila;

/**
 * Representa exceção do tipo underflow.
 *  
 * @author Douglas Rafael
 */
public class QueueUndeflowException extends Exception {
	private static final long serialVersionUID = -2458128370488940939L;

	/**
	 * Contrutor. Seta mensagem padrão para a super classe:
	 * "Fila vazia!"
	 * 
	 */
	public QueueUndeflowException() {
		super("Fila vazia!");
	}
}
