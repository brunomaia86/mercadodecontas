package mercadodecontas.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import mercadodecontas.model.FatoFinanceiro;

@RequestScoped
@Named
public class CadastroFatoFinanceiroBean implements Serializable {

	private static final long serialVersionUID = -7476328032330398810L;

	private FatoFinanceiro fatoFinanceiro = new FatoFinanceiro();
	private List<FatoFinanceiro> listaFatosFinanceiros = new ArrayList<>();

	public void salvar() {
		listaFatosFinanceiros.add(fatoFinanceiro);
	}

	public FatoFinanceiro getFatoFinanceiro() {
		return fatoFinanceiro;
	}

	public void setFatoFinanceiro(FatoFinanceiro fatoFinanceiro) {
		this.fatoFinanceiro = fatoFinanceiro;
	}

	public List<FatoFinanceiro> getListaFatosFinanceiros() {
		return listaFatosFinanceiros;
	}

	public void setListaFatosFinanceiros(List<FatoFinanceiro> listaFatosFinanceiros) {
		this.listaFatosFinanceiros = listaFatosFinanceiros;
	}

}
