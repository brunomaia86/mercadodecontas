package mercadodecontas.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import mercadodecontas.model.FatoFinanceiro;
import mercadodecontas.service.FatoFinanceiroService;

@Named
@RequestScoped
public class CadastroFatoFinanceiroBean implements Serializable {

	private static final long serialVersionUID = -7476328032330398810L;

	@Inject
	private FatoFinanceiroService cadastroFatoFinanceiroService;
	
	private FatoFinanceiro fatoFinanceiro = new FatoFinanceiro();

	public String cadastrar() {
		fatoFinanceiro = new FatoFinanceiro();
		cadastroFatoFinanceiroService.
			getListaFatosFinanceiros().add(fatoFinanceiro);
		
		return "pesquisarRegistroFinanceiro.xhtml";
	}

	public FatoFinanceiro getFatoFinanceiro() {
		return fatoFinanceiro;
	}

	public void setFatoFinanceiro(FatoFinanceiro fatoFinanceiro) {
		this.fatoFinanceiro = fatoFinanceiro;
	}

}
