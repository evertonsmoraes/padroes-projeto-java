package subsistema2.cep;
/**
 * <h1>Cep Api</h1>
 * Classe utilizando Padrão Esturural ("Facade")
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Mogi";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
