package mercadodecontas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mercadodecontas.model.enums.Status;
import mercadodecontas.model.enums.TipoFatoFinanceiro;

@Entity
@Table(name = "tb_fato_financeiro")
public class FatoFinanceiro extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id", nullable = false)
	private Pessoa responsavel;
	
	@Column(nullable = true)
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = true, length = 15)
	private Status status;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = true, length = 12)
	private TipoFatoFinanceiro tipoFatoFinanceiro;
	
	@Column(nullable = true)
	private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
