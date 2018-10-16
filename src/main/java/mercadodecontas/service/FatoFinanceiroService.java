package mercadodecontas.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import mercadodecontas.model.FatoFinanceiro;
import mercadodecontas.model.Pessoa;
import mercadodecontas.model.enums.Status;
import mercadodecontas.model.enums.TipoFatoFinanceiro;

@ApplicationScoped
public class FatoFinanceiroService implements Serializable {

	private static final long serialVersionUID = 4550154354088460120L;

	private List<FatoFinanceiro> listaFatosFinanceiros = new ArrayList<>();
	
	public FatoFinanceiroService() {
		Pessoa bruno = new Pessoa();
		bruno.setNome("Bruno Maia");
		bruno.setLogin("brunomaia86");
		bruno.setEmail("brunomaia86@gmail.com");
		bruno.setCpf("97327216320");
		
		
		FatoFinanceiro fato = new FatoFinanceiro();
		fato.setData(new Date());
		fato.setResponsavel(bruno);
		fato.setStatus(Status.EFETUADO);
		fato.setTipoFatoFinanceiro(TipoFatoFinanceiro.PROVENTO);
		
		listaFatosFinanceiros.add(fato);
	}

	public List<FatoFinanceiro> getListaFatosFinanceiros() {
		return listaFatosFinanceiros;
	}

	public void setListaFatosFinanceiros(List<FatoFinanceiro> listaFatosFinanceiros) {
		this.listaFatosFinanceiros = listaFatosFinanceiros;
	}

}
