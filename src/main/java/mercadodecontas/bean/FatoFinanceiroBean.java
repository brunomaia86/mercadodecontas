package mercadodecontas.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import mercadodecontas.model.FatoFinanceiro;
import mercadodecontas.service.FatoFinanceiroService;

@Named
@RequestScoped
public class FatoFinanceiroBean implements Serializable {

	private static final long serialVersionUID = -6221646242159618869L;

	@Inject
	private FatoFinanceiroService fatoFinanceiroService;
	
	private FatoFinanceiro fatoFinanceiro = new FatoFinanceiro();
	
	public void cadastrar() {
		fatoFinanceiroService.
			getListaFatosFinanceiros().add(fatoFinanceiro);
		fatoFinanceiro = new FatoFinanceiro();
	}
	
	public FatoFinanceiro getFatoFinanceiro() {
		return fatoFinanceiro;
	}

	public void setFatoFinanceiro(FatoFinanceiro fatoFinanceiro) {
		this.fatoFinanceiro = fatoFinanceiro;
	}


	public FatoFinanceiroService getFatoFinanceiroService() {
		return fatoFinanceiroService;
	}

	public void setFatoFinanceiroService(FatoFinanceiroService fatoFinanceiroService) {
		this.fatoFinanceiroService = fatoFinanceiroService;
	}

}
