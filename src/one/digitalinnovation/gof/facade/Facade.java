package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;
/**
 * <h1>Crm Service</h1>
 * Classe utilizando Padrão Esturural ("Facade"), importando "CrmService" e "CepApi"
 * 
 * @author  Everton Moraes
 * @version 1.0
 * @since   26/07/2024
 */
public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
