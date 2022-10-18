package modelo;

import java.util.Date;

public class Hospedes {
	private Integer id;
	private String nome;
	private String sobreNome;
	private Date dataNascimento;
	private String nacionalidade;
	private String telefone;
	private Integer idReserva;
	public Hospedes(Integer id, String nome, String sobreNome, Date dataNascimento, String nacionalidade,
			String telefone, Integer idReserva) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
		this.idReserva = idReserva;
	}
	public Hospedes(String nome, String sobreNome, Date dataNascimento, String nacionalidade, String telefone) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	
}
