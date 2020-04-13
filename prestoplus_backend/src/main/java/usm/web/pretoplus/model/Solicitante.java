package usm.web.pretoplus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solicitante {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long IdSolicitante;
	
	private String nomeSolicitante;
	private String Email;
	private int phone;
	private String datanas;
	

	//Construtores
	
	
	
	public Solicitante(long idSolicitante, String nomeSolicitante, String email, int phone) {
		super();
		this.IdSolicitante = idSolicitante;
		this.nomeSolicitante = nomeSolicitante;
		this.Email = email;
		this.phone = phone;
	}
	public Solicitante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
	

	public long getIdSolicitante() {
		return IdSolicitante;
	}
	public void setIdSolicitante(long idSolicitante) {
		IdSolicitante = idSolicitante;
	}
	public String getNomeSolicitante() {
		return nomeSolicitante;
	}
	public void setNomeSolicitante(String NomeSolicitante) {
		this.nomeSolicitante = NomeSolicitante;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDatanas() {
		return datanas;
	}
	public void setDtanas(String datanas) {
		this.datanas = datanas;
	}
	
	
	
	
	
}
