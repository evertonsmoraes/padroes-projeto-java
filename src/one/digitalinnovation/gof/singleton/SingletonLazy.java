package one.digitalinnovation.gof.singleton;

/**
 * <h1> Singleton "preguiçoso". </h1>
 * Classe utilizando Padrão Criacional ("Singleton")
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
