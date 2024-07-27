package one.digitalinnovation.gof.strategy;
/**
 * <h1>Comportamento Agressivo</h1>
 * Classe utilizando Padrão Comportamental ("Strategy"), implementado interface "Comportamento"
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}

}
