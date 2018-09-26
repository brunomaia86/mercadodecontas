package mercadodecontas.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import mercadodecontas.model.FatoFinanceiro;

@Stateless
public class CadastroFatoFinanceiroDAO extends CrudDao<FatoFinanceiro, Long> {

	private static final long serialVersionUID = -4400316965873859659L;

	List<FatoFinanceiro> listaFatosFinanceiros;
	
	@PostConstruct
	public void init() {
		
	}
	
	public List<FatoFinanceiro> buscarTodos() {
		
	}
}
