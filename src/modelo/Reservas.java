package modelo;

import java.sql.Date;

public class Reservas {
	
	private Integer id;
	private Date DataEntrada;
	private Date DataSaida;
	private Integer Valor;
	private String FormaPagamento;
	
	
	
	public Reservas(Date dataEntrada, Date dataSaida, Integer valor, String formaPagamento) {
		super();
		DataEntrada = dataEntrada;
		DataSaida = dataSaida;
		Valor = valor;
		FormaPagamento = formaPagamento;
	}
	
	
	
	public Reservas(Integer id, Date dataEntrada, Date dataSaida, Integer valor, String formaPagamento) {
		super();
		this.id = id;
		DataEntrada = dataEntrada;
		DataSaida = dataSaida;
		Valor = valor;
		FormaPagamento = formaPagamento;
	}



	



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataEntrada() {
		return DataEntrada;
	}
	public Date getDataSaida() {
		return DataSaida;
	}
	public Integer getValor() {
		return Valor;
	}
	public void setValor(Integer id) {
		this.id = id + 150;
	}
	public String getFormaPagamento() {
		return FormaPagamento;
	}
	
//	
	
	
	

}
