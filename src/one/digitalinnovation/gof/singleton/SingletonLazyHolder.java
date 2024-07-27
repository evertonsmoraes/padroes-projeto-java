package one.digitalinnovation.gof.singleton;

/**
 * <h1> Singleton "Lazy Holder". </h1>
 * Classe utilizando Padrão Criacional ("Singleton")
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
