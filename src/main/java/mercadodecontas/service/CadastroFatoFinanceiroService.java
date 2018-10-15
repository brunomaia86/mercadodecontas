package mercadodecontas.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mercadodecontas.model.FatoFinanceiro;

public class CadastroFatoFinanceiroService implements Serializable {

	private static final long serialVersionUID = 4550154354088460120L;

	private List<FatoFinanceiro> listaFatosFinanceiros = new ArrayList<>();

	public List<FatoFinanceiro> getListaFatosFinanceiros() {
		return listaFatosFinanceiros;
	}

	public void setListaFatosFinanceiros(List<FatoFinanceiro> listaFatosFinanceiros) {
		this.listaFatosFinanceiros = listaFatosFinanceiros;
	}

}
