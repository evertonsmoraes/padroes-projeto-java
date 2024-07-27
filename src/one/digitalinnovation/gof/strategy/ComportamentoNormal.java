package one.digitalinnovation.gof.strategy;
/**
 * <h1>Comportamento Normal</h1>
 * Classe utilizando Padrão Comportamental ("Strategy"), implementado interface "Comportamento"
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}

}
