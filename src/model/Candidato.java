package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "candidato")
public class Candidato {

	@Id
	@Column(name = "codigo_candidato")
	@NotNull
	private int codigo;
	
	@Column(name = "nome_candidato", length = 200)
	@NotNull
	private String nome;
	
	@ManyToOne(targetEntity = Cargo.class)
	@JoinColumn(name = "codigo_cargo")
	@NotNull
	private Cargo cargo;

	@ManyToOne(targetEntity = Cargo.class)
	@JoinColumn(name = "codigo_chapa")
	@NotNull
	private Chapa chapa;
	
	@Column(name = "votos_recebidos")
	@NotNull
	private int votosRecebidos;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Chapa getChapa() {
		return chapa;
	}
	public void setChapa(Chapa chapa) {
		this.chapa = chapa;
	}
	public int getVotosRecebidos() {
		return votosRecebidos;
	}
	public void setVotosRecebidos(int votosRecebidos) {
		this.votosRecebidos = votosRecebidos;
	}
	
	@Override
	public String toString() {
		return "Candidato [codigo=" + codigo + ", nome=" + nome + ", cargo=" + cargo + ", chapa=" + chapa
				+ ", votosRecebidos=" + votosRecebidos + "]";
	}
	
}
