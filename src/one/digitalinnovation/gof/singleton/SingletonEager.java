package one.digitalinnovation.gof.singleton;

/**
 * <h1> Singleton "apressado". </h1>
 * Classe utilizando Padrão Criacional ("Singleton")
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
