package mercadodecontas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import mercadodecontas.model.enums.Status;
import mercadodecontas.model.enums.TipoFatoFinanceiro;

@Entity
public class FatoFinanceiro extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Date data;
	private Pessoa responsavel;
	private BigDecimal valor;
	private Status status;
	private TipoFatoFinanceiro tipoFatoFinanceiro;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public TipoFatoFinanceiro getTipoFatoFinanceiro() {
		return tipoFatoFinanceiro;
	}

	public void setTipoFatoFinanceiro(TipoFatoFinanceiro tipoFatoFinanceiro) {
		this.tipoFatoFinanceiro = tipoFatoFinanceiro;
	}

	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
