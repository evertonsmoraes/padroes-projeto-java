package one.digitalinnovation.gof.strategy;
/**
 * <h1> Strategy "Robô". </h1>
 * Classe utilizando Padrão Criacional "Strategy" 
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
