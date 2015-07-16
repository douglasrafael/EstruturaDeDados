package br.edu.uepb.estruturas.pilha;

/**
 * Representa a exceção do tipo underflow.
 * 
 * @author Douglas Rafael
 */
public class StackUnderflowException extends Exception {
	private static final long serialVersionUID = -944712816097678007L;

	/**
	 * Contrutor. Seta mensagem padrão para a super classe:
	 * "Estouro Negativo de Pilha!"
	 */
	public StackUnderflowException() {
		super("Estouro Negativo de Pilha!");
	}
}
