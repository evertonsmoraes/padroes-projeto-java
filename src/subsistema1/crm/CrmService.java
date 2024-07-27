package subsistema1.crm;
/**
 * <h1>Crm Service</h1>
 * Classe utilizando Padrão Esturural ("Facade")
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
