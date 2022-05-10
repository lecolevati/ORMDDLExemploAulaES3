package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "chapa")
public class Chapa {

	@Id
	@Column(name = "codigo_chapa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int codigo;
	
	@Column(name = "nome_chapa", length = 100)
	@NotNull
	private String nome;
	
	@Column(name = "dt_registro")
	@NotNull
	private LocalDate dtRegistro;
	
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
	public LocalDate getDtRegistro() {
		return dtRegistro;
	}
	public void setDtRegistro(LocalDate dtRegistro) {
		this.dtRegistro = dtRegistro;
	}
	
	@Override
	public String toString() {
		return "Chapa [codigo=" + codigo + ", nome=" + nome + ", dtRegistro=" + dtRegistro + "]";
	}
	
}
