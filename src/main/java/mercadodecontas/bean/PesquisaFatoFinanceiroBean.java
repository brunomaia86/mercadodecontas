package mercadodecontas.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import mercadodecontas.model.FatoFinanceiro;

@ViewScoped
@Named
public class PesquisaFatoFinanceiroBean implements Serializable {

	private static final long serialVersionUID = -6221646242159618869L;

	private FatoFinanceiro fatoFinanceiro = new FatoFinanceiro();
	private List<FatoFinanceiro> listaFatosFinanceiros = new ArrayList<>();

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
