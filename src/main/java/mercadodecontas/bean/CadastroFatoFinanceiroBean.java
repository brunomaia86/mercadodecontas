package mercadodecontas.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import mercadodecontas.model.FatoFinanceiro;
import mercadodecontas.service.CadastroFatoFinanceiroService;

@Named
@SessionScoped
public class CadastroFatoFinanceiroBean implements Serializable {

	private static final long serialVersionUID = -7476328032330398810L;

	@Inject
	private CadastroFatoFinanceiroService cadastroFatoFinanceiroService;
	
	private FatoFinanceiro fatoFinanceiro = new FatoFinanceiro();

	public String cadastrar() {
		fatoFinanceiro = new FatoFinanceiro();
		cadastroFatoFinanceiroService.
			getListaFatosFinanceiros().add(fatoFinanceiro);
		
		return "financeiro/pesquisarRegistroFinanceiro.xhtml?faces-redirect=true";
	}

	public FatoFinanceiro getFatoFinanceiro() {
		return fatoFinanceiro;
	}

	public void setFatoFinanceiro(FatoFinanceiro fatoFinanceiro) {
		this.fatoFinanceiro = fatoFinanceiro;
	}

}
